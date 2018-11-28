package com.zjx.finance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjx.finance.entity.User;

@RestController
@RequestMapping("/users")
public class SpringJDBCController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SpringJDBCController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public List<User> queryUsers() {
        // 查询所有用户
        String sql = "select * from user";
        List<User> list=jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(User.class));
        //logger.info("查询结果："+list);
        return list;
    }

    @GetMapping("/{userid}")
    public User getUser(@PathVariable int id) {
        // 根据主键ID查询
        String sql = "select * from user where userid = ?";
        User user=jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
        logger.info("查询结果："+user);
        return user;
    }

    @DeleteMapping("/{userid}")
    public int delUser(@PathVariable int id) {
        // 根据主键ID删除用户信息
        String sql = "DELETE FROM user WHERE userid = ?";
        int result=jdbcTemplate.update(sql, id);
        return result;
    }

/*    @PostMapping
    public int addUser(@RequestBody User user) {
        // 添加用户
        String sql = "insert into t_user(username, password) values(?, ?)";
        return jdbcTemplate.update(sql, user.getUserName(), user.getPassword());
    }*/


    @PutMapping("/{userid}")
    public int editUser(@PathVariable int id, @RequestBody User user) {
        // 根据主键ID修改用户信息
        String sql = "UPDATE user SET username = ? ,password = ? WHERE userid = ?";
        int result=jdbcTemplate.update(sql, user.getUserName(), user.getPassword(), id);
        return result;
    }
}
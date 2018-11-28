package com.zjx.finance.entity;


public class User {
/***
 * 用户信息，对应用户表user
 */
	private int userId;
	private String userName;
	private String password;
	private String blogName;
	private String blogSign;
	private String lastLogin;
	private int flag;
	private String name;
	private String sex;
	private String province;
	private String city;
	private String address;
	private String birthday;
	private String email;
	private String tel;
	private String regTime;
	private String profile;
	private String area;
	
	//权限id
	private int authorityid;
	
	private String authority;
	
	
	
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public int getAuthorityid() {
		return authorityid;
	}
	public void setAuthorityid(int authorityid) {
		this.authorityid = authorityid;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogSign() {
		return blogSign;
	}
	public void setBlogSign(String blogSign) {
		this.blogSign = blogSign;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", blogName=" + blogName
				+ ", blogSign=" + blogSign + ", lastLogin=" + lastLogin + ", flag=" + flag + ", name=" + name + ", sex="
				+ sex + ", province=" + province + ", city=" + city + ", address=" + address + ", birthday=" + birthday
				+ ", email=" + email + ", tel=" + tel + ", regTime=" + regTime + ", profile=" + profile + ", area="
				+ area + ", authorityid=" + authorityid + ", authority=" + authority + "]";
	}
	
}

package com.zjx.finance.file.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/fileUpload")
	public String fileUpload() {
		logger.info("------------ FileUpload ------------");
		return "/file/fileUpload";
	}  
	
	@RequestMapping("/fileUploadSuccess")
	public String uploadSuccess() {
		return "/file/success";
	}
	
	@RequestMapping("/upload")
	public String upload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getContentLength() > 0) {            
            InputStream inputStream = null;
            FileOutputStream outputStream = null;               
         try {                
             inputStream = request.getInputStream();
             // 给新文件拼上时间毫秒，防止重名
             long now = System.currentTimeMillis();
             File file = new File("E:/zhongjx/fileUpload/", "file-" + now + ".txt");
             file.createNewFile();
             
             outputStream = new FileOutputStream(file);
             
             byte temp[] = new byte[1024];
             int size = -1;
             while ((size = inputStream.read(temp)) != -1) { // 每次读取1KB，直至读完
                 outputStream.write(temp, 0, size);
             }                
         } catch (IOException e) {
        	 logger.info("------------ FileUploadfail ------------");
         } finally {
             outputStream.close();
             inputStream.close();
         }
     }        
		logger.info("------------ FileUploadsuccess------------");
 	return null;
 }    
	
	}


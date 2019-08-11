package com.example.mangodemo.admin.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;

@RestController
public class SysLoginController {
	@Autowired
	
	private Producer producer;
	
	@GetMapping("captchar.jpg")
	public void captcha(HttpServletResponse response,HttpServletRequest request) throws IOException {
		response.setHeader("Cache-Control", "no-store,no-cache");
		response.setContentType("image/jpg");
		String text = producer.createText();
		BufferedImage image = producer.createImage(text);
		request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY,text);
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(image, "jpg", out);
		IOUtils.closeQuietly(out);
	}
	
}

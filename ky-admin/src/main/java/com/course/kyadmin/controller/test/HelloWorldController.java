package com.course.kyadmin.controller.test;

import org.springframework.web.bind.annotation.*;

/**
 * httpclient-cient测试类
 *
 * @author wangmeng
 * @since 2020-3-26
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping("/get")
	public String get() throws InterruptedException {
		return "get无参请求成功";
	}

	@GetMapping("/getWithParam")
	public String getWithParam(@RequestParam String message) {
		return "get带参请求成功,参数message: " + message;
	}

	@PostMapping("/post")
	public String post(@RequestHeader("User-Agent") String userAgent,
                       @RequestHeader("Accept") String accept,
                       @RequestHeader("Accept-Language") String acceptLanguage,
                       @RequestHeader("Accept-Encoding") String acceptEncoding,
                       @RequestHeader("Cookie") String cookie,
                       @RequestHeader("Connection") String conn) {
		// 打印请求头信息
		System.out.println("Cookie = " + cookie);
		System.out.println("Connection = " + conn);
		System.out.println("Accept = " + accept);
		System.out.println("Accept-Language = " + acceptLanguage);
		System.out.println("Accept-Encoding = " + acceptEncoding);
		System.out.println("User-Agent = " + userAgent);
		
		return "post无参请求成功";
	}

	@PostMapping("/postWithParam")
	public String postWithParam(@RequestParam String code, @RequestParam String message) {
		return "post带参请求成功,参数code: " + code + ",参数message: " + message;
	}

}

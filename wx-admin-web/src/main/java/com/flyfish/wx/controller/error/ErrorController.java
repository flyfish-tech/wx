package com.flyfish.wx.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerExceptionResolver;

/**
 * 
 * @author 824785559@qq.com its a error common controller its will forward
 *         define page when execute a error
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
	@RequestMapping("/error404")
	public String error404() {
		return "error/error404";
	}

	@RequestMapping("/error500")
	public String error500() {
		HandlerExceptionResolver  h = null;

		return "error/error500";
	}
}

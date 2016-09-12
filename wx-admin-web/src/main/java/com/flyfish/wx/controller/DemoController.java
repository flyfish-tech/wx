package com.flyfish.wx.controller;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {
	
//	@Autowired
//	PreferencesPlaceholderConfigurer propertyConfigurer;	
//	
//	@Autowired
//	PropertiesFactoryBean configProperties;
	
	@RequestMapping("/demo")
	public String initPage(String demoName,ModelMap model) throws IOException{
//		Properties prop = configProperties.getObject();
		model.put("demoName", demoName);
		return "demoPage";
	}
}

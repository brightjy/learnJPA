package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value="/home")
	public String home() {
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping("/valueTest")
	public String valueTest() {
		String value = "테스트 String";
		return value;
	}
	
	@RequestMapping("/test")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "박지영");
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		
		mav.addObject("list", testList);
		return mav;
	}
	
	@RequestMapping("/thymeleafTest")
	public String thymeleafTest(Model model) {
		TestVO testModel = new TestVO("bbarkji", "박지영");
		model.addAttribute("testModel", testModel);
		return "thymeleaf/thymeleafTest";
	}
	
}

package com.example.demo.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.test.service.TestService;
import com.example.demo.test.vo.TestVO;

@Controller
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	TestService testService;
	
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
	
	@RequestMapping(value="/test")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test");
		/*mav.addObject("name", "박지영");
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");*/
		
		logger.trace("trace level");
		logger.debug("debug level");
		logger.info("info level");
		logger.warn("warn level");
		logger.error("error level");
		
		List<TestVO> testList = testService.selectTest();
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

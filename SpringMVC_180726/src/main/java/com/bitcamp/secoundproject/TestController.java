package com.bitcamp.secoundproject;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/index/hello")
	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView();
		
		// view 이름을 지정
		modelAndView.setViewName("hello");
		
		// 결과 데이터 저장
		modelAndView.addObject("greeting", getGreeting());

		return modelAndView;

	}

	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 10) {
			return "좋은 아침입니다.";
		} else if (hour >= 11 && hour <= 15) {
			return "점심 식사는 하셨나요?";
		} else if (hour >= 18 && hour <= 22) {
			return "좋은 밤 되세요";
		}
		return "안녕하세요";
	}

}
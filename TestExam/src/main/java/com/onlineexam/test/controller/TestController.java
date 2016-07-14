/**
 * Online Exam Project
 * This is a trial project for conducting online tests for bank exam preparations.
 * 
 */
package com.onlineexam.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlineexam.test.question.bean.Question;
import com.onlineexam.test.question.service.QuestionService;
import com.onlineexam.test.user.bean.User;

/**
 * @author Dhiraj Khot
 *
 */

@Controller
public class TestController {

	String message = "Welcome to Bank Exam";

	@Autowired
	private QuestionService questionService;
	
	private Integer MAX_QUESTION_NUMBER = 2;
	private Integer MIN_QUESTION_NUMBER = 1;


	@RequestMapping(value = "/", method=RequestMethod.GET)
	public ModelAndView login(){
		System.out.println("In Login() Get");
		return new ModelAndView("login","loginForm",new User());
	}
	@RequestMapping(value = "/postLogin", method=RequestMethod.POST)
	public String postLogin(@ModelAttribute("loginForm") User user, ModelMap model){
		System.out.println("User Name: "+ user.getUserName());
		System.out.println("Password " + user.getPassword());
		model.addAttribute("name", user.getUserName());
		return "studentHome";
	}
	
	@RequestMapping("/startExam")
	public ModelAndView startExam(@RequestParam(value = "name", required = false, defaultValue = "Test") String name,
			@RequestParam(value = "Option", required = false) String optionChoosed,
			@RequestParam(value = "questionNumber", required = false, defaultValue = "1") Integer questionNumber) {
		System.out.println("In showMessage TestController: QuestionNumber - " + questionNumber + "Option choosed - " + optionChoosed);
		ModelAndView mv = new ModelAndView("onlineexam");
		System.out.println(name);
		if (questionNumber < MIN_QUESTION_NUMBER) {
			questionNumber = MIN_QUESTION_NUMBER;
		} else if (questionNumber > MAX_QUESTION_NUMBER) {
			questionNumber = MAX_QUESTION_NUMBER;
		}
		Question question = questionService.get(questionNumber);
		mv.addObject("question", question);
		mv.addObject("message", message);
		mv.addObject("questionNumber", questionNumber);
		mv.addObject("maxQuestionNumber", MAX_QUESTION_NUMBER);
		mv.addObject("minQuestionNumber", MIN_QUESTION_NUMBER);
		mv.addObject("name", name);
		return mv;
	}
}

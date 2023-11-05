package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OneController {

	//一覧表示用
	@RequestMapping(path = "/one", method = RequestMethod.GET)
	public String viewPage() {

		return "one";
	}
}
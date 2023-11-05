package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TwoController {

	@RequestMapping(path = "/two", method = RequestMethod.GET)
	public String onePage() {

		return "two";
	}
}
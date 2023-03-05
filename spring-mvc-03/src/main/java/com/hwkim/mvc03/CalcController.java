package com.hwkim.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
	@RequestMapping("/simple_calc")
	public String simple_calc() {
		
		
		return "simple_calc";
	}
	
	@RequestMapping("/action_calc")
	public String action_calc(
			Model model,
			@RequestParam int n1,
			@RequestParam int n2,
			@RequestParam String op			
			) {
		double result = 0;
		if(op.equals("+")) {
			result = n1 + n2;
		}else if(op.equals("-")) {
			result = n1 - n2;
		}else if(op.equals("*")) {
			result = n1 * n2;
		}else if(op.equals("/")){
			result = 1.0*n1 / n2;
		}
		model.addAttribute("msg", n1+op+n2+"="+result);
		return "action_calc";
	}
}

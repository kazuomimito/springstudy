package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		ArrayList<String[]>customers = new ArrayList<String[]>();
		customers.add(new String[]{"佐藤HTML太郎","35歳","男性","千葉"});
		customers.add(new String[]{"鈴木Java五郎","24歳","男性","千葉"});
		customers.add(new String[]{"高橋CSS子","29歳","女性","滋賀"});
		customers.add(new String[]{"武田CSS子","29歳","女性","滋賀"});
		customers.add(new String[]{"山田CSS子","29歳","女性","滋賀"});
		mv.addObject("customers",customers);
		mv.setViewName("index");
		return mv;
	}
}
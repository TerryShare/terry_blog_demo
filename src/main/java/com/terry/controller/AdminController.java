package com.terry.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.terry.vo.Menu;

/**
 * admins 控制器
 */
@Controller
@RequestMapping("/admins")
public class AdminController {

	/**
	 * 获取后台管理主页面
	 * @return
	 */
	
	@GetMapping("/user")
	public ModelAndView listUsers(Model model) {
		List<Menu> list =new ArrayList<>();
		list.add(new Menu("用户管理", "/users"));
		model.addAttribute("list", list);	
		return new ModelAndView("admins/user", "model", model);
	}
	
	@GetMapping("/blog")
	public ModelAndView listBlog(Model model) {
		List<Menu> list =new ArrayList<>();
		model.addAttribute("", "");
		return new ModelAndView("admins/blog","model",model);
	}
	
	
	@GetMapping("/")
	public ModelAndView list(Model model) {
		List<Menu> list =new ArrayList<>();
		model.addAttribute("", "");
		return new ModelAndView("admins/","model",model);
	}
	
}

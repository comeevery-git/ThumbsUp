package com.boot.my.MyProject.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.my.MyProject.Admin.AdminEntity;
import com.boot.my.MyProject.Admin.AdminService;

@Controller
@RequestMapping("/login")
public class LoginController {
 
	@Autowired
	private AdminService adminService;
	
	/*
	 * 직원 로그인
	 */
    @GetMapping("/admin_login")
    public String main(Model model) {
    	return "login/admin_login";
    }

    
    /*
     * 직원가입
     */
    @GetMapping("/admin_register")
    public String admin_register(Model model) {
    	return "login/admin_register";
    }
    
    /*
     * 비밀번호 찾기
     */
    @GetMapping("/admin_forget_pwd")
    public String admin_forget_pwd(Model model) {
    	return "login/admin_forget_pwd";
    }
    
}

package com.boot.my.MyProject.Login;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.my.MyProject.Admin.AdminEntity;
import com.boot.my.MyProject.Admin.AdminRepository;
import com.boot.my.MyProject.Admin.AdminService;

@Controller
@RequestMapping("/login")
public class LoginController {
 
	@Autowired
	private AdminService adminService;
	@Autowired
	private AdminRepository adminRepository;
	
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
    @PostMapping("/adminInsert")
    public Response adminInsert(@RequestBody AdminEntity admin) {
    	Response response = new Response();
    	try {
    		adminService.adminRegister(admin);
    		//response.setResponse("success");
    		response.setMessage("직원이 등록되었습니다.");
    	} catch(Exception e) {
    		//response.setResponse("failed");
    		response.setMessage("등록 중 오류가 발생하였습니다.");
    		//response.setData(e.toString());
    	}
    	System.out.println("response ::::: " +response);
    	return response;
    }
    
    
    
    
    /*
     * 비밀번호 찾기
     */
    @GetMapping("/admin_forget_pwd")
    public String admin_forget_pwd(Model model) {
    	return "login/admin_forget_pwd";
    }
    
}

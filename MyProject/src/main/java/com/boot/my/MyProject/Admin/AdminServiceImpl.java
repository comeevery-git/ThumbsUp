package com.boot.my.MyProject.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
    public void adminRegister(AdminEntity admin) {
        adminRepository.save(admin);
    }



	
}

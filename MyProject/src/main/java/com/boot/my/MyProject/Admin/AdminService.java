package com.boot.my.MyProject.Admin;

public interface AdminService {
	
	
	void adminRegister(AdminEntity admin);
	
	/*
	public AdminEntity getAdmin(Long admin_idx) {
		return adminRepo.findById(admin_idx).orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Not found board"));
		
	}
	*/
	
	
}

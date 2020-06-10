package com.boot.my.MyProject.Admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.my.MyProject.Common.RestException;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepo;
	
	public AdminEntity getAdmin(Long admin_idx) {
		return adminRepo.findById(admin_idx).orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Not found board"));
		
	}
	
	
	
}

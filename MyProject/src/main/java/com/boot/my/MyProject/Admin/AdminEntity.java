package com.boot.my.MyProject.Admin;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tu_admin")
@Getter
@Setter
public class AdminEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long admin_idx;

    // 관리자유형 
	@Column(length = 100)
    private String adminType;

    // 부서 
	@Column(length = 100)
    private String adminDepart;

    // 직급 
	@Column(length = 100)
    private String adminRank;

    // 아이디 
	@Column(length = 100)
    private String adminId;

    // 비밀번호 
	@Column(length = 255)
    private String adminPwd;

    // 이름 
	@Column(length = 100)
    private String adminNm;

    // 전화번호 
	@Column(length = 100)
    private String adminTel;

    // 생년월일 
    @Column(length = 100)
    private String adminRrno;

    // 성별 
    @Column(length = 100)
    private String adminGender;

    // 대표 이미지 
    @Column(length = 100)
    private Integer adminImg;

    // 사용유무 
    @Column(length = 100)
    private String adminUseyn;

    // 탈퇴유무 
    @Column(length = 100)
    private String adminDelyn;

    // 등록일 
    @Column(length = 100)
    private Timestamp adminRegdate;

    // 수정일 
    private Timestamp adminUpddate;

    // 권한 
    @Column(length = 100)
    private String adminGrant;
	
}

package com.boot.my.MyProject.Board;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "tu_board")
@Getter
@Setter
public class BoardEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long board_idx;
	
	@Column(length = 100)
	private String board_title;
	
	@Column(length = 400)
	private String board_contents;
	
	
}

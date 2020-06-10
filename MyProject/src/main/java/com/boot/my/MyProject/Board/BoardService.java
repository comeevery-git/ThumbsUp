package com.boot.my.MyProject.Board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.boot.my.MyProject.Common.RestException;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepo;
	
	public BoardEntity getBoard(Long board_idx) {
		return boardRepo.findById(board_idx).orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Not found board"));
		
	}

	public List<BoardEntity> findAll() {
		List<BoardEntity> list = boardRepo.findAll();
		return list;
	}
	

		
	
}

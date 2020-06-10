package com.boot.my.MyProject.Board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
	
    @Query("SELECT board_contents FROM BoardEntity")
    public List<BoardEntity> findAll();
    
	//findBy뒤에 컬럼명을 붙여주면 이를 이용한 검색이 가능하다
	//public List<BoardEntity> findById(String board_title);
	//public List<BoardEntity> findByName(String board_contents);
	//like검색도 가능
	//public List<MemberVo> findByNameLike(String keyword);

	
}

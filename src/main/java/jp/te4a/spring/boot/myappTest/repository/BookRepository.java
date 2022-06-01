package jp.te4a.spring.boot.myappTest.repository;


import java.util.List;
import org.springframework.stereotype.Repository;

import jp.te4a.spring.boot.myappTest.bean.BookBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface BookRepository extends JpaRepository<BookBean, Integer>{
	@Query("SELECT X FROM BookBean X ORDER BY X.title")
	List<BookBean> findAllOrderByTitle();
}



package jp.te4a.spring.boot.myappTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.te4a.spring.boot.myappTest.bean.UserBean;

public interface UserRepository extends JpaRepository<UserBean, String>{
}


package com.huan.repository;

import com.huan.bean.User;
import org.springframework.data.repository.CrudRepository;

/**
 * 1/ 查询方法 以 get | find | read 开头.
 * 2/ 涉及查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写。
 */
public interface UserRepository extends CrudRepository<User, Integer> {
/*
       public User save(User user);*/

  /*  User findByName(String username);*/

   /* User findByNameAndAge(String name, Integer age);*/
/*
    @Query("from User u where u.username=:name")
    User findUser(@Param("username") String name);*/
}

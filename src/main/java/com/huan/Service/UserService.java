package com.huan.Service;

import com.huan.bean.User;
import com.huan.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Hs on 2017/5/30.
 */

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    /**
     * save,update ,delete 方法需要绑定事务.
     *
     * 使用@Transactional进行事务的绑定.
     *
     * @param user
     */

    @Transactional
    public void save(User user){
        userRepository.save(user);
    }


  /*  //删除数据
    @Transactional
    public void delete(int id){
        userRepository.delete(id);
    }*/

    //查询数据
    public Iterable<User> getAll(){
        return userRepository.findAll();
    }




}

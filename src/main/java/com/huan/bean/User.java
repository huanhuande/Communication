package com.huan.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**创建了一个实体类。
 *
 * 如何持久化呢？
 *
 * 1、使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 *
 * @Entity 注解的时候，会在数据库中生成对应的表结构信息。
 *
 *
 * 如何指定主键以及主键的生成策略？
 *
 * 2、使用@Id指定主键.
 * Created by Hs on 2017/5/30.
 */
@Entity
public class User {

    /**
     * 使用@Id指定主键.
     *
     * 使用代码@GeneratedValue(strategy=GenerationType.AUTO)
     * 指定主键的生成策略，mysql默认的是自增长。
     *
     */
    @Id @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author nguyenvanbien
 */
public class Account {

    private int userId;
    private String username;
    private String password;
    private String fullname;
    private Date birthday;
    private String address;
    private String phone;
    private String sex;
    private int levelSystem;

    public Account() {
    }

    public Account(int userId, String username, String password, String fullname, Date birthday, String address, String phone, String sex, int levelSystem) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
        this.levelSystem = levelSystem;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getLevelSystem() {
        return levelSystem;
    }

    public void setLevelSystem(int levelSystem) {
        this.levelSystem = levelSystem;
    }

    

}

package com.itdr.pojo;

import java.util.Date;

public class Users {
    private Integer id;
    private String userName;
    private String passWord;
    private String images;
    private Date birthDay;
    private String interest;
    private Integer phoneNumber;
    private Integer qq;
    private Integer status;
    private Date create_Time;
    private Date update_Time;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public Date getCreate_Time() {
        return create_Time;
    }

    public void setCreate_Time(Date create_Time) {
        this.create_Time = create_Time;
    }

    public Date getUpdate_Time() {
        return update_Time;
    }

    public void setUpdate_Time(Date update_Time) {
        this.update_Time = update_Time;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", images='" + images + '\'' +
                ", birthDay=" + birthDay +
                ", interest='" + interest + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", qq=" + qq +
                ", status=" + status +
                ", create_Time=" + create_Time +
                ", update_Time=" + update_Time +
                '}';
    }
}

package com.cykj.domeboot.entity;


public class TbUser {

  private int id;
  private String account;
  private String name;
  private String pwd;
  private String sex;
  private int integral;
  private String phone;
  private String email;
  private String state;
  private String regdate;
  private int levelId;

  private Level level;



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public int getIntegral() {
    return integral;
  }

  public void setIntegral(int integral) {
    this.integral = integral;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getRegdate() {
    return regdate;
  }

  public void setRegdate(String regdate) {
    this.regdate = regdate;
  }

  public int getLevelId() {
    return levelId;
  }

  public void setLevelId(int levelId) {
    this.levelId = levelId;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "id=" + id +
            ", account='" + account + '\'' +
            ", name='" + name + '\'' +
            ", pwd='" + pwd + '\'' +
            ", sex='" + sex + '\'' +
            ", integral=" + integral +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", state='" + state + '\'' +
            ", regdate='" + regdate + '\'' +
            ", levelId=" + levelId +
            ", level=" + level +
            '}';
  }
}

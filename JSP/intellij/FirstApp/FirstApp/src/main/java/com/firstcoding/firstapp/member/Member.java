package com.firstcoding.firstapp.member;

// Beans : 모든 변수는 private, 기본생성자 , getter / setter
//DTO, VO
public class Member {
    public Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    //id, pw, name
    private String id;
    private String pw;
    private String name;

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return this.id + "(" + this.name + ")";
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}

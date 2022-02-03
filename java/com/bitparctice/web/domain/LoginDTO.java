package com.bitparctice.web.domain;

/**
 * packageName: com.bitparctice.web.login
 * fileName        : LoginApp
 * author           : chohyungook
 * date               : 2022-01-26
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class LoginDTO {
    public static String MAIN_NAME = "LOGIN VER";
    private String id;
    private String pw;
    private String name;
    static String NAMING = "조현국";
    static String IDEA="abc";
    static String PASSWORD = "abc";

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getPw(){
        return pw;
    }
    public void setPw(String pw){
        this.pw=pw;
    }
    public String getName(){
        return name;
    }
    public void setName(String next){
        this.name=name;
    }
    public String getIDEA(){
        return IDEA;
    }
    public void setIDEA(){
        this.IDEA=IDEA;
    }
    public String getPASSWORD(){
        return PASSWORD;
    }
    public void setPASSWORD(){
        this.PASSWORD=PASSWORD;
    }
    public String getNAMING(){
        return NAMING;
    }
    public void setNAMING(){
        this.NAMING=NAMING;
    }


}

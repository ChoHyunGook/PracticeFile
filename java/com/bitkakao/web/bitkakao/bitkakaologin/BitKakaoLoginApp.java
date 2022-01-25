package com.bitkakao.web.bitkakao.bitkakaologin;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoLoginApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  아이디,패스워드,이름,생일을 입력받아 출력하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

public class BitKakaoLoginApp {
    String id= "";
    String pw= "";
    String name = "";
    int bir = 0;

    public String login(String id,String pw, String name, int bir){
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.bir=bir;

        return String.format("ID : %s PASSWORD : %s NAME : %s BIRTH : %d",
                this.id,this.pw,this.name,this.bir);

    }
}

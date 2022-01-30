package com.bitparctice.web.service;

import com.bitparctice.web.domain.LoginDTO;

/**
 * packageName: com.bitparctice.web.login
 * fileName        : LoginDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class LoginService {
    public String getLogin(LoginDTO login){

        String res = "";

        if (login.getId().equals(login.getIDEA())&&login.getPw().equals(login.getPASSWORD())&&login.getName().equals(login.getNAMING())) {
            res = String.format("로그인 성공");
        } else if (login.getId().equals(login.getIDEA())&&login.getPw().equals(login.getPASSWORD())){
            res =String.format(" ID %s 와 PASSWORD %s는 맞으나 사용자 %s가 아닙니다. 로그인 실패"
                    , login.getId(), login.getPw(), login.getName());
        }else if (login.getId().equals(login.getIDEA())&&login.getName().equals(login.getNAMING())){
            res = String.format("사용자 %s님의 ID %s는 맞으나 비밀번호가 틀립니다.로그인실패"
                    ,login.getName(),login.getId());
        }else if (login.getPw().equals(login.getPASSWORD())&&login.getName().equals(login.getNAMING())){
            res = String.format("사용자 %s님의 PASSWORD %s는 맞으나 아이디 %s가 틀립니다. 로그인실패"
                    ,login.getName(),login.getPw());
        }else if (login.getName().equals(login.getNAMING())){
            res = String.format("사용자 %s님의 아이디와 비밀번호가 틀립니다. 로그인실패",login.getName());
        }else if (login.getId().equals(login.getIDEA())){
            res = String.format("ID %s는 맞으나 사용자와 비밀번호가 틀립니다.로그인실패",login.getId());
        }else if (login.getPw().equals(login.getPASSWORD())){
            res = String.format("PASSWORD %s는 맞으나 사용자와 아이디가 틀립니다.로그인실패",login.getPw());
        }else {
            res = String.format("아이디 %s,비밀번호%s,사용자%s가 모두 틀립니다. 로그인실패!");
        }
        return res;
    }
}

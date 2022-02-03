package com.bitparctice.web.service;

import com.bitparctice.web.domain.ChangeDTO;

/**
 * packageName: com.bitparctice.web.service
 * fileName        : ChangeService
 * author           : chohyungook
 * date               : 2022-01-31
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-31         chohyungook        최초 생성
 */
public class ChangeService {
    public String getChange(ChangeDTO change){

        int res;
        res = change.getInput()-change.getCoffee();
        return String.format("거스름돈은 %d 입니다.",res);

        }
}

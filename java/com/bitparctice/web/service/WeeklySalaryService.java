package com.bitparctice.web.service;

import com.bitparctice.web.domain.WeeklySalaryDTO;

/**
 * packageName: com.bitparctice.web.service
 * fileName        : WeeklySalaryService
 * author           : chohyungook
 * date               : 2022-01-30
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-30         chohyungook        최초 생성
 */
public class WeeklySalaryService {
    public String getWeekSalary(WeeklySalaryDTO salary){
        int res;
        int res1;


        res = salary.getWork_hour()* salary.getTime_salary();
        res1=res* salary.getWork_day();

        return String.format("%s 님의 일급은 %d 이며 주급은 %d 입니다."
                ,salary.name,res,res1);
    }
}

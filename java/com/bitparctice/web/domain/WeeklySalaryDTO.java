package com.bitparctice.web.domain;

/**
 * packageName: com.bitparctice.web
 * fileName        : WeeklySalaryDTO
 * author           : chohyungook
 * date               : 2022-01-30
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-30         chohyungook        최초 생성
 */
public class WeeklySalaryDTO {
    public static String MAIN_NAME="WEEKLY SALARY CALC";
    public String name;
    public int work_hour;
    public int work_day;
    public int time_salary;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getWork_hour(){
        return work_hour;
    }
    public void setWork_hour(int work_hour){
        this.work_hour=work_hour;
    }
    public int getWork_day(){
        return work_day;
    }
    public void setWork_day(int work_day){
        this.work_day=work_day;
    }
    public int getTime_salary(){
        return getTime_salary();
    }
    public void setTime_salary(int time_salary){
        this.time_salary=time_salary;
    }
}

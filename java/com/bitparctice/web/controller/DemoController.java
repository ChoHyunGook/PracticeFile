package com.bitparctice.web.controller;

import com.bitparctice.web.domain.*;
import com.bitparctice.web.service.*;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.controller
 * fileName        : DemoController
 * author           : chohyungook
 * date               : 2022-01-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 */
public class DemoController {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        BmiDTO bmi=new BmiDTO();
        CalcDTO calc =new CalcDTO();
        WeeklySalaryDTO weeklySalary=new WeeklySalaryDTO();
        CircleAreaCalcDTO circleArea=new CircleAreaCalcDTO();
        GradeDTO grade=new GradeDTO();
        LoginDTO login=new LoginDTO();
        SearchDTO search=new SearchDTO();
        BmiService bmiService=new BmiService();
        CalcService calcService=new CalcService();
        WeeklySalaryService weeklySalaryService=new WeeklySalaryService();
        CircleAreaCalcService circleAreaCalcService=new CircleAreaCalcService();
        GradeService gradeService=new GradeService();
        LoginService loginService=new LoginService();
        SearchService searchService=new SearchService();





        while (true) {
            System.out.println("메뉴 선택");
            String menu = "0. EXIT 1.BMICALC 2.CALC 3.WEEKLY_SALARY CALC 4.CIRCLE_AREA_CALC 5.GRADE 6.LOGIN 7.SEARCH";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println(bmi.MAIN_NAME+"\n 이름 키(예시 172cm는 1.72) 몸무게 입력.");
                    System.out.println(scanner.next());
                    System.out.println(scanner.nextDouble());
                    System.out.println(scanner.nextInt());
                    res=bmiService.getBmi(bmi);
                    break;
                case "2":
                    System.out.println(calc.MAIN_NAME+"\n 첫번째숫자 두번째숫자 연산자 입력");
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.next());
                    res=calcService.getCalc(calc);
                    break;
                case "3":
                    System.out.println(weeklySalary.MAIN_NAME+"\n 성함/하루에 일하는시간/1주동안일하는날짜/시급 입력");
                    System.out.println(scanner.next());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    res=weeklySalaryService.getWeekSalary(weeklySalary);
                case "4":
                    System.out.println(circleArea.MAIN_NAME+"\n 반지름 원주율 입력");
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextDouble());
                    res=circleAreaCalcService.getCircleAreaCalc(circleArea);
                    break;
                case "5":
                    System.out.println(grade.MAIN_NAME+"\n 이름 국어점수 영어점수 수학점수 입력");
                    System.out.println(scanner.next());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    res=gradeService.getGrade(grade);
                    break;
                case "6":
                    System.out.println(login.MAIN_NAME+"\n 아이디 비번 성함 입력");
                    System.out.println(scanner.next());
                    System.out.println(scanner.next());
                    System.out.println(scanner.next());
                    res=loginService.getLogin(login);
                    break;
                case "7":
                    System.out.println(search.MAIN_NAME+"\n Google 검색 또는 URL 입력");
                    res=searchService.getSearch(search);
                    break;
                default:res="정확한 메뉴번호를 입력해주세요.";break;

            }
            System.out.println(res);
        }
    }
}
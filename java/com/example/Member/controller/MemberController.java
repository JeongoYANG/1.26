package com.example.Member.controller;

import com.example.Member.domain.BmiDTO;
import com.example.Member.domain.GoogleDTO;
import com.example.Member.domain.CalcDTO;
import com.example.Member.domain.GradeDTO;
import com.example.Member.domain.UserDTO;
import com.example.Member.service.MemberService;
import com.example.Member.service.MemberServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.democontroller
 * fileName   : DemoController
 * author     : yangjeongo
 * date       : 2022-02-03
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         yangjeongo        최초 생성
 */
public class MemberController {
    public void execute(Scanner scanner) {

        MemberService service = new MemberServiceImpl();
        while (true) {
            System.out.println ("메뉴 선택");
            String menu = "1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
            System.out.println (menu);
            String sel = scanner.next ();
            String res = "";
            switch (sel) {
                case "0":
                    System.out.println ("Exit");
                    return;
                case "1":
                    res = "BMI";
                    System.out.println (BmiDTO.Bmi + "\n 이름, 키, 몸무게");
                    BmiDTO b = BmiDTO.getInstance();
                    b.setName (scanner.next ());
                    b.setWeight (scanner.nextDouble ());
                    b.setTall (scanner.nextDouble ());
                    res = service.getBmi (b);
                    break;        case "2":
                    res = "CALC";
                    System.out.println (CalcDTO.CALC + "\n 숫자1, 연산자, 숫자2 입력");
                    CalcDTO c = CalcDTO.getInstance();
                    c.setNum1 (scanner.nextInt ());
                    c.setOpcode (scanner.next ());
                    c.setNum2 (scanner.nextInt ());
                    res = service.calc (c);
                    break;
                case "3":
                    res = "GOOGLE";
                    System.out.println (GoogleDTO.Google + "\n 검색어 입력");
                    GoogleDTO go = GoogleDTO.getInstance();
                    go.setSearch ();
                    res = service.search (go);
                    break;
                case "4":
                    res = "GRADE";
                    System.out.println (GradeDTO.GRADE + "\n 이름, 국어, 영어, 수학 ");
                    GradeDTO g = GradeDTO.getInstance();
                    g.setName (scanner.next ());
                    g.setKor (scanner.nextInt ());
                    g.setEng (scanner.nextInt ());
                    g.setMath (scanner.nextInt ());
                    res = service.getGrade (g);
                    break;
                case "5":
                    res = "LOGIN";
                    System.out.println (UserDTO.Login + "\n 아이디, 비번, 이름 ");
                    UserDTO u = UserDTO.getInstance();
                    u.setName (scanner.next ());
                    u.getInstance().setId (scanner.next ());
                    u.getInstance().setPw (scanner.next ());
                    res = service.login (u);
                    break;
                default:
                    res = "1~5 중 선택하세요";
                    break;

            }
            System.out.println (res);
        }

      /*  if (select.equals("1")){res = "BMI";}else
        if (select.equals("2")){res = "CALC";}else
        if (select.equals("3")){res = "SEARCH";}else
        if (select.equals("4")){res = "GRADE";}else
        if (select.equals("5")){res = "LOGIN";}
       */

    }
}
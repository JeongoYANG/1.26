package com.example.phone.controller;

import com.example.phone.service.PhoneService;
import com.example.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.democontroller
 * fileName   : PhoneContorller
 * author     : yangjeongo
 * date       : 2022-02-08
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         yangjeongo        최초 생성
 */
public class PhoneContorller {
    public void execute(Scanner scanner) {

        PhoneService service = new PhoneServiceImpl();
        while (true){
            String s ="";
            System.out.println("(MEUN) 0.Exit, 1.집전화, 2.휴대폰, 3.아이폰, 4.갤럭시노트");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");
                    return;
                case "1" :
                    System.out.println("1.집전화");
                    service.usePhone(scanner);
                    break;
                case "2" :
                    System.out.println("2.휴대폰");
                    service.useCelPhone(scanner);
                    break;
                case "3" :
                    System.out.println("3.아이폰");
                    service.useIPhone(scanner);
                    break;
                case "4" :
                    System.out.println("4.갤럭시노트");
                    service.useGalPhone(scanner);
                    break;
                default: s = "0 ~ 4 중 선택하시오";
            }
            System.out.println(s);
        }
    }
}

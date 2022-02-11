package com.example.phone.controller;

import com.example.phone.domain.CelPhone;
import com.example.phone.domain.GalPhone;
import com.example.phone.domain.IPhone;
import com.example.phone.domain.Phonee;
import com.example.phone.service.PService;
import com.example.phone.service.PServiceImpl;
import com.example.phone.service.PhoneService;
import com.example.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.phone.controller
 * fileName   : OopContorller
 * author     : yangjeongo
 * date       : 2022-02-09
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         yangjeongo        최초 생성
 */
public class OopContorller {
    public void execute(Scanner scanner){

        while (true){
            System.out.println("[메뉴] 0.종료, 1.은닉화, 2.상속, 3.추상화, 4다형성");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("POJO가 은닉화다");break;
                case "2":
                    System.out.println("extends 가 상속이다");
                    Phonee phone = new Phonee("금성전화기","금성전자");
                    CelPhone celPhone = new CelPhone("블랙베리","이동중에","핸드폰");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PService pService = new PServiceImpl();
                    System.out.println("소메뉴");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("종료");return;
                        case "1":
                            phone.setCall("여보세요, ***입니다.");
                            pService.usePhone(phone);
                        case "2" :
                            celPhone.setCall("안녕하세요");
                            pService.useCalPhone(celPhone);
                            break;
                        case "3" :

                            iPhone.setSearch("뉴스");
                            pService.useIPhone(iPhone);
                            break;
                        case "4" :
                            galPhone.setPay("삼성 페이");
                            pService.useGalPhone(galPhone);
                            break;
                    }
                    break;
            }
        }
    }
}

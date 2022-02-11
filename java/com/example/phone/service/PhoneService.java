package com.example.phone.service;

import java.util.Scanner;

/**
 * packageName: com.example.service
 * fileName   : PhoneService
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
public interface PhoneService {
    void usePhone(Scanner scanner);
    void useCelPhone(Scanner scanner);
    void useIPhone(Scanner scanner);
    void useGalPhone(Scanner scanner);
}

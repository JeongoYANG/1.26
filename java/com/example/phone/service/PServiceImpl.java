package com.example.phone.service;

import com.example.phone.domain.CelPhone;
import com.example.phone.domain.GalPhone;
import com.example.phone.domain.IPhone;
import com.example.phone.domain.Phonee;

/**
 * packageName: com.example.phone.service
 * fileName   : PServiceImpl
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
public class PServiceImpl implements PService{
    @Override
    public void usePhone(Phonee phonee) {
        System.out.println(phonee.toString());

    }

    @Override
    public void useCalPhone(CelPhone celPhone) {
        System.out.println(celPhone.toString());

    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());

    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());

    }
}

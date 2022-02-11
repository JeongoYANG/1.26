package com.example.phone.service;

import com.example.phone.domain.CelPhone;
import com.example.phone.domain.GalPhone;
import com.example.phone.domain.IPhone;
import com.example.phone.domain.Phonee;

/**
 * packageName: com.example.phone.service
 * fileName   : PService
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
public interface PService {
    void usePhone(Phonee phonee);
    void useCalPhone(CelPhone celPhone);
    void useGalPhone(GalPhone galPhone);
    void useIPhone(IPhone iPhone);
}

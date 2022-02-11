package com.example.phone.domain;

/**
 * packageName: com.example.phone.domain
 * fileName   : GalPhone
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
public class GalPhone extends IPhone {
    public final static String KIND = "갤럭시";
    private String pay;

    public GalPhone(String company){
        super(company);
    }
    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s 에서 만든 %s 제품을 사용해서 %s 로 결제한다."
                , super.getCompany(), KIND, pay);
    }
}

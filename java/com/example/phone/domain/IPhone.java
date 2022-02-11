package com.example.phone.domain;

/**
 * packageName: com.example.phone.domain
 * fileName   : IPhone
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
public class IPhone extends CelPhone{
    public final static String KIND = "아이폰";
    private String search;
    public IPhone(String company){
        super(KIND, company, "이동중" );
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s에서 %s을 사용해서 %s중에 %s를 검색한다"
        , super.getCompany(), KIND, super.getMove(),search);
    }
}

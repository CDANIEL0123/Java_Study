package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러개를 저장하는 연속 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachael = "카페모카";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachael + " 하나");
        System.out.println(coffeeMonica + " 하나");

        //배열선언 첫번째 방법
        String[] coffees = new String[4];

        //배열선언 두 번째 방법
//        String coffeess[] = new String[4];  //대괄호 위치 차이뿐
//
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "카푸치노";
//        coffees[3] = "라떼;    범위잡고 ctrl + / => 전체 주석
        
        //배열선언 세번째 방법
        //String[] coffeess = new String[] {"아메리카노","카페모카","카푸치노","라떼"}; //크기명시하지않아도 해당개수만큼 만들어짐

        //배열선언 네번째 방법
        String[] coffeess = {"아메리카노","카페모카","카푸치노","라떼"};

        //커피주문
        coffeess[2] = "에스프레소";
        System.out.println(coffeess[0]+" 하나");
        System.out.println(coffeess[1]+" 하나");
        System.out.println(coffeess[2]+" 하나");


    }
}

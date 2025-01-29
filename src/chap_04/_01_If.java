package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문
        int hour = 15;
        if (hour < 14) 
        { //if문으로 1개 문장 실행시 중괄호 없어도되지만 웬만하면 걍 쓰셈
            System.out.println("아이스 아메리카노 +1 ");
            System.out.println("샷추가");
        }
        System.out.println("커피주문완료#1");



        //오후 2시 이전이면서 모닝커피 마시지 않은 경우

        hour = 10;
        boolean morningCoffee = false;
        //if(hour < 14 && morningCoffee == false) {
        if(hour < 14 && !morningCoffee ) { //윗라인이랑 같은의미
                System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문완료#2");
        
        //오후 2시 이후이거나 모닝커피 마신 경우
        hour = 15;
        morningCoffee = true;
        //if (hour >=14 || morningCoffee == true) {
        if (hour >=14 || morningCoffee) { //윗라인이랑 같은의미
            System.out.println("아이스아메리카노 (디카페인) +1");
        }
        System.out.println("커피주문완료#3");
        
    }
}

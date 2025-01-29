package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue
        //손님 안나타나면 다음손님에게 넘어가기
        
        int max = 20; //최대 판매수량
        int sold_chicken = 0; //현재 판매수량
        int noshow = 17; //노쇼손님

        for (int i = 1; i < 50; i++) {
            if (i == noshow){
                System.out.println(i + "번 손님 노쇼");
                continue; //이 문장 다음 문장은 실행 x => 즉 해당 조건일 경우 반복문 건너띄고 다음번으로 진행
            }
            sold_chicken ++; //치킨을 가져가는 상황
            System.out.println(i +"번 손님 주문하신 치킨 나왔습니다.");
            if (sold_chicken == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}

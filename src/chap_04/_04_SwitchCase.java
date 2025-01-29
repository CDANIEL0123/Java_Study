package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그외 : 장학금x
        
        //if else문 이용 (여러조건 또는 범위에 해당하는 조건의경우 사용)
        int ranking = 2;
        if (ranking ==1) {
            System.out.println("전액 장학금");
        }
        else if (ranking == 2) {
            System.out.println("반액 장학금");
        }
        else if (ranking == 3) {
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료 #1");


        //switch case 문 이용 (명확한 케이스가 있는 경우 ex:에러문별 메시지)
        ranking = 4;
        switch (ranking) {
            case 1: //switch()값에 대한 케이스
                System.out.println("전액 장학금");
                break; //switch-case 문 빠져나감
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#2");

        //case2 case3 통합
        ranking = 2;
        switch (ranking) {
            case 1: //switch()값에 대한 케이스
                System.out.println("전액 장학금");
                break; //switch-case 문 빠져나감
            case 2 : //case2일때 break가 없으니 다음문장 실행
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#3");


        //중고상품 등급별 가격 책정해보기
        int grade = 1; //등급
        int price = 7000;  //기본가격
        switch (grade) {
            case 1 : //1등급일땐 여기부터 실행 1등급 : 10000원  break가 없으니 쭉 내려감
                price += 1000; 
            case 2 : //2등급일땐 여기부터 실행 2드급 : 9000원
                price += 1000;
            case 3 : //3등급일땐 여기부터 실행 3등급 : 8000원
                price += 1000;
                break;
        }
        System.out.println(grade+"등급 제품의 가격 : "+ price +"원");
    }
}

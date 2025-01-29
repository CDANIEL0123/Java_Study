package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; //문자열 변수 선언하기
        name = "폐급코더"; //변수에 값 넣기
        String name_Test = "폐급코더2"; //선언과 동시에 값넣기
        int hour_arrive = 15; //정수값 선언하기

        System.out.println(name + "님, 배송 " + hour_arrive + "시에 시작합니다");
        System.out.println(name_Test);


        double score = 90.5;
        char grade = 'A' ; //한글자인 캐릭터는 작은따옴표로 묶기\
        name = "강백호"; //name 업데이트 시켜주기 / 중간에 시켜줘도 중간까지는 기존 name유지
        System.out.println(name + "님 점수는 " + score + "점입니다");
        System.out.println(name + "님 학점은 " + grade + "입니다");

        boolean pass = false;
        System.out.println(name + "님은 이번시험에 합격했을까요?" + pass);
        
        //float fl = 3.14; // 디폴트는 더블자료형이므로 그냥넣으면 에러
        float flo = 3.14f; //숫자 뒤에  f를 넣어줘야 float변수라고 선언됨
        double dou = 3.14;
        System.out.println(flo);

        float ftest = 3.123456789f; //double보다 정밀함은 떨어짐
        double dtest = 3.123456789;
        System.out.println(ftest); //double보다 정밀함은 떨어짐
        System.out.println(dtest);


        //int i = 1123123123123; // int자료형 범위는 21억까지임
        long l = 1123123123123L; //float과 마찬가지로 L 붙여줘야함 int보다 큰 범위에서 사용
        long lcomma = 1_123_123_123_123L; //구분위한 언더바 넣어도 똑같이 출력됨
        System.out.println(l);
        System.out.println(lcomma);
    }
}

package chap_02;

public class _01_Operator01 {
    public static void main(String[] args) {
        //산술연산자
        System.out.println(4+2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2);
        System.out.println(5%2);

        System.out.println(2 + 2 * 2); //우선순위 연산
        System.out.println((2 + 2) * 2); //우선순위 연산

        //변수 이용한 연산
        int a = 20;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        int c = a /b;
        System.out.println(c);


        int val = 10;
        System.out.println(val++);
        System.out.println((val));
        System.out.println(++val);

        int waiting = 0;
        System.out.println("대기인원 : "+ waiting++);
        System.out.println("대기인원 : "+ waiting++);
        System.out.println("대기인원 : "+ waiting++);
        System.out.println("총 대기인원 : " + waiting);


    }
}

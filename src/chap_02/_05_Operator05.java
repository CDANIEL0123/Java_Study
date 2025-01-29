package chap_02;

public class _05_Operator05 {
    public static void main(String[] args) {
        //삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = ( x > y ) ? x : y ; //x가 y보다 클경우 max변수에 x 넣기 / 거짓일경우 y 넣기
        System.out.println(max);

        int min = ( x < y ) ? x : y ;
        System.out.println(min);


        boolean b = (x==y) ? true : false ;
        System.out.println(b);
        y +=2 ;
        boolean c = (x==y) ? true : false ;
        System.out.println(c);

        String s = (x != y) ? "달라요" : "같아요" ;
        System.out.println(s);

    }
}

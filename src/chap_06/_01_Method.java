package chap_06;

public class _01_Method {
    //메소드 정의
    public static void sayhello() {//메소드는 매인밖에 선언
        System.out.println("안녕하세요 메소드입니다~");
    }

    public static void main(String[] args) {
        //메소드(함수) 호출
        System.out.println("호출 전");
        sayhello();
        System.out.println("호출 후");
    }
}

package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        //main 메소드 : 자바 프로그램 실행시 가장 처음 진입하는 부분임
        for(String s: args) { //main함수에서 args에 전달받은 인자값들이 하나씩 출력됨
                                //오른쪽위 실행옆 - 구성편집 - 인자값에 입력하는값이 main의 args 값
            System.out.println(s);
        }
    }
}

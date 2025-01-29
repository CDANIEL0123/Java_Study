package chap_01;

public class _06_Constants { //상수
    public static void main(String[] args) {

        String KR_CODE = "82" ; //변수
        System.out.println(KR_CODE);

        final String KR_CODE_constants = "82" ; //바꿀일없으니 상수로 선언
        System.out.println(KR_CODE_constants);
        // KR_CODE_constants = "ASD"; Final(상수) 값이므로 수정할 수 없는 오류



    }
}

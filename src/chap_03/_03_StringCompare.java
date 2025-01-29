package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //두 내용이 같으면 true 반환
        System.out.println(s1.equals("Java")); //두 내용이 같으면 true 반환
        System.out.println(s2.equals("python")); //소문자는 서로 다른 문자로 인식
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분없이 내용이 같은지 체크해줌

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 식당 화장실 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //s1과 s2가 같은지 //내용이 같은지를 비교
        System.out.println(s1 == s2); //s1과 s2가 같은지 //참조가 같은지를 비교임
        //s2를 위해또 새로운 1234 공간 할당x 기존 1234메모리 너도 그대로 써 -> 모든 테이블 손님에게 비밀번호 메모지x 벽에 1장 붙여놓는 격

        s1 = new String("1234"); 
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //내용은 똑같으니 true
        System.out.println(s1 == s2); //여기서는 서로 다른 false로 나옴 -> 서로다른공간, 즉 참조가 다르니 false
        //s2를 위해 새로운 1234 공간할당 o new를 위해 쓰면 모든 테이블 손님에게 각각 비밀번호 메모지 주는 격

        //결론 : 자바에서 문자열의 내용을 비교하고싶으면 equlas ! 를 써야함 !


    }
}

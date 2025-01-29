package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I LIKE Java And Python And C.";
        //문자열 변환
        System.out.println(s.replace(" And", ",")); //And를 ,로 변환
        System.out.println(s.substring(7)); //인덱스 기준 7번쨰 위치부터 시작 / 즉  7번째부터 잘라줌
        System.out.println(s.substring(s.indexOf("Java"))); //위라인이랑 같은 뜻
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작위치부터해서 .위치 직전까지 잘라줌

        //공백제거
        s = "     I Love Java.    ";
        System.out.println(s);
        System.out.println(s.trim()); //앞뒤 공백 제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(", ").concat(s2)); //s1과 , 모두 결합







    }
}

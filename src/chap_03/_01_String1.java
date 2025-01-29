package chap_03;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I LIKE Java And Python And C";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //길이 29

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함 관계
        System.out.println(s.contains("Java"));  //Java 들어있는지
        System.out.println(s.contains("C#")); //c# 들어있는지
        System.out.println(s.indexOf("Java")); //자바 위지 확인
        System.out.println(s.indexOf("C#")); //포함되어있지 않은 문자는 -1 반환
        System.out.println(s.indexOf("And")); //처음만나는 And 위치 확인
        System.out.println(s.lastIndexOf("And")); //마지막으로 만나는 And 위치 확인
        System.out.println(s.startsWith("I LIKE")); //해당 문자열로 시작하는지
        System.out.println(s.endsWith("C")); //해당 문자열로 끝나는지

    }
}

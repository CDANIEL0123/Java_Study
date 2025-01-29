package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변한 typecasting
        //정수형 -> 실수형으로
        //실수형 -> 정수형으로

        int score = 93;
        System.out.println(score);
        System.out.println((float)score); //float형으로 바꿔서 실행
        System.out.println((double)score); //double형으로 바꿔서 실행

        float score_f = 93.3f;
        double score_d = 93.8;
        System.out.println((int)score_f); //int형으로 변환
        System.out.println((int)score_d); //int형으로 변환

        //정수 + 실수 연산
        score = 93 + (int)score_f;
        System.out.println(score);
        score_d = 93 + score_f;
        System.out.println(score_d);
        score_d = 93 + 93.3;
        System.out.println(score_d);

        double convertesdScoreDouble = score; // int -> double
        //int -> long -> float -> double (점점커지는(정밀해지는) 순서임) // 자동 형변환

        //int convertedScoreInt = score_d; // 큰범위 -> 작은범위로 넣기에 일부 짤린다는 의미로 오류 ->
        int convertedScoreInt2 = (int)score_d; // (int) 형변환으로 미리 해줘야 오류 사라짐
        //double -> float -> long -> int (점점작아지는(단순해지는) 순서일때) // 수동으로 형변환


        //숫자를 문자열로
        String s1 = String.valueOf(93); //string 클래스가 제공하는 valueof 라는 기능으로 변형가능
        s1 = Integer.toString(93); // 위에 꺼랑 같은의미 / 숫자를 문자열로
        System.out.println(s1);

        String s2 = Double.toString(98.8); // 위에 꺼랑 같은의미 / 숫자를 문자열로
        String s3 = String.valueOf(98.8); // 위에 꺼랑 같은의미 / 숫자를 문자열로
        System.out.println(s2);
        System.out.println(s3);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("99.9");
        System.out.println(d);




    }
}

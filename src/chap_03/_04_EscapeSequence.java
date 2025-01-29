package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'

        System.out.println("자바가");
        System.out.println("재밌어요"); //짧은내용인데 라인을 나눌필요없음

        // \n 줄바꿈
        System.out.println("자바가\n재밌어요"); // \n으로 줄바꿈홰주면 됨
        
        // \t 탭
        // 해물파전    9000원
        // 부추천      8000원
        System.out.println("부추전    9000원");
        System.out.println("해물파전\t9000원"); //글자수가 달라도 보기좋게 띄워줌
        System.out.println("김치전\t8000원");

        // \\
        //System.out.println("C:\ProgramFiles\Java"); //역슬래쉬 1번은 오류 -> 역슬래쉬1번 쓰려면 //두개로 넣어줘야
        System.out.println("C:\\ProgramFiles\\Java");


        // \" 큰따옴표
        System.out.println("단비가 \"냐용\" 이라고 했어요"); //단비가 "나용" 이라고 했어요  -> 큰따옴표 앞에 \붙여주자


        // \' 작은따옴표
        System.out.println("단비가 \'뭘 봐\'라는 표정을 지었어요"); //작은따옴표도 마찬가지
        System.out.println("단비가 '뭘 봐'라는 표정을 지었어요"); //작은따옴표는 사실 상관없음

        char c = 'A';
        c = '\'';
        System.out.println(c);


    }
}

package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원배열
        //A1-A5
        //B1-B5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"}; //alt 누르고 범위선택
        
//        String[][] seats = new String[][] {}; < 기본형식

        //3*5크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //B2에 접근하려면?
        System.out.println(seats[1][1]);


        //첫줄3칸, 둘째줄4칸, 셋째줄 5칸
        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats2[0][3]); //빈자리 출력시 오류발생

    }
}

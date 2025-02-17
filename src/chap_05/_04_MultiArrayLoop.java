package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        //다차원순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
            //빈공간있는 배열있을때 길이별로 순회시키기
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        //세로 10 가로15크기 영화관 좌석
        System.out.println("=============================");
        String[][] seats3 = new String[10][15];
        String[] eng={"A","B","C","D","E","F","G","H","I","J"};
        char ch = 'A'; //위처럼 배열선언필요  x 아스키에서 ++시켜주면된다!

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch)+(j+1);
            }
            ch++;
        }

        //표구매
        seats3[7][8] = "--";

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] +" ");
            }
            System.out.println();
        }

    }
}

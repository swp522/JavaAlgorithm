// 2020_07_09_목_블록 게임

/*
 * 1. 검은 블록 떨어뜨려 없앨 수 있는 블록 개수의 최대값 구하기
 *
 * 2. 4 <= N <= 50 ,  0 < board[i] <= 200
 *
 * 3. 아직 미완성
 *
 */


public class PRO_2019KAKAO_블록게임 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 4, 0, 0, 0}, {0, 0, 0, 0, 0, 4, 4, 0, 0, 0},
                {0, 0, 0, 0, 3, 0, 4, 0, 0, 0}, {0, 0, 0, 2, 3, 0, 0, 0, 5, 5}, {1, 2, 2, 2, 3, 3, 0, 0, 0, 5},
                {1, 1, 1, 0, 0, 0, 0, 0, 0, 5}};

        System.out.println(solution(board));
    }


    public static int solution(int[][] board) {
        int answer = 0;



        return answer;
    }
}

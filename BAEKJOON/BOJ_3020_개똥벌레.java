// 2020_07_12_화_45회차_과제1_개똥벌레

/*
 * 1. 개똥벌레가 파괴해야하는 장애물의 최솟값과 그 구간의 개수 구하기
 *
 * 2. n은 짝수, 2 ≤ N ≤ 200,000, 2 ≤ H ≤ 500,000 , 장애물 크기 < H
 *
 * 3. 아직 미완성해서 수요일 스터디 전까지 완료
 *
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3020_개똥벌레 {

    static int answer;
    static int row, col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        answer = 0;

        solve();
        
        System.out.println(answer);
    }

    private static void solve(){

    }
    

}

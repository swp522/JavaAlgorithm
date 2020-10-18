// 2020_10_18_��

/*
 *  1. �ʹ��� ���� �� �ִ� ������ �ִ밪 ���ϱ�
 *  
 *  2. 2 �� N �� 30,000  /  2 �� d �� 3,000   / 2 �� k �� 3,000 (k �� N)  / 1 �� c �� d
 *  
 *  3. count = 1 �� �ΰ� c�� �켱 �����ϰ� �Ѵ��� k����ŭ Ȯ���ϵ��� ���� 
 *  
 *  4. ������ �����ϴµ� �ʹ� �����ɷȴ�
 *  
 *     d�� �� �ʿ����� �����ϴµ� �����ɸ� -> ���� c�� ���� ������ ���ο� ������ �ʹ��� �ö󰡴µ� �̰� �����ε�
 *     
 *     ���ʿ��� �迭�� ���� ���־��ϰ� �������� ��� �����غ���
 * 
 */


package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2531_ȸ���ʹ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] input = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(br.readLine());
		};
	
		System.out.println(solution(n, d, k, c, input));
	}

	public static int solution(int n, int d, int k, int c, int[] input) {
		int answer = Integer.MIN_VALUE;
		boolean[] check = new boolean[d + 1];
		
		for(int i = 0; i < n; i++) {
			int count = 1;
			Arrays.fill(check, false);
			for(int j = i; j < (i + k); j++) {
				if(!check[input[j % n]]) {
					check[input[j % n]] = true;
					count++;
					if(input[j % n] == c) {
						count--;
					}
				}
			}
			
			if(count == k + 1) {
				answer = count;
				break;
			}
			answer = Math.max(answer, count);
		}
		
		return answer;
	}
}

// 2020_09_22_ȭ

/*
 *  1. i~j ������ ���� m�� �Ǵ� ����� �� ���ϱ�
 *  
 *  2. 1��N��10,000   ,   1��M��300,000,000    ,   input[i] < 30,000 �ڿ���
 *  
 *  3. ��������
 *  
 *     1). sum�� m���� ������ first ������ �����ϰ� sum���� + ���ش�
 *  
 *     2). sum�� m���� ũ�ų� ������ second ������ �����ϰ� sum���� - ���ش�
 *  
 *     3). sum�� m�̶� ������ ����Ǽ� ī��Ʈ���ش� 
 *     
 */

package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2003_��������2 {
	public static void main(String[] args_) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] input = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;
		int first = 0;
		int second = 0;
		int answer = 0;
		
		while(true) {
			if(sum >= m) {
				sum -= input[second++];
			} else if(first == n) {
				break;
			} else {
				sum += input[first++];
			}
			
			if(sum == m) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}

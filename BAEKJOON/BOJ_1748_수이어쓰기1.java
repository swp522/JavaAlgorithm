// 2020_09_21_��

/*
 *  1. ��������� ���� �ڸ��� ���ϱ�
 *  
 *  2. 1 �� N �� 100,000,00
 *  
 *  3.  ���Ʈ ����
 *  
 *     1). answer�� count(�ڸ���) ��� n�� ������
 *  
 *     2). 10�� ���� ���� �ɸ� �� limit * 10 ���ְ� �ڸ��� +1 �ؼ� answer�� ����
 *  
 *     3). 1�гѾ ���ʶ� �� �˾Ҵµ� �¾���
 *     
 */

package algo;

import java.util.Scanner;

public class BOJ_1748_���̾��1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int limit = 10;
		int count = 1;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (i == limit) {
				limit *= 10;
				count++;
			}
			answer += count;
		}

		System.out.println(answer);
	}
}

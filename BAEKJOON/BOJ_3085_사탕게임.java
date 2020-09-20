// 2020_09_17_��

/*
 *  1. ���� �� �ִ� �ִ� ������ ���� ���ϱ�
 *  
 *  2. 3 <= n <= 50
 *  
 *  3. 1). ������ �� ĭ �� �ָ� ��ȯ�ϰ� ���Ŀ� �ٽ� �����������
 *  
 *     2). ������ ��ĭ�� 4������ ������, �Ʒ��� ������
 */

package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3085_�������� {

	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		char[][] candies = new char[n][n];
		int answer = 0;

		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < n; j++) {
				candies[i][j] = input.charAt(j);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j + 1 < n) {
					char target = candies[i][j];
					candies[i][j] = candies[i][j + 1];
					candies[i][j + 1] = target;

					int temp = countTheLength(candies);
					if (answer < temp) {
						answer = temp;
					}
					target = candies[i][j];
					candies[i][j] = candies[i][j + 1];
					candies[i][j + 1] = target;
				}

				if (i + 1 < n) {
					char target = candies[i][j];
					candies[i][j] = candies[i + 1][j];
					candies[i + 1][j] = target;

					int temp = countTheLength(candies);
					if (answer < temp) {
						answer = temp;
					}
					target = candies[i][j];
					candies[i][j] = candies[i + 1][j];
					candies[i + 1][j] = target;
				}
			}
		}

		System.out.println(answer);
	}

	
	public static int countTheLength(char[][] candies) {
		int ans = 1;

		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 1; j < n; j++) {
				if (candies[i][j] == candies[i][j - 1]) {
					count += 1;
				} else {
					count = 1;
				}

				if (ans < count) {
					ans = count;
				}
			}

			count = 1;
			for (int j = 1; j < n; j++) {
				if (candies[j][i] == candies[j - 1][i]) {
					count += 1;
				} else {
					count = 1;
				}

				if (ans < count) {
					ans = count;
				}
			}
		}

		return ans;
	}
}

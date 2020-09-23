// 2020_09_21_��

/*
 *  1. <x, y> �� ���° ������ ���ϱ�
 *  
 *  2. 1 �� M, N �� 40,000 ,  1 �� x �� M,   1 �� y �� N
 *  
 *  3. ���Ʈ ���� 
 *  
 *     1). ������ �����Ϸ��� x, y �� -1 ����
 *  
 *     2). x���� �����ؼ� m��ŭ�� index �����ϸ鼭 y���� �����ش� (x ����)
 *  
 *     3). y�� ������ +1 �ؼ� index ���
 *     
 */

package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6064_ī�״޷� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			boolean check = false;

			for (int j = x; j < (n * m); j += m) {
				if (j % n == y) {
					System.out.println(j + 1);
					check = true;
					break;
				}
			}

			if (!check) {
				System.out.println(-1);
			}
		}
	}

}

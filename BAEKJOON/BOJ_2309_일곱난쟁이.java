// 2020_09_17_��

/*
 *  1. �ϰ� ������ Ű �������� ���
 *  
 *  2. ������ Ű�� ���� 100
 *  
 *  3. 1). 9�� �߿��� 2�� �̴°ǵ� ���Ʈ ������ �� ���غ��� ��������
 *  
 *     2). 100 �� ��� ������ Ż��������� -> break �ɾ��ִ°� �������ؼ� Ʋ����. ������ ���� ��� ���ϰ� �Ǿ������ �ð� �����ɸ�
 */

package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2309_�ϰ������� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] men = new int[9];
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			men[i] = Integer.parseInt(br.readLine());
			sum += men[i];
		}
	
		Arrays.sort(men);

		loop:
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - men[i] - men[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (i != k && j != k) {
							System.out.println(men[k]);
						}
					}
					
					break loop;
				}
			}
		}

	}
}

// 2020_09_18_��

/*
 *  1. ���� �� �� ���� ���ϱ�
 *  
 *  2. 1 �� E �� 15, 1 �� S �� 28, 1 �� M �� 19
 *  
 *  3. 1). ���� �����ϴµ� �ð� �ɸ�
 *  
 *     2). �� 15*28*19 ����Ǽ� �ִµ� �׳� ���ǽ� �����ؼ� ���ѷ����� ��
 *     
 *     3). ������ �������ε� Ǯ �� ����  VVV
 */

package algo;

import java.util.Scanner;

public class BOJ_1476_��¥��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();

		int eYear = 1, sYear = 1, mYear = 1;

		for (int i = 1; ; i++) {
			
			if(eYear == E && sYear == S && mYear == M) {
				System.out.println(i);
				break;
			}

			eYear += 1;
			sYear += 1;
			mYear += 1;
			
			if(eYear == 16) {
				eYear = 1;
			}
			if(sYear == 29) {
				sYear = 1;
			}
			if(mYear == 20) {
				mYear = 1;
			}
		}

	}

}

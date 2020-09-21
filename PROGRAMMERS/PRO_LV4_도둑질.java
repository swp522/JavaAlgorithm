// 2020_09_21_��

/*
 *  1. ��ĥ �� �ִ� ���� �ִ밪 ���ϱ�
 *  
 *  2. 3 <= �� ����  <= 1,000,000  0 <= money[i] <= 1000
 *  
 *  3. DP
 *  
 *     1). ������ 'ù��° �� �ʹ°�'�� '�ι��� �� �ʹ°�' ��
 *  
 *     2). firstHouseDP�� ù��° ���� ���ʹϱ� firstHouseDP[1] = money[0] ���� �ʱ�ȭ
 *  
 *     3). firstHouseDP�� ù���� �� �о����ϱ� ������ �� ���ʹϱ� return �Ҷ� -1 �������
 *     
 */

package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PRO_LV4_������ {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] money = { 1, 2, 3, 1 };

		System.out.println(solution(money));
	}

	public static int solution(int[] money) {
		int answer = 0;
		int[] firstHouseDP = new int[money.length];
		int[] secondHouseDP = new int[money.length];

		firstHouseDP[0] = money[0];
		firstHouseDP[1] = money[0];
		secondHouseDP[1] = money[1];

		for (int i = 2; i < money.length; i++) {
			firstHouseDP[i] = Math.max(firstHouseDP[i - 1], firstHouseDP[i - 2] + money[i]);
			secondHouseDP[i] = Math.max(secondHouseDP[i - 1], secondHouseDP[i - 2] + money[i]);
		}
		
		answer = Math.max(firstHouseDP[money.length - 2], secondHouseDP[money.length - 1]);

		return answer;
	}
}

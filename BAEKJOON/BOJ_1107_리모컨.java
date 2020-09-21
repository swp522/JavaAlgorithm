// 2020_09_18_��

/*
 *  1. ä�� N ���� �̵��Ϸ��� ��ư ��� �������ϴ��� ���ϱ�
 *  
 *  2. 0 �� N �� 500,000 , 0 �� M �� 10  , ���� ä�� 100��
 *  
 *  3. ���Ʈ ����
 *  
 *     1). answer �ʱ� �� : ���ڹ�ư �ȴ�����  +/-�� ������ ���� �ʱ�ȭ
 *  
 *     2). ó���� � ���ڷ� �̵����� ���� -> 10���� ������ 1���ڸ����� broken���� check�Ѵ� (ù ä���� 0�� ��� ���� ���)
 *  
 *     3). check ����� return length �Ǹ� �ּ� �� ���Ѵ�
 *     
 *  4. �Է¹��� �� Scanner�� ������ �������µ� BufferedReader�� ������ m != 0 ó�� ����� �´´�
 */

package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1107_������ {
	
	static boolean[] broken = new boolean[10];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int targetNumber = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		if (m != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++) {
				int x = Integer.parseInt(st.nextToken());
				broken[x] = true;
			}
		}

		int answer = targetNumber - 100;
		if (answer < 0) {
			answer = -answer;
		}

		for(int i = 0; i <= 1000000; i++) {
			int firstChannel = i;
			int length = checkIfTheButtonIsBroken(firstChannel);
			if(length > 0) {
				int pressCount = firstChannel - targetNumber;
				if(pressCount < 0) {
					pressCount = -pressCount;
				}
				
				if(answer > length + pressCount) {
					answer = length + pressCount;
				}
			}
		}
		
		System.out.println(answer);
	}

	public static int checkIfTheButtonIsBroken(int channel) {
		if (channel == 0) {
			if (broken[0]) {
				return 0;
			} else {
				return 1;
			}
		}

		int len = 0;
		while (channel > 0) {
			if (broken[channel % 10]) {
				return 0;
			}

			len += 1;
			channel /= 10;
		}

		return len;
	}

}

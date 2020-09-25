// 2020_09_23_��

/*
 *  1. �� ���� ���� �� �ִ� ��� ���� �迭�� ������������ ��� return�ϱ�
 *  
 *  2. 2 <= numbers.length <= 100
 *  
 *  3. ����
 *  
 *     - list �� indexOf() �� ���� ������ -1 �����ϴ°� �̿�  
 *     
 */

package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PRO_WCCS1_�ΰ��̾Ƽ����ϱ� {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = { 2, 1, 3, 4, 1 };

		System.out.println(Arrays.toString(solution(numbers)));
	}

	public static int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int value = numbers[i] + numbers[j];
				if(list.indexOf(value) == -1) {
					list.add(value);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i <list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);

		return answer;
	}

}

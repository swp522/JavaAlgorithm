// 2020_09_19_��

/*
 *  1. �׸���̳븦 �ϳ� �ʿ� ������ �� �ִ밪 ���ϱ�
 *  
 *  2. 4 �� N, M �� 500
 *  
 *  3. ���Ʈ ���� 
 *  
 *     1). � ��Ʈ�ι̳� ���� ���� / ��� ���� ���� ����
 *  
 *     2). �׸���̳�� ȸ��,��Ī ���� -> �� 19���� ����
 *  
 *     3). 19 x n x m ����  -> �� 4750000 ����
 *  
 *  4. ������ �ϸ� ��Ʈ��ŷ ���� �ð� �������� �ɸ�
 *  
 */

package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14500_�׸���̳� {

	static int row, col, answer;
	static int map[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		answer = 0;
		map = new int[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (j + 3 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i][j + 3];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 3 < row) {
					int target = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 3][j];
					if (answer < target) {
						answer = target;
					}
				}

				if (i + 1 < row && j + 2 < col) {
					int target = map[i][j] + map[i + 1][j] + map[i + 1][j + 1] + map[i + 1][j + 2];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 2 < row && j + 1 < col) {
					int target = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i][j + 1];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 1 < row && j + 2 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i + 1][j + 2];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 2 < row && j - 1 >= 0) {
					int target = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 2][j - 1];
					if (answer < target) {
						answer = target;
					}
				}
				if (i - 1 >= 0 && j + 2 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i - 1][j + 2];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 2 < row && j + 1 < col) {
					int target = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 2][j + 1];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 1 < row && j + 2 < col) {
					int target = map[i][j] + map[i + 1][j] + map[i][j + 1] + map[i][j + 2];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 2 < row && j + 1 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i + 1][j + 1] + map[i + 2][j + 1];
					if (answer < target) {
						answer = target;
					}
				}

				if (i + 1 < row && j + 1 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i + 1][j] + map[i + 1][j + 1];
					if (answer < target) {
						answer = target;
					}
				}

				if (i + 2 < row && j + 1 < col) {
					int target = map[i][j] + map[i + 1][j] + map[i + 1][j + 1] + map[i + 2][j + 1];
					if (answer < target) {
						answer = target;
					}
				}
				if (i - 1 >= 0 && j + 2 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i - 1][j + 1] + map[i - 1][j + 2];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 2 < row && j - 1 >= 0) {
					int target = map[i][j] + map[i + 1][j] + map[i + 1][j - 1] + map[i + 2][j - 1];
					if (answer < target) {
						answer = target;
					}
				}
				if (i + 1 < row && j + 2 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i + 1][j + 1] + map[i + 1][j + 2];
					if (answer < target) {
						answer = target;
					}
				}

				if (j + 2 < col) {
					int target = map[i][j] + map[i][j + 1] + map[i][j + 2];
					if (i - 1 >= 0) {
						int target2 = target + map[i - 1][j + 1];
						if (answer < target2) {
							answer = target2;
						}
					}
					if (i + 1 < row) {
						int target2 = target + map[i + 1][j + 1];
						if (answer < target2) {
							answer = target2;
						}
					}
				}
				if (i + 2 < row) {
					int target = map[i][j] + map[i + 1][j] + map[i + 2][j];
					if (j - 1 >= 0) {
						int target2 = target + map[i + 1][j - 1];
						if (answer < target2) {
							answer = target2;
						}
					}
					if (j + 1 < col) {
						int target2 = target + map[i + 1][j + 1];
						if (answer < target2) {
							answer = target2;
						}
					}
				}
			}
		}

		System.out.println(answer);
	}
}

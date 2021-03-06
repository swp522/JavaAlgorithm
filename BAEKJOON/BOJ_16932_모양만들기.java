// 2020_05_29_금_36회차_과제_모양 만들기

/*
 * 1. 모양의 최대 크기 구하기
 *
 * 2. 2 ≤ N, M ≤ 1,000 , 0과 1의 개수는 1개 이상
 *
 * 3. bfs로 너버링 해주고 list 써서 구현
 *
 * 4. 넘버링 이후에 어떻게 할지 로직 생각하는데 시간이 너무 오래걸렸다.
 *
 * 5. 1) grouping() 하고 boolean[] groupVisited 만들어서
 *
 *     solve() 함수 4방향 탐색시에 한 번 검색했던 group이면 visited 안하도록 함
 *
 *    2) zeroList의 타입을 LinkedList에서 ArrayList로 하니 시간 초과 해결 !
 *
 *    3) Arrays.fill() 보다 그냥 if문 돌아서 groupVisited[group] = false 초기화 하는게 시간 두배 빠름
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_16932_모양만들기 {

    static int n, m, max, groupNum, answer;
    static int[][] map, dir = {{-1, 0}, {0, 1}, {0, -1}, {1, 0}};
    static boolean[][] visited;
    static LinkedList<Node> q;
    static ArrayList<Node> zeroList;
    static ArrayList<Integer> countList;
    static boolean[] groupVisited;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        q = new LinkedList<>();
        zeroList = new ArrayList<Node>();
        countList = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) {
                    zeroList.add(new Node(i, j));
                }
            }
        }

        groupNum = 1;
        countList.add(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    grouping(i, j);
                    groupNum++;
                }
            }
        }

        answer = Integer.MIN_VALUE;
        groupVisited = new boolean[groupNum + 1];

        solve();
        System.out.println(answer + 1);
    }


    private static void grouping(int x, int y) {
        int count = 0;
        q.add(new Node(x, y));
        visited[x][y] = true;
        map[x][y] = groupNum;

        while (!q.isEmpty()) {
            count++;
            Node t = q.pop();

            for (int i = 0; i < 4; i++) {
                int dx = t.x + dir[i][0];
                int dy = t.y + dir[i][1];

                if (isRange(dx, dy) && !visited[dx][dy]) {
                    if (map[dx][dy] == 1) {
                        q.add(new Node(dx, dy));
                        visited[dx][dy] = true;
                        map[dx][dy] = groupNum;
                    }
                }
            }
        }

        countList.add(count);
    }


    private static void solve() {
        for (int z = 0; z < zeroList.size(); z++) {
            int sum = 0;

            for (int i = 0; i < 4; i++) {
                int zx = zeroList.get(z).x + dir[i][0];
                int zy = zeroList.get(z).y + dir[i][1];

                if (isRange(zx, zy) && map[zx][zy] != 0) {
                    int group = map[zx][zy];
                    if (!groupVisited[group]) {
                        sum += countList.get(group);
                        groupVisited[group] = true;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                int zx = zeroList.get(z).x + dir[i][0];
                int zy = zeroList.get(z).y + dir[i][1];
                if (isRange(zx, zy) && map[zx][zy] != 0) {
                    groupVisited[map[zx][zy]] = false;
                }
            }

            answer = Math.max(answer, sum);
        }
    }


    private static boolean isRange(int x, int y) {
        if (x >= 0 && x < n && y >= 0 && y < m) {
            return true;
        } else {
            return false;
        }
    }
}

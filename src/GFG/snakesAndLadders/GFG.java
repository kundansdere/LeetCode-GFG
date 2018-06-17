package GFG.snakesAndLadders;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GFG {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			LinkedList<Integer> graph[] = new LinkedList[31];
			int visited[] = new int[31];
			for (int j = 0; j < visited.length; j++) {
				visited[j] = Integer.MAX_VALUE;
			}
			visited[1] = 0;
			for (int j = 1; j <= 30; j++) {
				graph[j] = new LinkedList<>();
				for (int j2 = 1; j2 <= 6 && j + j2 < 31; j2++) {
					graph[j].addFirst(j + j2);
				}
			}
			for (int j = 0; j < n; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				graph[a].add(b);
				for (int k = 1; k <=6 && a - k > 0; k++) {
					graph[j].addFirst(j + k);
				}
			}

			LinkedList<Integer> queue = new LinkedList<>();
			queue.addLast(1);
			System.out.println(BFS(graph, visited, queue));
		}
	}

	private static int BFS(LinkedList<Integer>[] graph, int[] visited, LinkedList<Integer> queue)
			throws InterruptedException {
		while (!queue.isEmpty()) {
			int node = queue.remove();
			for (int i = 0; i < graph[node].size(); i++) {
				if (visited[graph[node].get(i)] > visited[node] + 1) {
					visited[graph[node].get(i)] = visited[node] + 1;
					queue.addLast(graph[node].get(i));
				}
			}
		}
		return visited[30];

	}

}

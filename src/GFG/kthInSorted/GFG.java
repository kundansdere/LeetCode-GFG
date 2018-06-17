package GFG.kthInSorted;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();

			int a[] = new int[n];
			int b[] = new int[m];
			for (int j = 0; j < a.length; j++) {
				a[j] = sc.nextInt();
			}
			for (int j = 0; j < b.length; j++) {
				b[j] = sc.nextInt();
			}

			int ix = 0, jx = 0;
			int result = 0;
			while (ix + jx <= k && ix < n && jx < m) {
				if (a[ix] < b[jx]) {
					result = a[ix];
					ix++;
				} else {
					result = b[jx];
					jx++;
				}
			}
			if (ix + jx == k)
				System.out.println(result);
			else if (ix < n) {
				int index = k-ix-jx-1;
				System.out.println(a[ix+index]);
			} else {
				int index = k-ix-jx-1;
				System.out.println(b[jx+index]);
			}
		}
	}

}

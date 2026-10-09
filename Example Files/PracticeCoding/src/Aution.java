import java.util.*;
public class Aution {
	public static int taskAllocation(int n, int m, int[] c, int[][] time) {
		boolean[] used = new boolean[m];
		int total = 0;
		for(int i = 0 ; i < n; i++) {
			int bestServer = -1;
			int minTime = Integer.MAX_VALUE ;
			for(int j = 0; j < m; j++) {
				
				if(!used[j] && time[j][i] <= c[j]) {
					if(time[j][i] < minTime) {
						minTime = time[j][i];
						bestServer = j;
					}
				}
			}
			if(bestServer != -1) {
				used[bestServer] = true;
				total += minTime;
			}
			
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[m];
		for(int i = 0 ; i < m; i++) {
			c[i] = sc.nextInt();
		}
		int[][] time = new int[m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				time[i][j] = sc.nextInt();
			}
		}
		System.out.println(taskAllocation(n,m,c,time));
	}

}

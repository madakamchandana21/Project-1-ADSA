import java.util.*;
public class resourceDistribution {
	public static int wareHouseDistribution(int n, int m, int[] cap, int[][] cost) {
		boolean[] used = new boolean[m];
		int total = 0;
		for(int i = 0;i<n;i++) {
			int eligibleTruck = -1;
			int minCost = Integer.MAX_VALUE;
			for(int j =0;j<m;j++) {
				if(!used[j] && cost[j][i] <= cap[j]) {
					if(cost[j][i] < minCost) {
						minCost = cost[j][i];
						eligibleTruck = j;
					}
				}
			}
			if(eligibleTruck != -1 ) {
				used[eligibleTruck] = true;
				total += minCost;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cap = new int[m];
		for(int i = 0; i < m;i++) {
			cap[i] = sc.nextInt();
		}
		int[][] cost = new int[m][n];
		for(int i =0; i<m;i++) {
			for(int j=0;j<n;j++) {
				cost[i][j] = sc.nextInt();
			}
		}
		System.out.println(wareHouseDistribution(n,m,cap,cost));

	}

}

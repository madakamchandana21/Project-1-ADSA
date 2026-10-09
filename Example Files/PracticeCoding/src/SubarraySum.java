import java.util.HashMap;
public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,-2,-20,10};
		int target = -10;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int prefixSum = 0;
		map.put(0, -1);
		boolean found = false;
		
		for(int i = 0; i < arr.length; i++) {
		
			prefixSum += arr[i];
			int remaining = prefixSum - target;
			if(map.containsKey(remaining)){
				int start = map.get(remaining)+1;
				int end = i;
				System.out.println("Subarray Found!");
				System.out.println("Start index: " + start);
				System.out.println("End Index: " + end);
				
				for(int j = start; j <= end; j++) {
					System.out.print(arr[j] + " ");
				}
				
				found = true;
				break;
			}
			if(!map.containsKey(prefixSum)) {
				map.put(prefixSum, i);
			}
		}
		if(!found) {
			System.out.println("No Subarray Found");
		}

	}

}

package Assignment;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int[]num = {1,4,3,2,8,6,7};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			if (num[i+1]!=num[i]+1) {
				int element=num[i]+1;
				System.out.println("Missing Element"+(i+1));
				break;
				
			}
			
		}
		
		
	}

}

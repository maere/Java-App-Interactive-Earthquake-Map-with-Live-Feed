package module6;

import java.util.*;//for built in sort

public class BuiltInSortingTest {
	
	public static void main(String args[]){
		
		Random random = new Random();
		List<Integer> numsToSort = new ArrayList<>();
		
		for(int i=0; i<5; i++){
			numsToSort.add(random.nextInt(100));
		}
		//this is the built in sort and how you call it--if you want a helper sort - just call the class.method(passinList)
		Collections.sort(numsToSort);
		System.out.println("New array after sorting: " + numsToSort.toString());
		
	}

}

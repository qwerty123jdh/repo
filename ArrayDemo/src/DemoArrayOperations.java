import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers= {123,34,55,65,65,78};
		//Arrays.fill(numbers, 0);
		//for(int x:numbers) {
			//System.out.println(x);
		//}
		Arrays.fill(numbers,1,3, 5);
		for(int x:numbers) {
			System.out.println(x);
		}
		System.out.println("**********************************");
		int [] arr_copy=Arrays.copyOf(numbers, 5);
		for(int x:arr_copy) {
			System.out.println(x);
		}
		
		System.out.println("**********************************");
		String [] names= {"ABC","XYZ","LMN","ASDF"};
		String [] names1= {"ABC","XYZ","LMN","ASD"};
		
		boolean data=Arrays.equals(names, names1);
		if(data)
		{
			System.out.println("two values are equal");
		}
		
		System.out.println("**********************************");
		Arrays.sort(numbers);
		for(int x:numbers) {
			System.out.println(x);
		}
		
		System.out.println("**********************************");
		int index=Arrays.binarySearch(numbers, 1234);
		System.out.println(index);
		
		
	}
	
}

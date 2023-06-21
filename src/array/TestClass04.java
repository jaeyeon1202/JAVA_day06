package array;

public class TestClass04 {

	public static void main(String[] args) {
		
		int[] arr= {100, 200, 300};
		double [] dos= {1.11, 2.11,3.11};
		String[] str= {"a","b","c"};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		for(double doo: dos) {
			System.out.println(doo);
		}
		
		for(String r: str) {
			System.out.println(r);
		}

	}

}

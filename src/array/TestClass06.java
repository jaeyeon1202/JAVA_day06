package array;

import java.util.Scanner;

public class TestClass06 {

	public static void main(String[] args) {
		
		int arr[]= {10, 54, 13, 17, 25, 30};
		
		Scanner input= new Scanner(System.in);
		String s=null;
		
		
		System.out.print("홀,짝 입력: ");
		s=input.next();
		
		for(int all : arr) {
			if(s.equals("짝수")) {
				if(all %2==0) {
					System.out.println("짝수: "+all);
				}
			}else if(s.equals("홀수")) {
				if(all%2 !=0) {
					System.out.println("홀수: "+all);
				}
			}
		}

	}

}

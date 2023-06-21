package array;

import java.util.Scanner;

public class TestClass07 {

	public static void main(String[] args) {
		int arr[]= {10, 54, 13, 17, 25, 30};
		
		Scanner input= new Scanner(System.in);
		String s=null;
		
		
		System.out.print("홀,짝 입력: ");
		s=input.next();
		
		for(int i=0; i<arr.length;i++) {
			if(s.equals("짝수") && i%2==0) 
				System.out.println(i+":"+arr[i]);
			else if(s.equals("홀수") && i%2 !=0) 
				System.out.println(i+":"+ arr[i]);
			}
		
		System.out.println("===============");
		
		int k=0;
		if(s.equals("짝")){
			k=0;
		}else {
			k=1;
		}
		for(; k<arr.length;k+=2) {
			System.out.println(k+":"+arr[k]);
		}
		System.out.println("===================");
		//(변수)=(조건식)?참:거짓
		for(int i= (s.equals("짝수"))? 0:1; i<arr.length;i+=2) {
			System.out.println(i+":"+arr[i]);
		}
		
		
		
		}

	}



package list;

import java.util.ArrayList;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		 * 문제 : 최대값 찾기

주어진 숫자 리스트에서 최대값을 찾는 프로그램을 작성하세요.
========================================
문제 조건:

1. 입력값 : 숫자리스트 numbers 를 입력하세요

2. List의 구현체로 ArrayList를 사용하고 동적으로 값을 추가하세요

3. 길이는 1 이상이며, 중복된 숫자는 없습니다

ex) 
numbers.add(3);
numbers.add(7); ... 

4. 출력값으로 이 numbers에서 최대값을 출력하세요
		 */
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		
		int maxValue = Integer.MIN_VALUE;
		
		for(int number : numbers) {
			if(number>maxValue) {
				maxValue=number;
			}
		}
		System.out.println("가장 큰 값: "+maxValue);

	}

}

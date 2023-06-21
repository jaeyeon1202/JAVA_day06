package list;

import java.util.ArrayList;

public class TestClass03 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		//contains: 이러한 값이 있는지 없는지 확인해준다 (true / false)
		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("없는 값"));
		
		boolean bool = arr.contains("없는값");
		System.out.println("bool: "+bool);
		
		System.out.println("=====remove====");
		System.out.println("삭제 전: "+arr);
		//remove -> index로 삭제
		arr.remove(0);
		System.out.println("0번째 삭제 후 값(index): "+arr);
		
		//데이터로도 삭제 가능
		arr.remove("333");
		System.out.println("데이터 삭제: "+arr);
	
	
	}

}

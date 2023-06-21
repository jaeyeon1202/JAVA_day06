package array;

import java.util.Scanner;

public class TestClass08 {

	public static void main(String[] args) {
		
		String[] id = new String[5];
		String[] pwd = new String [5];
		
		Scanner input = new Scanner(System.in);
		
		String ID=null, PWD=null;
		int i=0;
		
		boolean check=true;
		
		while(check) {
			System.out.print("\n\n1.로그인 \n2.회원가입 \n3.모든 회원보기");
			int choice=0;
			System.out.print("\n선택: ");
			choice=input.nextInt();
			
			switch(choice) {
			case 1:{ //로그인
				System.out.print("비교 id 입력: ");
				ID = input.next();
				System.out.print("비교 pwd 입력: ");
				PWD= input.next();
				for(i=0; i<id.length; i++) {
					if(id[i].equals(ID) && pwd[i].equals(PWD)) {
						System.out.println("로그인성공");
						break;
					}else if(ID.equals(id[i])) {
						System.out.println("비밀번호 틀림");
						break;
					}else if(PWD.equals(pwd[i])) {
						System.out.println("존재하지 않는 ID입니다.");
						break;
					}
				break;
				}
			break;	
			}
			case 2:{ //회원가입
				for(i=0; i<id.length;i++) {
					System.out.print("저장할 id입력: ");
					ID=input.next();
					System.out.print("저장할 pwd입력: ");
					PWD=input.next();
					
					if(ID.equals(id[i])) {
						System.out.println("존재하는 id 입니다.");
						System.out.println("다시 입력...");
						continue;
					}else {
						id[i]=ID;
						pwd[i]=PWD;
						System.out.println("등록되었습니다!");
						break;}
				}break;
				
			}
			case 3:{//모든 회원 보기
				if(id[i]==null && pwd[i]==null) {
					System.out.println("등록된 회원이 없습니다.");
					break;
				}
				System.out.println("id\tpassword");
				System.out.println("-------------------");
					for(int k=0; id[k]!=null;k++) 
						System.out.println(id[k]+"\t"+pwd[k]);
				break;
			}
			}
		}
	}

}

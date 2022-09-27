package EWords;

import java.util.Scanner;

public class WordManager {
	private Word W=new Word();
	
	Scanner in=new Scanner(System.in);
	
	WordManager(){
		
		for(;;) {
			menu();{
				int no=in.nextInt();
				in.nextLine();
				if(no==1) {
					Input();
				}else if(no==2) {
					Del();
				}else if(no==3) {
					Search();
				}else if(no==4) {
					Prt();
				}else if(no==5) {
					Modi();
				}else if(no==6) {
					break;
				}
				
				
				}
		}
	}
	
	public void menu() {
		System.out.println("1. 단어추가");
		System.out.println("2. 단어삭제");
		System.out.println("3. 단어검색");
		System.out.println("4. 전체보기");
		System.out.println("5. 단어수정");
		System.out.println("6. 종료");
		System.out.println("메뉴의 번호를 입력해주세요");
	}
	
	public void Input() {
		wordMean temp = new wordMean();
		
		System.out.println("영단어를 입력하세요");
		String a=in.nextLine();
		System.out.println("단어의 뜻을 입력하세요");
		String b=in.nextLine();
		System.out.println("단어의 중요도를 상중하로 입력하세요");
		String c=in.nextLine();
		temp.mean=b;
		temp.level=c;
		W.input(a,temp);
	}
	
	public void Del() {
		System.out.println("삭제할 단어를 입력하세요");
		String a=in.nextLine();
		W.del(a);
	}
	
	public void Search() {
		System.out.println("검색할 단어를 입력하세요");
		String a=in.nextLine();
		W.search(a);
	}
	
	public void Prt() {
		W.prt();
	}
	
	public void Modi() {
		W.mod();
	}
	
	
	
	
}

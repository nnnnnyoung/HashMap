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
		System.out.println("1. �ܾ��߰�");
		System.out.println("2. �ܾ����");
		System.out.println("3. �ܾ�˻�");
		System.out.println("4. ��ü����");
		System.out.println("5. �ܾ����");
		System.out.println("6. ����");
		System.out.println("�޴��� ��ȣ�� �Է����ּ���");
	}
	
	public void Input() {
		wordMean temp = new wordMean();
		
		System.out.println("���ܾ �Է��ϼ���");
		String a=in.nextLine();
		System.out.println("�ܾ��� ���� �Է��ϼ���");
		String b=in.nextLine();
		System.out.println("�ܾ��� �߿䵵�� �����Ϸ� �Է��ϼ���");
		String c=in.nextLine();
		temp.mean=b;
		temp.level=c;
		W.input(a,temp);
	}
	
	public void Del() {
		System.out.println("������ �ܾ �Է��ϼ���");
		String a=in.nextLine();
		W.del(a);
	}
	
	public void Search() {
		System.out.println("�˻��� �ܾ �Է��ϼ���");
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

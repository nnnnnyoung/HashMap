package EWords;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class wordMean{
	String mean;
	String level;
}

public class Word {
	
	private HashMap <String, wordMean> Word=new HashMap<>();
	private Scanner in=new Scanner(System.in);

	
	   public void input(String a, wordMean temp) {
		      if(Word.get(a)!=null) {
		         System.out.println("�ߺ��� �ܾ��Դϴ�.");
		      }else {         
		         Word.put(a, temp);
		         System.out.println("�Է¿Ϸ�");
		      }
		      
		   }

	
	public void del(String a) {
		if(Word.get(a)==null) {
			System.out.println("������ �ܾ �����ϴ�.");
		}else {
			Word.remove(a);
			System.out.println("�����Ϸ�");
		}
	}
	
	
	public void prt() {
        for (Entry<String, wordMean> entry : Word.entrySet()) {
            System.out.println
            ("[�ܾ�]:" + entry.getKey() + " [��]:" + entry.getValue().mean+" [���̵�]:" + entry.getValue().level);

        }
        if(Word.size()==0) {
        	System.out.println("����� �ܾ �����ϴ�.");
        }

	}
	
	public void mod() {
		System.out.println("������ �ܾ �Է��ϼ���");
		String a=in.nextLine();
		if(Word.get(a)==null){
			System.out.println("������ �ܾ �����ϴ�.");
			return;
		}
		System.out.println(a+"�� ���� �������� �����ұ��?");
		String b=in.nextLine();
		System.out.println(a+"�� ���̵��� �������� �����ұ��?");
		String c=in.nextLine();
		wordMean temp = new wordMean();
		temp.mean=b;
		temp.level=c;
		Word.put(a, temp);
		System.out.println("�����Ϸ�");
	}
	
	public void search(String a) {
        //for (Entry<String, wordMean> entry : Word.entrySet()) {
		for (Map.Entry<String, wordMean> entry : Word.entrySet()) {
            if(entry.getKey().contains(a)) {
            	System.out.println("[�ܾ�]: "+entry.getKey()+ " [��]:" + entry.getValue().mean+" [���̵�]:" + entry.getValue().level);
            	return;
            }
            System.out.println("�ش��ϴ� �ܾ �������� �ʽ��ϴ�.");
        }
		
	}
	

}

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
		         System.out.println("중복된 단어입니다.");
		      }else {         
		         Word.put(a, temp);
		         System.out.println("입력완료");
		      }
		      
		   }

	
	public void del(String a) {
		if(Word.get(a)==null) {
			System.out.println("삭제할 단어가 없습니다.");
		}else {
			Word.remove(a);
			System.out.println("삭제완료");
		}
	}
	
	
	public void prt() {
        for (Entry<String, wordMean> entry : Word.entrySet()) {
            System.out.println
            ("[단어]:" + entry.getKey() + " [뜻]:" + entry.getValue().mean+" [난이도]:" + entry.getValue().level);

        }
        if(Word.size()==0) {
        	System.out.println("저장된 단어가 없습니다.");
        }

	}
	
	public void mod() {
		System.out.println("수정할 단어를 입력하세요");
		String a=in.nextLine();
		if(Word.get(a)==null){
			System.out.println("수정할 단어가 없습니다.");
			return;
		}
		System.out.println(a+"의 뜻을 무엇으로 수정할까요?");
		String b=in.nextLine();
		System.out.println(a+"의 난이도를 무엇으로 수정할까요?");
		String c=in.nextLine();
		wordMean temp = new wordMean();
		temp.mean=b;
		temp.level=c;
		Word.put(a, temp);
		System.out.println("수정완료");
	}
	
	public void search(String a) {
        //for (Entry<String, wordMean> entry : Word.entrySet()) {
		for (Map.Entry<String, wordMean> entry : Word.entrySet()) {
            if(entry.getKey().contains(a)) {
            	System.out.println("[단어]: "+entry.getKey()+ " [뜻]:" + entry.getValue().mean+" [난이도]:" + entry.getValue().level);
            	return;
            }
            System.out.println("해당하는 단어가 존재하지 않습니다.");
        }
		
	}
	

}

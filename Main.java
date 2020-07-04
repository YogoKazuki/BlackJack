public class Main {
	public static void main(String[] args) {
		User a = new User();
		Dealer b = new Dealer();
		a.setCard(b.deal());
		a.myCard.forEach(s -> System.out.print("「"+s+"」"));
		System.out.println("ユーザーにカードが配られました");
		b.setCard(b.deal());
		b.myCard.forEach(s -> System.out.print("「"+s+"」"));
		System.out.println("ディーラーもカードをセットしました");
		System.out.println("各々hitするかどうか検討しています");
	
			while(a.checkSum()==true) {
				a.setCard(b.hit());
			}	
			while(b.checkSum()==true) {
				b.setCard(b.hit());
			}	
		a.myCard.forEach(s -> System.out.print("「"+s+"」"));
		System.out.println();
		b.myCard.forEach(s -> System.out.print("「"+s+"」"));
		System.out.println();
		System.out.println("ユーザーのポイントは"+a.open());
		System.out.println("ディーラーのポイントは"+b.open());
		if(a.open()>21 && b.open()>21 || a.open()==b.open()) {
			System.out.println("引き分けです");
		}else if((b.open()<=21 && a.open()<b.open()) 
				|| (b.open()<=21 && a.open()>21) 
				|| (a.open()<=21 && b.open()<=21 && a.open()<b.open())){
			System.out.println("あなたの負けです");
		}else if((a.open()<=21 && a.open()>b.open())
				|| (a.open()<=21 && b.open()>21)
				||  (a.open()<=21 && b.open()<=21 && b.open()<a.open())) {
			System.out.println("あなたの勝ちです");
		}else {
			System.out.println("わかりません");
		}
}
}
import java.util.ArrayList;
public class User extends Human{

//	手札をオープンして数字の合計を計算するメソッド
//	1は本来1にも11にもなれますが今回は自動で完結する仕様のため
//	1でしか計算できないようにしてあります
//	11以上のカードは10で計算される仕様にもなっています
	public int open() {
		int myPoint =0;
		for(int i=0;i<myCard.size();i++) {
		if(myCard.get(i)>10) {
			myPoint+=10;
		}else {
			myPoint += myCard.get(i);
		}
		}
		return myPoint;

	}
//	このメソッドを使って引いたカードを手札に加えます
	public void setCard(ArrayList <Integer> drowCard) {
		for(int i=0;i<drowCard.size();i++ ) {
			this.myCard.add(drowCard.get(i));
		}


	}
//	自動で完結する仕様のため、ユーザーは現在の手札の合計が
//	14以上になればカードをドローしなくなります
	public boolean checkSum() {

		if(14>open()) {
			return true;
		}else {
			return false;
		}


	}
}

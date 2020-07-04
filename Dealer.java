import java.util.ArrayList;
import java.util.Collections;
public class Dealer extends Human{
//	ゲームで配る山札
	protected ArrayList<Integer> cards;

//	コンストラクターでディーラーが山札を作成しシャッフル
	public Dealer(){
		this.myCard = new ArrayList<Integer>();
		this.cards = new ArrayList<Integer>();
		for(Integer i=1;i<=4;i++) {
			for(Integer ii=1;ii<=13;ii++) {
				cards.add(ii);
			}
		}
		Collections.shuffle(cards);

	}

//	手札をオープンして数字の合計を計算するメソッド
//	1は本来1にも11にもなれますが今回は自動で完結する仕様のため
//	1でしか計算できないようにしてあります
//	11以上のカードは10で計算される仕様にもなっています
	public int open() {

		int myPoint =0;
		for(int i=0;i<myCard.size();i++) {
			if(myCard.get(i)>10) {
				myPoint += 10;
			}else
			myPoint += myCard.get(i);
		}
		return myPoint;
	}

//	このメソッドを使って引いたカードを手札に加えます
	public void setCard(ArrayList<Integer> drowCard) {

		for(int i=0;i<drowCard.size();i++) {
			this.myCard.add(drowCard.get(i));

		}


	}

//	山札からカードを二枚引き戻り値に入れる
	public ArrayList<Integer> deal(){
		ArrayList<Integer> dealCard = new ArrayList<Integer>();

			for(int i=1;i<=2;i++) {
				dealCard.add(this.cards.get(0));
				this.cards.remove(0);
			}
		return dealCard;


	}

//	山札からカードを一枚引き戻り値に入れる
	public ArrayList<Integer> hit(){
		ArrayList<Integer> hitCard = new ArrayList<Integer>();
		hitCard.add(this.cards.get(0));
		this.cards.remove(0);
		return hitCard;
	}

//	自動で完結する仕様のため、ディーラーは現在の手札の合計が
//	16以上になればカードをドローしなくなります
	public boolean checkSum() {

		while(16>open()) {
			return true;
		}
		return false;
	}
}


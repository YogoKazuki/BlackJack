import java.util.ArrayList;
//DealerとUserに共通する情報を定義
abstract class Human {
//	自分の手札
	protected ArrayList<Integer> myCard = new ArrayList<Integer>();
	
	public abstract int open();
	public abstract void setCard(ArrayList<Integer> aaa);
	public abstract boolean checkSum();
}

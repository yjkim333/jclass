package j0121;

// card 1장
class Card {
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	String[] s = {"","Spade","Diamond","Heart","Clover"};
	int number;
	String shape;

	Card(){}
	Card(String shape,int number){
		this.shape=shape;
		this.number=number;
	}
	
	
	@Override
	public String toString() {
		return "[ "+shape+", "+n[number]+" ]";
	}
	
}

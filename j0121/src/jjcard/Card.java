package jjcard;

class Card {
	
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	int shape;
	int number;
	
	Card(){
		shape = 0;
		number = 1;
	}
	
	Card(int shape,int number){
		this.shape = shape;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.format("[ %s, %s ]", s[shape],n[number]);
	}
	
}

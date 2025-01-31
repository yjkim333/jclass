package j0131;

public class Refrigerator extends Product{
	private int size;
	private int door;
	private String color;

	public Refrigerator(){
		this("LRefrigerator",900000,90000,200,4,"white");
	}
	public Refrigerator(String name, int price, int point, int size, int door , String color){
		setName(name);
		setPrice(price);
		setPoint(point);
		this.size = size;
		this.door = door;
		this.color = color;
	}
}

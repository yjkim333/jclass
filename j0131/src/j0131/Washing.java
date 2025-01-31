package j0131;

public class Washing extends Product{
	private int kg;
	private String type;
	private boolean dry;
	
	//기본생성자
	public Washing(){
		this("LWASH",1200000,120000,9,"drum",false);
	}
	public Washing(String name, int price, int point, int kg, String type , boolean dry){
		setName(name);
		setPrice(price);
		setPoint(point);
		this.kg = kg;
		this.type = type;
		this.dry = dry;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isDry() {
		return dry;
	}
	public void setDry(boolean dry) {
		this.dry = dry;
	}
	
}

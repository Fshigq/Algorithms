package basics;

public class Counter {
	public Counter(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		num = 0;
	}
	public void increment() {
		num++;
	}
	
	public int tally(){
		return num;
	}
	
	public String toString() {
		return num + "" +id;
	}
	private String id;
	private int num;
}

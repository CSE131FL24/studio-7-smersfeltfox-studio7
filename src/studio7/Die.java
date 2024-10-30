package studio7;

public class Die {

	private int sides;
	
	public Die (int sides) {
		this.sides = sides;
	}
	public int roll() {
		return (int)(Math.random()*this.sides+1);
	}
	
	public String toString() {
		return ("this die has " + this.sides + " sides");
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(6);
		System.out.println(d1.roll() + d1.toString());
	}
}

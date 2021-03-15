
public class Square {

	private int side;
	
	public Square() {
		this.side = 1;
	}
	
	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return this.side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	
}

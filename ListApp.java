
public class ListApp {

	public static void main(String[] args) {

		FirstList<String> stringList = new FirstList<String>();
		FirstList<Square> squareList = new FirstList<Square>();
		FirstList<Point> pointList = new FirstList<Point>();
		
		
		//Add items and iterate through String List
		stringList.addItem("This");
		stringList.addItem("is");
		stringList.addItem("a");
		stringList.addItem("test");
		
		stringList.setCurrentItem(0);
		while (stringList.getCurrentItem() < 4) {
			System.out.println(stringList.getItem());
			stringList.setCurrentItem(stringList.getCurrentItem() + 1);
		}
		
		//Add items and iterate through Square List
		squareList.addItem(new Square());
		squareList.addItem(new Square(2));
		squareList.addItem(new Square(3));
		squareList.addItem(new Square(4));
		
		squareList.setCurrentItem(0);
		while (squareList.getCurrentItem() < 4) {
			System.out.println(squareList.getItem());
			squareList.setCurrentItem(squareList.getCurrentItem() + 1);
		}
		
		pointList.addItem(new Point(0,0,0));
		pointList.addItem(new Point(1,1,1));
		pointList.addItem(new Point(2,2,2));
		pointList.addItem(new Point(3,3,3));
		
		
		pointList.setCurrentItem(0);
		while (pointList.getCurrentItem() < 4) {
			System.out.println(pointList.getItem());
			pointList.setCurrentItem(pointList.getCurrentItem() + 1);
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		// Create instances of Circle, Rectangle, and Cuboid
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Cuboid cuboid = new Cuboid(3.0, 2.0, 5.0);

        // Calculate and display their respective areas or volume
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
    }


	}


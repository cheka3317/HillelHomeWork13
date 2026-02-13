package app;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[3];

        figures[0] = new Circle(5);
        figures[1] = new Square(4);
        figures[2] = new Triangle(6, 3);

        double totalArea = 0;

        for (Figure figure : figures) {
            totalArea += figure.getArea();
        }

        System.out.println("Total area: " + totalArea);
    }
}


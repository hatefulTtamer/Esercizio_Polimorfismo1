/* A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura */

class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(8, 4);
        Rectangle rectangle2 = new Rectangle(6, 16);
        Rectangle rectangle3 = new Rectangle(22, 12);
        Triangle triangle1 = new Triangle(8, 4);
        Triangle triangle2 = new Triangle(6, 16);
        Triangle triangle3 = new Triangle(22, 12);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle3.calculateArea());
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle2.calculateArea());
        System.out.println(triangle3.calculateArea());
    }
}
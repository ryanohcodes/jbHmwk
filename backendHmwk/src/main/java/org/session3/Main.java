package org.session3;

public class Main {
    public static void main(String[] args) {
//        //Basic Syntax
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the first number");
//        double inputOne = Double.parseDouble(scanner.nextLine());
//        System.out.println("Please enter the second number");
//        double inputTwo = Double.parseDouble(scanner.nextLine());
//        BasicSyntax basicSyntax = new BasicSyntax(inputOne,inputTwo);
//        System.out.println(basicSyntax);
//        // Data Types
//        DataType dataType = new DataType(scanner);
//        System.out.println(dataType.start());
//        // Control Structure
//        System.out.println(ControlStructure.finder());
//        // Arrays...find the largest number
//        System.out.println(LargestInArray.largestNumber());
//        //Control Structure
//        System.out.println(VowelCounter.counter());
//        //Rectange
//        Rectangle rectangle = new Rectangle(10,5);
//        System.out.println(rectangle.area());
        Lion lion = new Lion(33,"Leo",100,"hunter","yellow");
        Tiger tiger = new Tiger(22, "Tigger", 30000, "hunter");
        Turtle turtle = new Turtle(11,"Turt",100,"gather");
        Zone hunterZone = new Zone();
        Zone herbivoreZone = new Zone();
        hunterZone.add(lion);
        hunterZone.add(tiger);
        hunterZone.add(turtle);
        herbivoreZone.add(turtle);
        herbivoreZone.add(lion);
        herbivoreZone.add(tiger);
        System.out.println(hunterZone);
        System.out.println(herbivoreZone);

    }
}
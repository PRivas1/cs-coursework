public class CarMain {
    public static void main(String[] args) {
        Car carArray[] = new Car[3];

        carArray[0] = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8);
        carArray[1] = new Car("Honda", "Civic", 2018, 29.7, 41899, 11, 6);
        carArray[2] = new Car("BMW", "330i", 2005, 17.2, 174892, 14, 3);

        System.out.println("\n[Start]\n");
        System.out.println(carArray[0] + "\n");
        System.out.println(carArray[1] + "\n");
        System.out.println(carArray[2] + "\n");

        carArray[0].drive(5);
        carArray[1].drive(5);
        carArray[2].drive(5);

        System.out.println("\n[Drive]\n");
        System.out.println(carArray[0] + "\n");
        System.out.println(carArray[1] + "\n");
        System.out.println(carArray[2] + "\n");

        carArray[0].fillTank(5);
        carArray[1].fillTank(5);
        carArray[2].fillTank(5);

        System.out.println("\n[Fill Tank]\n");
        System.out.println(carArray[0] + "\n");
        System.out.println(carArray[1] + "\n");
        System.out.println(carArray[2] + "\n");

        System.out.println("\n[Remaining Fuel]\n");
        System.out.println(carArray[0].getFuelRemaining() + "\n");
        System.out.println(carArray[1].getFuelRemaining() + "\n");
        System.out.println(carArray[2].getFuelRemaining() + "\n");

    }
}

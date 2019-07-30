
public class Temperature {


    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double fahrenheit;
        double celius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celius");
            System.out.println("2. Celius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter the choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celius: " + fahrenheittoCelius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celius: ");
                    celius = input.nextDouble();
                    System.out.println("Celius to Fahrenheit: " + celiustoFahrenheit(celius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double fahrenheittoCelius(double fahrenheit) {
        double celius = (5.0 / 9) * (fahrenheit - 32);
        return celius;
    }

    public static double celiustoFahrenheit(double celius) {
        double fahrenheit = (9.0 / 5) * celius + 32;
        return fahrenheit;
    }
}

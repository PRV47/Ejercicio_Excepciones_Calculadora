import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Numero uno: ");
            double num1 = reader.nextDouble();
            System.out.print("Numero dos: ");
            double num2 = reader.nextDouble();

            System.out.println("Que operacion desea realizar? Ingrese el numero apropiado para la operacion.");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicacion");
            System.out.println("4 - Division");
            int choice = reader.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0){
                        System.out.println("Error. Division por cero no permitida.");
                    } else {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error. Ingrese solo valores numericos.");
        }
    }
}
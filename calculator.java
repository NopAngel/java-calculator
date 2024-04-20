import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dos números:");
        double numOne = scanner.nextDouble();
        double numTwo = scanner.nextDouble();

        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int choice = scanner.nextInt();

        double result = 0.0;
        switch (choice) {
            case 1:
                result = numOne + numTwo;
                break;
            case 2:
                result = numOne - numTwo;
                break;
            case 3:
                result = numOne * numTwo;
                break;
            case 4:
                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("Resultado: " + result);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_howardpadgett1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Examen1P1_HowardPadgett1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Estrella de David");
        System.out.println("2. Código binario sumado");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                int altura = 5;

                for (int i = altura; i >= 1; i--) {
                    for (int j = altura - i; j > 0; j--) {
                        System.out.print(" ");
                    }

                    System.out.print("*");

                    if (i < altura) {
                        for (int j = 1; j <= 2 * i - 3; j++) {
                            System.out.print(" ");
                        }

                        System.out.print("*");
                    }

                    System.out.println();
                }

                for (int i = 1; i <= altura; i++) {
                    for (int j = altura - i; j > 0; j--) {
                        System.out.print(" ");
                    }

                    System.out.print("*");

                    if (i < altura) {
                        for (int j = 1; j <= 2 * i - 3; j++) {
                            System.out.print(" ");
                        }

                        System.out.print("*");
                    }

                    System.out.println();
                }

                for (int i = 1; i <= altura * 2 - 1; i++) {
                    System.out.print("*");
                }
                break;

            case 2:
                scanner.nextLine(); // Limpiar el búfer de entrada

                System.out.print("Ingrese el texto: ");
                String input = scanner.nextLine();

                String binary = textToBinary(input);
                String result = binarySum(binary);

                System.out.println("Texto en binario: " + binary);
                System.out.println("Resultado de la suma binaria: " + result);
                break;

            default:
                System.out.println("¡Hasta luego!");
        }

        scanner.close();
    }

    public static String textToBinary(String text) {
        String binary = "";
        int i = 0;

        while (i < text.length()) {
            String binaryChar = Integer.toBinaryString(text.charAt(i));
            binary += binaryChar;
            i++;
        }

        return binary;
    }

    public static String binarySum(String binary) {
        char[] binaryChars = binary.toCharArray();

        int lastChar = Character.getNumericValue(binaryChars[binaryChars.length - 1]);
        lastChar++;

        if (lastChar > 1) {
            lastChar = 0;
        }

        binaryChars[binaryChars.length - 1] = Character.forDigit(lastChar, 10);

        return String.valueOf(binaryChars);
    }
}
        // TODO code application logic here
    
    


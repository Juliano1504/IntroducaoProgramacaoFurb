/* Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal. */

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char letra = teclado.next().charAt(0);

        letra = Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }
        teclado.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numprimos;

import java.util.Scanner;

/**
 *
 * @author David Antonio Quijano Ramos
 */
public class Primos {

    public static void main(String[] args) {

        boolean primo = false;
        int numero;

        do {
            System.out.print("Porfavor ingrese un Numero Primo :");
            Scanner scanner = new Scanner(System.in);

            numero = scanner.nextInt();
            
            for (int num = numero; num > 1; num--) {
                primo = true;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        primo = false;
//            System.out.println("Ingrese un numero Primo");

                    }

                }
                if (primo) {

                    System.out.print("- " + num + " ");
//        System.out.println("Los numeros primos son :" + num);
                }
            }

        } while (primo == false);

    }
}

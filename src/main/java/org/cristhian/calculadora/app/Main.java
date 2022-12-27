package org.cristhian.calculadora.app;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Bienvenido esto es una simple calculadora");
        Scanner sc = new Scanner(System.in);
    int operacion = 0;
        while (operacion != 5){

            System.out.println("Ingrese la opcion deseada: \n" +
                    "1. Suma \n" +
                    "2. Restar \n" +
                    "3. Restar \n" +
                    "4. Dividir \n" +
                    "5. Salir \n" +
                    "");
            System.out.print("operacion:");
            operacion = sc.nextInt();

            while (operacion > 5 || operacion <= 0 ){
                System.out.println("Ingrese una operacion valido");
                operacion = sc.nextInt();
            }

    if (operacion == 5){
        break;
    }
            System.out.println("Numero 1:");
            int n1 = sc.nextInt();
            System.out.println("Numero 2:");
            int n2 = sc.nextInt();
            Operaciones op = new Operaciones(new BigDecimal(n1),new BigDecimal(n2));

            switch (operacion){
                case 1:
                    System.out.println("Resultado: "+ op.suma());
                    break;
                case 2:
                    System.out.println("Resultado: "+op.restar());
                    break;
                case 3:
                    System.out.println("Resultado: "+op.multiplicar());
                    break;
                case 4:
                    System.out.println("Resultado: "+op.division());
                    break;
            }

        }
    }
}
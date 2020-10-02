/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível
calcular as raízes, mostre a mensagem correspondente Impossivel calcular, caso haja uma divisão por 0 ou
raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.
Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem Impossivel calcular. Caso contrário,
imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo
abaixo. Imprima sempre o final de linha após cada mensagem. 

Bhaskara: x = (-b +- (raiz(b² -4ac))) / 2a
*/

import java.util.Scanner;
public class URI1036{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a, b, c, delta, R1, R2;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        delta = (Math.pow(b,2) - (4 * a * c));
        // System.out.println(delta);
        if (delta >= 0 && a != 0){
            R1 = (-b + Math.sqrt(delta))/(2*a);
            R2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        else{
            System.out.println("Impossivel calcular");
        }
    }
}



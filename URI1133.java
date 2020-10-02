/*
Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão
dele por 5 for igual a 2 ou igual a 3.
Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.
Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
*/

import java.util.Scanner;
public class URI1133{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X = teclado.nextInt(), Y = teclado.nextInt();
        int i, f, resto;
        if (X >= Y){
            i = Y+1;
            f = X;
        }
        else{
            i = X+1;
            f = Y;
        }
        while (i < f){
            resto = i%5;
            switch(resto){
                case 2:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
                default:
                    break;
            }
            i++;
        }
    }
}

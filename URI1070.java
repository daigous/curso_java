/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por
linha, inclusive o X ser for o caso.
Entrada
A entrada será um valor inteiro positivo.
Saída
A saída será uma sequência de seis números ímpares.
*/

import java.util.Scanner;
public class URI1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        X = teclado.nextInt();
        if (X%2 == 0){
            X++;
        }

        for (int contador = 1; contador <= 6; contador++){
            System.out.println(X);
            X+=2;
        }
    }
}
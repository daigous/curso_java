/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se
mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números
será positivo.
Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos
valores positivos digitados.
*/

import java.util.Scanner;
public class URI1064{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        float valor, total=0;
        int numPositivos=0;

        for(int contador = 1; contador <= 6; contador++){
            valor = teclado.nextFloat();
            if (valor > 0){
                numPositivos++;
                total = total + valor;
            }
        }
        System.out.println(numPositivos + " valores positivos"); // printando a quantidade de valores positivos
        System.out.printf("%.1f\n", total/numPositivos); // printando o cálculo da média
    }
}




/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta
informação.
Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.
Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
*/

import java.util.Scanner;
public class URI1065{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int valor, total=0, numPares=0;

        for(int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            if (valor%2 == 0){
                numPares++;
                total = total + valor;
            }
        }
        System.out.println(numPares + " valores pares"); // printando a quantidade de valores positivos
    }
}
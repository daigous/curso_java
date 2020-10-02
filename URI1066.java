/*
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados
foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.
Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.
Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após
cada uma.
*/

import java.util.Scanner;
public class URI1066{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int valor, resto;
        int pares=0, impares=0, positivos=0, negativos=0;

        for (int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            resto = valor % 2;

            if (resto == 0){
                pares++;
            }
            else{
                impares++;
            }

            if (valor > 0){
                positivos++;
            }
            else if (valor < 0){
                negativos++;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}


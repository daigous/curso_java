/*
Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual
a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre
eles (incluindo o N e M).
Entrada
O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter
um número nulo ou negativo.
Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
*/

import java.util.Scanner;
public class URI1101{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int M = teclado.nextInt(), N = teclado.nextInt();
        int a, b;
        int soma = 0;

        while(M > 0 && N > 0){
            if (M >= N){
                a = N;
                b = M;
            }
            else{
                a = M;
                b = N;
            }

            while (a <= b){
                System.out.print(a + " ");
                soma = soma + a;
                a++;
            }
            System.out.println("Sum=" + soma);
            M = teclado.nextInt();
            N = teclado.nextInt();
            soma = 0;
        }
    }
}
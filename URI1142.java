/*
Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão
apresentadas na execução do programa.
Entrada
O arquivo de entrada contém um número inteiro positivo N.
Saída
Imprima a saída conforme o exemplo fornecido.
*/

import java.util.Scanner;
public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();

        for (int cont1 = 1; cont1 <= N; cont1++){
            for (int cont2 = (cont1 * 4 - 3); cont2 < (cont1 * 4); cont2++){
                System.out.print(cont2 + " ");
            }
            System.out.println("PUM");
        }
    }
}
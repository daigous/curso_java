/*
Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que
serão apresentadas na execução do programa.
Entrada
O arquivo de entrada contém um número inteiro positivo N.
Saída
Imprima a saída conforme o exemplo fornecido.
*/

import java.util.Scanner;
public class URI1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int cont = 1; cont <= N; cont++){
            System.out.println(cont + " " + cont*cont + " " + cont*cont*cont);
        }
    }
}
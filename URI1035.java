/*
Leia 4 valores inteiros A, B, C e D. A seguir,
(1) se B for maior do que C;
(2) e se D for maior do que A;
(3) e a soma de C com D for maior que a soma de A e B;
(4) e se C e D, ambos, forem positivos;
(5) e se a variável A for par;
escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.
Saída
Mostre a respectiva mensagem após a validação dos valores.
*/

import java.util.Scanner;
public class URI1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
// Condições: (1)        (2)           (3)                  (4)                 (5)
        if ((B > C) && (D > A) && ((C+D) > (A+B)) && (C >= 0 && D >= 0) && ((A%2) == 0)){
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}
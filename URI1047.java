/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
Entrada
Quatro números inteiros representando a hora de início e fim do jogo.
Saída
Mostre a seguinte mensagem: O JOGO DUROU XXX HORA(S) E YYY MINUTO(S) .
*/

import java.util.Scanner;
public class URI1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int h1, m1, h2, m2, H, M;
        h1 = teclado.nextInt();
        m1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m2 = teclado.nextInt();
        m1 = m1 + (h1 * 60);
        m2 = m2 + (h2 * 60);
        if (m2 <= m1){
            m2 = m2 + (60 * 24);
        }
        H = (m2 - m1) / 60;
        M = (m2 - m1) % 60;
        System.out.println("O JOGO DUROU " + H + " HORA(S) E " + M + " MINUTO(S)");
    }
}
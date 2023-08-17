package br.senai.sp.joquempo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Projeto: Joquempo
 * Data: 17/08/2023
 * Autor: Vinicius Selhorst
 *
 * */

public class Joquempo {

    public static void main(String[] args) {


        int escolhaJogador, escolhaComputador;
        boolean continuar = true;

        /** Instanciar Scanner*/
        Scanner teclado = new Scanner(System.in);

        /** Instanciar Random */
        Random random = new Random();

        while(continuar) {

            /** Coleta de Dados */
            System.out.println("====================== JOQUEMPO =====================");
            System.out.println("\nVamos Jogar");
            System.out.print("Escolha 1= Pedra, 2= Papel ou 3= Tesoura: ");
            escolhaJogador = teclado.nextInt();
            System.out.println("=====================================================");

            /** Logica do Jogo */

            escolhaComputador = random.nextInt(3) + 1;
            System.out.println();

            switch (escolhaComputador) {

                case 1:
                    System.out.println("O PC escolheu Pedra!");
                    break;

                case 2:
                    System.out.println("O PC escolheu Papel!");
                    break;

                case 3:
                    System.out.println("O PC escolheu Tesoura!");
                    break;
            }

            if (escolhaComputador == escolhaJogador) {

                System.out.println("Empate!!");

            } else if ((escolhaJogador == 1 && escolhaComputador == 3) ||
                    (escolhaJogador == 2 && escolhaComputador == 1) ||
                    (escolhaJogador == 3 && escolhaComputador == 2)) {
                System.out.println("Voce Venceu");
            } else {
                System.out.println("O computador venceu!");
            }
        }
        }


    }


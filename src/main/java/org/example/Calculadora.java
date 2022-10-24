package org.example;

import model.entities.operacoes;
import java.util.Scanner;


public class Calculadora {
          public static void main(String[] args) {
            //Nota mental: tem que chamar a entities para poder importar ela
            operacoes op1 = new operacoes();

            String  operacao = "";
            int control=0;

            Scanner entrada = new Scanner(System.in);
            System.out.println("Bem vindo!");
            System.out.print("Digite um valor: ");
            //Nota mental: sempre lembrar do Integer.parseint nos cálculos
            op1.setValor1(Integer.parseInt(entrada.nextLine()));

            System.out.print("Digite a operação desejada: ");
            operacao = entrada.nextLine();

            System.out.print("Digite um valor: ");
            op1.setValor2(Integer.parseInt(entrada.next()));

            if(operacao.equals("+")) {
                System.out.println("O resultado da adição é: " + (op1.getSomar()));
                control++;
            }

            if(operacao.equals("-")) {
                System.out.println("O resultado da subtração é: " +(op1.getDiminuir()));
                control++;
            }

            if(operacao.equals("*")) {
                System.out.println("O resultado da multiplicação é: " +(op1.getMultiplicar()));
                control++;
            }

            if(operacao.equals("/")) {
                System.out.println("O resultado da divisão é: " +(op1.getDividir()));
                control++;
            }

            if(control == 0) {
                System.out.println("Operaçao inválida, Tente novamente!");

            }

        }
    }

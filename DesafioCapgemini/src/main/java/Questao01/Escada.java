package Questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
caractere * e espaços. A base e altura da escada devem ser iguais ao valor de
n. A última linha não deve conter nenhum espaço*/


public class Escada {
    public static void main(String[] args) {
        // Instancia a entrada do usuário se deseja continuar com o código rodando
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            // Loop para sempre perguntar ao usuário se deseja repetir a iteração
            System.out.println("Deseja inserir um valor de degraus? (s/n)");
            resposta = scanner.next();


            try{
                // Se o usuário digitar 's' inicia o programa desejado
                if(resposta.equals("s")){
                    System.out.println("Digite a quantidade de degraus para a escada: ");
                    Scanner degraus = new Scanner(System.in);
                    List<String> escada = new ArrayList<>();
                    int numDegraus = degraus.nextInt();

                    for(int i=0; i<numDegraus; i++){
                        // Cada degrau é adcionado no array de escada
                        escada.add(" ".repeat(numDegraus-i) + "*".repeat(i + 1));
                    }

                    // Para que cada degrau seja apresentado numa linha distinta
                    for (String j:escada){
                        System.out.println(j);
                    }
                }else{
                    // Para uma entrada diferente de 's' do usuário
                    System.out.println("Até logo");
                }

            } catch (Exception e){
                System.out.println("Até logo");
            }

        } while(!resposta.equals("n"));

    }
}

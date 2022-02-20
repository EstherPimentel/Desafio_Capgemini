package Questao02;

import java.util.Scanner;

/*
Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a
senha precisa ser forte. O site considera uma senha forte quando ela satisfaz
os seguintes critérios:

●	Possui no mínimo 6 caracteres.
●	Contém no mínimo 1 digito.
●	Contém no mínimo 1 letra em minúsculo.
●	Contém no mínimo 1 letra em maiúsculo.
●	Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se
é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o
número mínimo de caracteres que devem ser adicionados para uma string qualquer ser
considerada segura.

 */
public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String user = scanner.next();
        System.out.println("Digite a senha de acesso: ");
        String password = scanner.next();

        if(password(password))
            System.out.println("Sua senha é forte");
        else
            System.out.println("Sua senha não atende a todos os requisitos");
    }

        public static boolean password(String password) {
            if (password.length() < 6) return false;

            boolean number = false;
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean symbol = false;
            for (char c : password.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    number = true;
                } else if (c >= 'A' && c <= 'Z') {
                    upperCase = true;
                } else if (c >= 'a' && c <= 'z') {
                    lowerCase = true;
                } else {
                    symbol = true;
                }
            }
            return number && upperCase && lowerCase && symbol;

        }
    }





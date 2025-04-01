package teste;

import java.util.Scanner;

public class TestaOlaMundo {
    public static void main(String[] args) {
        OlaMundo warudo = new OlaMundo();
        warudo.imprimirDados();

        Scanner scanDados = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanDados.nextLine();

        System.out.print("Digite sua idade: ");
        int valor = scanDados.nextInt();

        warudo.imprimir(nome, valor);

    }
}

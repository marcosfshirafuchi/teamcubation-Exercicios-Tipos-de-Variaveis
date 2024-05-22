import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {
    /**
     * <h1> Teamcubation - Tipos de Variáveis</h1>
     * Exercício 4: Coleções - ArrayList<br><br>
     * Objetivo: Utilizar a classe ArrayList para armazenar e manipular uma lista de strings. Como: Criação de uma ArrayList para armazenar strings, Adição de elementos à lista, Impressão dos elementos da lista, Remoção de um elemento da lista, Impressão da lista após remoção
     * <p><br>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   21/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaString = new ArrayList<>();
        System.out.print("Digite a quantidade de elementos da lista: ");
        int quantidadeDeElementos = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quantidadeDeElementos; i++) {
            System.out.print("Digite o elemento da lista: ");
            String elemento = scanner.nextLine();
            listaString.add(elemento);
        }
        System.out.println();
        System.out.println("Elementos da Lista: ");
        for (String lista : listaString) {
            System.out.println(lista);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Digite o elemento a ser removida da lista:");
        String elementoBuscado = scanner.nextLine();
        boolean encontrou = false;
        for (int  i = 0 ; i<listaString.size(); i++) {
            String p = listaString.get(i);
            if (p.equals(elementoBuscado)) {
                listaString.remove(elementoBuscado);
                encontrou = true;
            }
        }
        System.out.println();
        if (encontrou == true) {
            System.out.printf("Impressão da lista após a remoção do elemento %s:\n ", elementoBuscado);
            for (String elementosAposRemocao : listaString) {
                System.out.println(elementosAposRemocao);
            }
        } else {
            System.out.println("Elemento não encontrado na lista!");
        }

        scanner.close();

    }
}


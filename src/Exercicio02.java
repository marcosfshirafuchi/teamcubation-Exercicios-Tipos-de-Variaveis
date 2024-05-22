public class Exercicio02 {
    /**
     * <h1> Teamcubation - Tipos de Variáveis</h1>
     * Exercício 2: Tipos Não Primitivos - String<br><br>
     * Objetivo: Declarar e inicializar variáveis do tipo String e realizar operações básica, como: Declaração e inicialização de variáveis do tipo String, Concatenação de strings, Impressão da mensagem, Tamanho da string
     * <p><br>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   21/05/2024
     */
    public static void main(String[] args) {
        String palavra1 = "Java é ";
        String palavra2 = "a melhor linguagem de programação!";
        String mensagem = palavra1 + palavra2;
        System.out.println(mensagem);
        System.out.println("Tamanho da mensagem = " + mensagem.length());
    }
}

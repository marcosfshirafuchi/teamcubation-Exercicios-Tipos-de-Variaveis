public class Exercicio03 {
    /**
     * <h1> Teamcubation - Tipos de Variáveis</h1>
     * Exercício 3: Arrays<br><br>
     * Objetivo: Declarar, inicializar e manipular um array de inteiros. Como: Declaração e inicialização de um array de inteiros, Impressão dos elementos do array, Cálculo e impressão da soma dos elementos do array
     * <p><br>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   21/05/2024
     */
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int soma=0;
        for (int i=0; i< numeros.length;i++){
            System.out.printf("Posição do vetor [%d] = %d\n",i,numeros[i]);
            soma+=numeros[i];
        }
        System.out.println("Soma dos vetores = " + soma);

    }
}

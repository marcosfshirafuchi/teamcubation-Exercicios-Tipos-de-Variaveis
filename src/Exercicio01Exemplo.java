public class Exercicio01Exemplo {
    public static class ValoresPadrao{
        byte valorByte;
        short valorShort;
        int valorInt;
        long valorLong;
        float valorFloat;
        double valorDouble;
        char valorChar;
        boolean valorBoolean;
    }

    public static void main(String[] args) {

        ValoresPadrao vp = new ValoresPadrao();
        System.out.println("Valor padrão de byte: " + vp.valorByte);
        System.out.println("Valor padrão de short: " + vp.valorShort);
        System.out.println("Valor padrão de int: " + vp.valorInt);
        System.out.println("Valor padrão de long: " + vp.valorLong);
        System.out.println("Valor padrão de float: " + vp.valorFloat);
        System.out.println("Valor padrão de double: " + vp.valorDouble);
        System.out.println("Valor padrão de char: " + vp.valorChar + "'");
        System.out.println("Valor padrão de boolean: " + vp.valorBoolean);

    }
}

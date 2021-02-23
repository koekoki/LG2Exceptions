package Execeptions;

public class Exercecao {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;
            System.out.println("não será impresso");
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("exeception indice sem valor");
        }
        System.out.println("após a exception");
    }
}

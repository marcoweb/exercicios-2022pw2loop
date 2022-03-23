public class Exercicio2 {
    public static void main(String[] args) {
        int vetor[] = {15, 20, 55, 10, 85, 36, 77, 56, 66, 25};
        int menorValor = vetor[0];
        int maiorValor = vetor[0];

        for(int i = 0;i < 10;i++) {
            if(vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
            if(vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }

        System.out.println("Menor Valor: " + menorValor);
        System.out.println("Maior Valor: " + maiorValor);
    }
}

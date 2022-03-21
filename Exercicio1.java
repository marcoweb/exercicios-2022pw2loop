public class Exercicio1 {
    public static void main(String[] args) {
        //Armazena a soma
        int soma = 0;
        // Percorre os números de 1 à 500
        for(int num = 1;num <= 500;num++) {
            // Verificar se o número é ímpar
            if((num % 2) != 0) {
                // Verifica se o número é multiplo de 3
                if((num % 3) == 0) {
                    // System.out.println(num);
                    // soma += num;
                    soma = soma + num;
                }
            }
        }
        System.out.println(soma);    
    }   
}
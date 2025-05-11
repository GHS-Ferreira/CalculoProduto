import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        try {
            double valorProduto = Double.parseDouble(scanner.nextLine());
            
            if (valorProduto <= 0) {
                System.out.println("Número inválido, tente novamente.");
            } else {
                double novoValor = calcularNovoValor(valorProduto);
                System.out.printf("Novo valor do produto: %.2f%n", novoValor);
            }
        } catch (NumberFormatException e) {
            System.out.println("Número inválido, tente novamente.");
        } finally {
            scanner.close();
        }
    }

    public static double calcularNovoValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }
        return valor * 1.10;  
}

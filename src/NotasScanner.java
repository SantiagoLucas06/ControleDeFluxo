import java.util.Scanner;

public class NotasScanner {
    private Scanner scanner;

    public NotasScanner() {
        scanner = new Scanner(System.in);
    }

    public double[] lerNotas() {
        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        return notas;
    }

    public void fecharScanner() {
        scanner.close();
    }
}
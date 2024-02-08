public class Main {
    public static void main(String[] args) {
        NotasScanner notasScanner = new NotasScanner();

        double[] notas = notasScanner.lerNotas();

        double media = calcularMedia(notas);

        verificarAprovacao(media);

        notasScanner.fecharScanner();
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void verificarAprovacao(double media) {
        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else if (media <= 5) {
            System.out.println("Aluno em recuperação com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }
}
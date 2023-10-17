package QuizConhecimentosGerais;

import java.util.Scanner;

public class Quiz {

    private Gabarito gabarito;
    private String[] gabRespostas;
    private String[] respostaUsuario;
    private int respCorreta;
    private int respErrada;
    private int totalPerguntas;

    public Quiz(int totalPerguntas, Gabarito gabarito) {
        this.totalPerguntas = totalPerguntas;
        this.gabarito = gabarito;
        this.respCorreta = 0;
        this.respErrada = 0;
        this.gabRespostas = new String[]{"c", "d", "c", "d", "a", "c", "d", "d", "a", "b"};
        ;
        this.respostaUsuario = new String[totalPerguntas];
    }

    public void executarQuiz() {
        Scanner leia = new Scanner(System.in);
        String op;

        do {
            LimparTela.limpatela();
            System.out.println("----------------------------------");
            System.out.println(" QUIZ CONHECIMENTOS GERAIS");
            System.out.println("----------------------------------");

            for (int i = 0; i < totalPerguntas; i++) {
                ImprimeQuestao.imprimirQuestao(Perguntas.perguntas[i]);
                System.out.print("DIGITE A ALTERNATIVA CORRETA (A) (B) (C) (D): \n -> ");
                String resposta = leia.nextLine().toLowerCase();
                respostaUsuario[i] = resposta;
                boolean condicaoRespCorreta = respostaUsuario[i].equals(gabRespostas[i]);

                if (condicaoRespCorreta) {
                    respCorreta++;
                    System.out.println("Acertou o/\n");
                } else {
                    respErrada++;
                    System.out.println("Errou :'(. A resposta correta é: " + gabRespostas[i] + " \n");
                }
            }

            LimparTela.limpatela();
            ResumoImpresso.imprimirResumo(respCorreta, respCorreta, totalPerguntas, respostaUsuario, gabRespostas);

            //Refaça o quiz caso o usuario não tenha atingido 60% de acertos.
            System.out.print("Deseja tentar outra vez? [S/N]: ");
            op = leia.nextLine();

            LimparTela.limpatela();

        } while (op.equalsIgnoreCase("s"));

        System.out.println();
        System.out.println("QUIZ CONCLUÍDO, ATÉ BREVE!!!");
        System.out.println();

        new ImprimeQuestao();
    }

    // procedimento para imprimir o resumo do quiz
    private void imprimirResumo() {
        System.out.println("============== Resumo do Quiz ==============");
        System.out.println(" Pergunta  |  Resposta escolhida  | Resposta correta  | Correção ");
        for (int i = 0; i < totalPerguntas; i++) {
            String numeroFormatado = String.format("%02d", i + 1);
            String correcao = respostaUsuario[i].equals(gabRespostas[i]) ? "v" : "X";
            System.out.println("     " + numeroFormatado + "     |          " + respostaUsuario[i] + "            |         "
                    + gabRespostas[i] + "          |     " + correcao);
        }
        int porcentagemAcertos = (respCorreta * 100) / totalPerguntas;
        System.out.println();
        System.out.println("Você acertou " + respCorreta + " e errou " + respErrada + " de " + totalPerguntas + " perguntas.");

        if (porcentagemAcertos >= 60) {
            System.out.println("Você passou com " + porcentagemAcertos + "% de acertos");
        } else {
            System.out.println("Você NÃO passou com somente " + porcentagemAcertos + "% de acertos");
        }
    }
}
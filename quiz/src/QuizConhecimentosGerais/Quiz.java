package QuizConhecimentosGerais;

import java.util.Scanner;

public class Quiz {

    private String[] gabRespostas;
    private String[] respostaUsuario;
    private int respCorreta;
    private int respErrada;
    private int totalPerguntas;

    public Quiz( int totalPerguntas) {
        this.totalPerguntas = totalPerguntas;
        this.respCorreta = 0;
        this.respErrada = 0;
        this.gabRespostas = new String[]{"c", "d", "c", "d", "a", "c", "d", "d", "a", "b"};;
        this.respostaUsuario = new String[totalPerguntas];
    }

    // Procedimento para executar o quiz
    public void executarQuiz() {
        Scanner leia = new Scanner(System.in);
        String op;

        do {
            limpaTela();
            System.out.println("----------------------------------");
            System.out.println(" QUIZ CONHECIMENTOS GERAIS");
            System.out.println("----------------------------------");

            for (int i = 0; i < totalPerguntas; i++) {
                imprimirQuestao(Perguntas.perguntas[i]);
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

            limpaTela();

            //chamando procedimento para imprimir resumo
            imprimirResumo();

            //Caso usuario não tenha obtido mais que 60% de acertos ele tem a opção de refazer o quiz.
            System.out.print("Deseja tentar outra vez? [S/N]: ");
            op = leia.nextLine();

            limpaTela();

        } while (op.equalsIgnoreCase("s"));

        System.out.println();
        System.out.println("QUIZ CONCLUÍDO, ATÉ BREVE!!!");
        System.out.println();
    }
    // Função para imprimir uma questão
    private void imprimirQuestao(String[] pergunta) {
        System.out.println("Pergunta: " + pergunta[0]);
        for (int i = 1; i < pergunta.length; i++) {
            System.out.println(pergunta[i]);
        }
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

    // procedimento para limpar a tela imprimindo quebras de linha
    private static void limpaTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
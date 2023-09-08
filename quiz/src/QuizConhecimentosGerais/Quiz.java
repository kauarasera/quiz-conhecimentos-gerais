package QuizConhecimentosGerais;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.executarQuiz();
    }

    // Função para imprimir uma questão
    private void imprimirQuestao(String[] pergunta) {
        System.out.println("Pergunta: " + pergunta[0]);
        for (int i = 1; i < pergunta.length; i++) {
            System.out.println(pergunta[i]);
        }
    }

    // procedimento para imprimir o resumo do quiz
    private void imprimirResumo(String[] gabRespostas,
                                String[] respostaUsuario,
                                int respCorreta,
                                int respErrada,
                                int totPerguntas) {
        System.out.println("============== Resumo do Quiz ==============");
        System.out.println(" Pergunta  |  Resposta escolhida  | Resposta correta  | Correção ");
        for (int i = 0; i < totPerguntas; i++) {
            String numeroFormatado = String.format("%02d", i + 1);
            String correcao = respostaUsuario[i].equals(gabRespostas[i]) ? "v" : "X";
            System.out.println("     " + numeroFormatado + "     |          " + respostaUsuario[i] + "            |         "
                    + gabRespostas[i] + "          |     " + correcao);
        }
        int porcentagemAcertos = (respCorreta * 100) / totPerguntas;
        System.out.println();
        System.out.println("Você acertou " + respCorreta + " e errou " + respErrada + " de " + totPerguntas + " perguntas.");

        if (porcentagemAcertos >= 60) {
            System.out.println("Você passou com " + porcentagemAcertos + "% de acertos");
        } else {
            System.out.println("Você NÃO passou com somente " + porcentagemAcertos + "% de acertos");
        }
    }

    // Procedimento para executar o quiz
    public void executarQuiz() {
        Scanner leia = new Scanner(System.in);
        String op;

        do {
            int totPerguntas = 10;
            int respCorreta = 0;
            int respErrada = 0;
            String[] gabRespostas = {"c", "d", "c", "d", "a", "c", "d", "d", "a", "b"};
            String[] respostaUsuario = new String[totPerguntas];
            String[][] perguntas = {
                    {"Qual a classe dos golfinhos?", " A) Peixe ", " B) Anfíbio", " C) Mamífero", " D) Aves"},
                    {"Qual é a capital da França?", " A) Londres", " B) Madri", " C) Berlim", " D) Paris"},
                    {"Qual é o maior planeta do Sistema Solar?", " A) Terra", " B) Marte", " C) Júpiter", " D) Vênus"},
                    {"Qual é o maior mamífero terrestre?", " A) Elefante Africano", " B) Girafa", " C) Rinoceronte",
                            " D) Baleia Azul"},
                    {"Quem foi o primeiro ser humano a pisar na Lua?", " A) Neil Armstrong ", " B) Yuri Gagarin",
                            " C) Buzz Aldrin", " D) John Glenn"},
                    {"Qual é a pintura mais famosa de Leonardo da Vinci?", " A) A Última Ceia",
                            " B) A Noite Estrelada",
                            " C) Monalisa", " D) Guernica"},
                    {"Qual é o maior oceano do mundo?", " A) Atlântico", " B) Índico", " C) Ártico", " D) Pacífico"},
                    {"Qual é a maior ilha do mundo?", " A) Havaí", " B) Japão", " C) Madagascar", " D) Groenlândia"},
                    {"Qual é o rio mais longo do mundo?", " A) Rio Nilo", " B) Rio Amazonas", " C) Rio Mississipi",
                            " D) Rio Yangtzé"},
                    {"Quem escreveu a obra Dom Quixote?", " A) Charles Dickens", " B) Miguel de Cervantes",
                            " C) Leo Tolstoy",
                            " D) Jane Austen"}
            };

            System.out.println("----------------------------------");
            System.out.println(" QUIZ CONHECIMENTOS GERAIS");
            System.out.println("----------------------------------");

            for (int i = 0; i < totPerguntas; i++) {
                imprimirQuestao(perguntas[i]);
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
            imprimirResumo(gabRespostas, respostaUsuario, respCorreta, respErrada, totPerguntas);

            //Caso usuario não tenha obtido mais que 60% de acertos ele tem a opção de refazer o quiz.
            System.out.print("Deseja tentar outra vez? [S/N]: ");
            op = leia.nextLine();

            limpaTela();

        } while (op.equalsIgnoreCase("s"));

        System.out.println();
        System.out.println("QUIZ CONCLUÍDO, ATÉ BREVE!!!");
        System.out.println();
    }

    // procedimento para limpar a tela imprimindo quebras de linha
    private static void limpaTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}

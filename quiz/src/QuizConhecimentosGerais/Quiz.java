package QuizConhecimentosGerais;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int totResp = 10;
        int i;
        String gabAnswers[] = { "c", "d", "c", "d", "a", "c", "d", "d", "a", "b" };

        // Gabarito para comparar com a resposta do usuario
        System.out.println("ETAPA 1 - Cadastro de Respostas");
        System.out.println("----------------------------------");
        for (i = 0; i < totResp; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            System.out.println(gabAnswers[i]);
        }

        limpaTela();

        // Vai ler cada pergunta e receber uma respsta
        System.out.println("----------------------------------");
        System.out.println(" QUIZ CONHECIMENTOS GERAIS");

        String resposta;
        int totPerguntas = 10;
        int respCorreta = 0;
        int respErrada = 0;
        String respostaUsuario[] = new String[totPerguntas];
        String perguntas[] = {
                "Qual a classe dos golginhos?",
                "Qual é a capital da França?",
                "Qual é o maior planeta do Sistema Solar?",
                "Qual é o maior mamífero terrestre?",
                "Quem foi o primeiro ser humano a pisar na Lua?",
                "Qual é a pintura mais famosa de Leonardo da Vinci?",
                "Qual é o maior oceano do mundo?",
                "Qual é a maior ilha do mundo",
                "Qual é o rio mais longo do mundo?", "D) Rio Yangtzé",
                "Quem escreveu a obra Dom Quixote?"
        };

        String alternativas[] = { "| a |", " b |", " c |", " d |" };

        for (i = 0; i < totPerguntas; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i]);
            for (int c = 0; c < 4; c++) {
                System.out.print(alternativas[c]);
            }
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.print("DIGITE A ALTERNATIVA CORRETA: ");
            resposta = leia.nextLine();
            respostaUsuario[i] = resposta;
            System.out.println();
        }
        // Verificando se a resposta do usuario bate com o gabarito do quiz
        boolean condicaoRespCorreta = (respostaUsuario[i] != gabAnswers[i]);

        for (i = 0; i < totPerguntas; i++) {

            if (condicaoRespCorreta) {
                respCorreta = respCorreta + 1;
                System.out.println("Você errou " + respErrada + " de " + totPerguntas + " perguntas.");

            } else {

                System.out.println("Você acertou " + respCorreta + " de " + totPerguntas + " perguntas.");
            }
        }

        System.out.println("QUIZ CONCLUIDO, PARABÉNS!!!");
    }

    // Método para limpar a tela imprimindo quebras de linha
    private static void limpaTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}

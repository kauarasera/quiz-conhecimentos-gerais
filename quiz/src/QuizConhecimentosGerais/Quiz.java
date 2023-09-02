package QuizConhecimentosGerais;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int totResp = 10;
        String quizAnswers[] = { "c", "d", "c", "d", "a", "c", "d", "d", "a", "b" };
        int i;

        // Gabarito para comparar com a resposta do usuario
        System.out.println("ETAPA 1 - Cadastro de Respostas");
        System.out.println("----------------------------------");
        for (i = 0; i < totResp; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            System.out.println(quizAnswers[i]);
            // resp = leia.nextLine();
            // gab[i] = resp;
        }
        limpaTela();

        // Vai ler cada pergunta e receber uma respsta
        System.out.println("----------------------------------");
        System.out.println(" QUIZ CONHECIMENTOS GERAIS");
        Scanner ler = new Scanner(System.in);
        int totQuest = 10;
        String userAnswers[] = new String[totQuest];
        String[] quest[] = {
                { "Qual a classe dos golginhos?", "A) Peixe ", "B) Anfibio", "C) Mamiferio", "D) Aves" },
                { "Qual é a capital da França?", "A) Londres", "B) Madri", "C) Berlim", "D) Paris" },
                { "Qual é o maior planeta do Sistema Solar?", "A) Terra", "B) Marte", "C) Júpiter", "D) Vênus" },
                { "Qual é o maior mamífero terrestre?", "A) Elefante Africano", "B) Girafa", "C) Rinoceronte",
                        "D) Baleia Azul" },
                { "Quem foi o primeiro ser humano a pisar na Lua?", "A) Neil Armstrong ", "B) Yuri Gagarin",
                        "C) Buzz Aldrin", "D) John Glenn" },
                { "Qual é a pintura mais famosa de Leonardo da Vinci?", "A) A Última Ceia", "B) A Noite Estrelada",
                        "C) Monalisa", "D) Guernica" },
                { "Qual é o maior oceano do mundo?", "A) Atlântico", "B) Ìndico", "C) Ártico", "D) Pacífico" },
                { "Qual é a maior ilha do mundo", "A) Havaí", "B) Japão", "C) Madagascar", "D) Groenlândia" },
                { "Qual é o rio mais longo do mundo?", "A) Rio Nilo", "B) Rio Amazonas", "C) Rio Mississipi",
                        "D) Rio Yangtzé" },
                { "Quem escreveu a obra Dom Quixote?", "A) Charles Dickens", "B) Miguel de Cervantes", "C) Leo Tolstoy",
                        "D)Jane Austen" }
        };
        int respCorreta = 0;
        int respErrada = 0;

        for (i = 0; i < totQuest; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            System.out.println(quest[i][0]);
            for (int c = 1; c < 5; c++) {
                System.out.println(quest[i][c]);
            }
            System.out.println("-----------------------------------");
            System.out.println("DIGITE A ALTERNATIVA CORRETA");
            System.out.println("a | b | c | d ");
            userAnswers[i] = ler.nextLine();
            System.out.println();
        }
        // Verificando se a resposta do usuario bate com o gabarito do quiz
        boolean condicaoRespCorreta = (userAnswers[i] == quizAnswers[i]);
        
        for (i = 0; i < totQuest; i++) {

            if (condicaoRespCorreta) {
                respCorreta = respCorreta + 1;
                System.out.println("Você acertou " + respCorreta + " de " + totQuest + " perguntas.");
            } else {
                respErrada = respErrada + 1;
                System.out.println("Você errou " + respErrada + " de " + totQuest + " perguntas.");
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

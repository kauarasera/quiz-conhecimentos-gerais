package QuizConhecimentosGerais;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int totResp = 10;
        int i;
        String resposta;
        int totPerguntas = 10;
        int respCorreta = 0;
        int respErrada = 0;
        String gabRespostas[] = { "c", "d", "c", "d", "a", "c", "d", "d", "a", "b" };
        String respostaUsuario[] = new String[totPerguntas];

        String[] perguntas[] = {
                { "Qual a classe dos golginhos?", "A) Peixe ", " B) Anfibio", " C) Mamiferio", " D) Aves" },
                { "Qual é a capital da França?", "A) Londres", " B) Madri", " C) Berlim", "D) Paris" },
                { "Qual é o maior planeta do Sistema Solar?", " A) Terra", "B) Marte", " C) Júpiter", "D) Vênus" },
                { "Qual é o maior mamífero terrestre?", " A) Elefante Africano", " B) Girafa", " C) Rinoceronte",
                        " D) Baleia Azul" },
                { "Quem foi o primeiro ser humano a pisar na Lua?", " A) Neil Armstrong ", "B) Yuri Gagarin",
                        " C) Buzz Aldrin", " D) John Glenn" },
                { "Qual é a pintura mais famosa de Leonardo da Vinci?", " A) A Última Ceia", " B) A Noite Estrelada",
                        " C) Monalisa", " D) Guernica" },
                { "Qual é o maior oceano do mundo?", " A) Atlântico", " B) Ìndico", " C) Ártico", " D) Pacífico" },
                { "Qual é a maior ilha do mundo", " A) Havaí", " B) Japão", " C) Madagascar", " D) Groenlândia" },
                { "Qual é o rio mais longo do mundo?", " A) Rio Nilo", " B) Rio Amazonas", " C) Rio Mississipi",
                        " D) Rio Yangtzé" },
                { "Quem escreveu a obra Dom Quixote?", " A) Charles Dickens", " B) Miguel de Cervantes",
                        " C) Leo Tolstoy",
                        " D)Jane Austen" }
        };

        // Vai ler cada pergunta e receber uma respsta
        System.out.println("----------------------------------");
        System.out.println(" QUIZ CONHECIMENTOS GERAIS");
        System.out.println("----------------------------------");

        for (i = 0; i < totPerguntas; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i][0]);
            for (int c = 1; c < 5; c++) {
                System.out.print(perguntas[i][c]);
            }

            System.out.println();
            System.out.println("-----------------------------------");
            System.out.print("DIGITE A ALTERNATIVA CORRETA (A) (B) (C) (D): \n -> ");
            resposta = leia.nextLine().toLowerCase();

            respostaUsuario[i] = resposta;

            // Verificando se a resposta do usuario bate com o gabarito do quiz
            //boolean condicaoRespCorreta = (respostaUsuario[i] == gabRespostas[i]);

            if (respostaUsuario[i].equals(gabRespostas[i])) {
                respCorreta++;
                System.out.println("Acertou \n");
            } else {
                respErrada++;
                System.out.println("Errou. A resposta correta é: " + gabRespostas[i] + "\n");
            }
        }

        limpaTela();

        System.out.println("=== Resumo do Quiz ===");


        System.out.println();
        System.out.println("QUIZ CONCLUIDO, PARABÉNS!!!");
        System.out.println();
    }

    // Método para limpar a tela imprimindo quebras de linha
    private static void limpaTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}

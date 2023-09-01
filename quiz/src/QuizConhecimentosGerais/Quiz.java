package QuizConhecimentosGerais;
/*
 * Desenvolvimento em JAVA de um Quiz de conhecimentos gerais de 10 perguntas de multipla escolha com opções indo de A a D cada pergunta, o programa deve ler uma resposta do usuário, e após a leitura seguir para a pergunta seguinte. Ao final do Quiz, caso o usuário seja aprovado, ou seja, tenha acertado pelo menos 60% do teste. O programa deve apresentar um resumo do mesmo. O Resumo deve conter para cada questão:

As respostas do usuário e a resposta correta;
Total de respostas erradas e certas
Indicação se o usuário passou ou não no teste. Tome como base a média de 60%.
Caso o usurário não seja aprovado, ele deverá poder escolher entre sair do teste e encerrar o programa. Ou repita o teste.

Exemplo de saída do quiz:

Pergunta | resposta escolhida | resposta correta | Correção 
    1    |        D           |         D        | ✓ 
    2    |        C           |         D        | X
 */

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, totResp = 10;
        String gab[] = new String[totResp];
        String resp;

        // Gabarito para comparar com a resposta do usuario
        System.out.println("ETAPA 1 - Cadastro de Respostas");
        System.out.println("----------------------------------");
        for (i = 0; i < totResp; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gab[i] = leia.nextLine();
        }
        // Vai ler cada pergunta e receber uma
        System.out.println("----------------------------------");
        System.out.println(" QUIZ CONHECIMENTOS GERAIS");
        Scanner ler = new Scanner(System.in);
        int totQuest = 10;
        String[] quest[] = {
                { "Qual a classe dos golginhos?", "A) Peixe ", "B) Anfibio", "C) Mamiferio", "D) Aves" },
                { "Qual é a capital da França?", "A) Londres", "B) Madri", "C) Berlim", "D) Paris" },
                { "Qual é o maior planeta do Sistema Solar?", "A) Terra", "B) Marte", "C) Júpiter", "D) Vênus" },
                { "Qual é o maior mamífero terrestre?", "A) Elefante Africano", "B) Girafa", "C) Rinoceronte",
                        "D) Baleia Azul" },
                { "Quem foi o primeiro ser humano a pisar na Lua?", "A) Neil Armstrong ", "B) Yuri Gagarin",
                        "C) Buzz Aldrin", "D) John Glenn" },
                { "Qual é a pintura mais famosa de Leonardo da Vinci?", "A) A Última Ceia", "B) A Noite Estrelada",
                        "C) Mona Lisa", "D) Guernica" },
                { "Qual é o maior oceano do mundo?", "A) Atlântico", "B) Ìndico", "C) Ártico", "D) Pacífico" },
                { "Qual é amaior ilha do mundo", "A) Havaí", "B) Japão", "C) Madagascar", "D) Groelândia" },
                { "Qual é o rio mais longo do mundo?", "A) Rio Nilo", "B) Rio Amazonas", "C) Rio Mississipi",
                        "D) Rio Yangtzé" },
                { "Quem escreveu a obra Dom Quixote?", "A) Charles Dickens", "B) Miguel de Cervantes", "C) Leo Tolstoy",
                        "D)Jane Austen" }
        };

        int respCorreta = 0;
        int respErrada = 0;

        System.out.println("QUIZ DE CONHECIMENTOS GERAIS: ");
        for (i = 0; i < totQuest; i++) {
            System.out.println("Pergunta " + (i + 1) + ":");
            System.out.println(quest[i][0]);
            for (int c = 1; c < totQuest; c++) {
                System.out.println(quest[i][c]);
            }
            System.out.println("SELECIONE A RESPOSTA CORRETA");
            System.out.println("a | b | c | d ");
            quest[i][0] = ler.nextLine();
        }

        // Verificando se a resposta do usuario bate com o gabarito do quiz
        boolean condicaoRespCorreta = (gab[i] == quest[i][0]);
        if (condicaoRespCorreta) {
            respCorreta = respCorreta + 1;
        } else {
            respErrada = respErrada + 1;
        }

        // Resumo quz
    }
}

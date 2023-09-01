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

        Scanner ler = new Scanner(System.in);
        int totQuest= 5;
        String[] quest[] = {
                { "Qual é a capital da França?", "A) Londres", "B) Madri", "C) Berlim", "D) Paris", "D" },
                { "Qual a classe dos golginhos?", "A) Peixe ", "B) Anfibio", "C) Mamiferio" },
                { "Qual é a capital da França?", "A) Londres", "B) Madri", "C) Berlim", "D) Paris", "D" },
                { "Qual é o maior planeta do Sistema Solar?", "A) Terra", "B) Marte", "C) Júpiter", "D) Saturno", "C" },
                { "Qual é o maior mamífero terrestre?", "A) Elefante Africano", "B) Girafa", "C) Rinoceronte",
                        "D) Hipopótamo", "A" }
        };

        int i;
        int respCorreta = 0;
        int respErrada = 0;
        String resp[] = new String[totQuest];

        System.out.println("PERGUNTAS: ");
        for (i = 0; i < 5; i++) {
            System.out.println("Pergunta " + (i + 1) + ":");
            System.out.println(quest[i][0]);
            for (int c = 1; c <= 4; c++) {
                System.out.println(quest[i][c]);
            }
        }

        System.out.println("SELECIONE A RESPOSTA CORRETA");
        System.out.println("a | b | c ");
        resp[i] = ler.nextLine();
    }
}
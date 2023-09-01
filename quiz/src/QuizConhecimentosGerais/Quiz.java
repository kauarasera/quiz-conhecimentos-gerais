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
        int i, totResp = 4;
        String gab[] = new String[totResp];
        String resp;

        // Gabarito para comparar com a resposta do usuario
        System.out.println("ETAPA 1 - Cadastro de Respostas");
        System.out.println("----------------------------------");
        for (i = 0; i < totResp; i++) {
            System.out.print("Questão " + i + ": ");
            gab[i] = leia.nextLine();

            // Vai ler cada pergunta e receber uma
            Scanner ler = new Scanner(System.in);
            int totQuest = 4;
            String[] quest[] = {
                    { "Qual a classe dos golginhos?", "A) Peixe ", "B) Anfibio", "C) Mamiferio" },
                    { "Qual é a capital da França?", "A) Londres", "B) Madri", "C) Berlim" },
                    { "Qual é o maior planeta do Sistema Solar?", "A) Terra", "B) Marte", "C) Júpiter" },
                    { "Qual é o maior mamífero terrestre?", "A) Elefante Africano", "B) Girafa", "C) Rinoceronte" }
            };

            int respCorreta = 0;
            int respErrada = 0;

            System.out.println("QUIZ DE CONHECIMENTOS GERAIS: ");
            for (i = 0; i < totQuest; i++) {
                System.out.println("Pergunta " + i + ":");
                System.out.println(quest[i][0]);
                for (int c = 1; c < totQuest; c++) {
                    System.out.println(quest[i][c]);
                }
                System.out.println("SELECIONE A RESPOSTA CORRETA");
                System.out.println("a | b | c ");
                quest[i][0] = ler.nextLine();
            }

             //Verificando se a resposta do usuario bate com o gabarito do quiz
            boolean condicaoRespCorreta = (gab[i] ==  quest[i][0] );
            if (condicaoRespCorreta) {
                respCorreta = respCorreta + 1;
            } else {
                respErrada = respErrada + 1;
            }
        }
    }
}

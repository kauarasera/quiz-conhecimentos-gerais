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


public class Main {
    public static void main(String[] args): String CadastroGabarito() {
        System.out.println("Iniciando o programa");
       // System.out.println(CadastroGabarito.getAnswers());
       //System.out.println(CadastroQuiz.getQuiz(args));
       for(int i = 0; i < 3; i++){
        System.out.println("");
       }

    }
}
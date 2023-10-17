package QuizConhecimentosGerais;

public class ImprimeQuestao {
    public static void imprimirQuestao(String[] pergunta) {
        System.out.println("Pergunta: " + pergunta[0]);
        for (int i = 1; i < pergunta.length; i++) {
            System.out.println(pergunta[i]);
        }
    }
}

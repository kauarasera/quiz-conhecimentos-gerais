package QuizConhecimentosGerais;

public class Main {
    public static void main(String[] args) {
        String[] gabaritoRespostas = {"c", "d", "c", "d", "a", "c", "d", "d", "a", "b"};
        Gabarito gabarito = new Gabarito(gabaritoRespostas);

        Quiz quiz = new Quiz(10, gabarito);
        quiz.executarQuiz();
    }
}
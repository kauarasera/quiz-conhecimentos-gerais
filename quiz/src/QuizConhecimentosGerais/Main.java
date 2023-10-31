package QuizConhecimentosGerais;

public class Main {
    public static void main(String[] args) {

        Gabarito gabarito = new Gabarito();

        Quiz quiz = new Quiz(10, gabarito);
        quiz.executarQuiz();
    }
}
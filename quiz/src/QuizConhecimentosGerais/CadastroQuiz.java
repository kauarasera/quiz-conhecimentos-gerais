package QuizConhecimentosGerais;

import java.util.Scanner;

//metodo que guarda as respostas dos usuarios
public class CadastroQuiz {

    public static double getQuiz(String[] gab) {
        Scanner ler = new Scanner(System.in);
        int numQuest = 3;
        String[] quest[] = {
            {"Qual a classe dos golginhos?", "A) Peixe ", "B) Anfibio", "C) Mamiferio"},
            {"Qual é a capital da França?", "A) Londres", "B) Madri", "C) Berlim", "D) Paris", "D"},
            {"Qual é o maior planeta do Sistema Solar?", "A) Terra", "B) Marte", "C) Júpiter", "D) Saturno", "C"}
    };
        System.out.println("RESPOSTAS DADAS NO QUIZ ");
        for (i = 1; i < 3; i++) {
            System.out.print("Qual a classe dos golginhos?");
            System.out.print("Alternativas: ");
            System.out.println("a | b | c | d");
            q = ler.nextLine();
            quest[i] = q;
            if (quest[i] == gab[i]) {
                notaFinal = notaFinal + 2;
            }

            for (i = 1; i < 3; i++) {
                System.out.print("Qual a classe dos golginhos?");
                System.out.print("Alternativas: ");
                System.out.println("a | b | c | d");
                q = ler.nextLine();
                quest[i] = q;
                if (quest[i] == gab[i]) {
                    notaFinal = notaFinal + 2;
                }


        }
        return notaFinal;
    }
}

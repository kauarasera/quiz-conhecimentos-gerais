package QuizConhecimentosGerais;

import java.util.Scanner;

//metodo que guarda as respostas corretas

public class CadastroGabarito {
    public static void getAnswers() {
        Scanner ler = new Scanner(System.in);
        String gab[] = new String[3];
        String resp;

        System.out.println("ETAPA 1 - Cadastro de Respostas");
        System.out.println("----------------------------------");
        for(int i = 0; i < 3; i++){
            System.out.print("Questão " + i + ": ");
            resp = ler.nextLine();
            gab[i] = resp;
        }
    }
}
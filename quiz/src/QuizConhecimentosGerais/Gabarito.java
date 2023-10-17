package QuizConhecimentosGerais;

public class Gabarito {
    private String[] respostasCorretas;

    public Gabarito(String[] respostasCorretas) {
        this.respostasCorretas = respostasCorretas;
    }

    public String getRespostaCorreta(int index) {
        return respostasCorretas[index];
    }
}

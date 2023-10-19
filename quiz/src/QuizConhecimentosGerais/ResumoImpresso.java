package QuizConhecimentosGerais;

public class ResumoImpresso {
    public static void imprimirResumo(int respCorretas, int respErradas, int totalPerguntas, String[] respostaUsuario, String[] gabRespostas) {
        System.out.println("============== Resumo do Quiz ==============");
        System.out.println(" Pergunta  |  Resposta escolhida  | Resposta correta  | Correção ");
        for (int i = 0; i < totalPerguntas; i++) {
            String numeroFormatado = String.format("%02d", i + 1);
            String correcao = respostaUsuario[i].equals(gabRespostas[i]) ? "v" : "X";
            System.out.println("     " + numeroFormatado + "     |          " + respostaUsuario[i] + "            |         "
                    + gabRespostas[i] + "          |     " + correcao);
        }
        int porcentagemAcertos = (respCorretas * 100) / totalPerguntas;
        System.out.println();
        System.out.println("Você acertou " + respCorretas + " e errou " + respErradas + " de " + totalPerguntas + " perguntas.");

        if (porcentagemAcertos >= 60) {
            System.out.println("Você passou com " + porcentagemAcertos + "% de acertos");
        } else {
            System.out.println("Você NÃO passou com somente " + porcentagemAcertos + "% de acertos");
        }
    }
}
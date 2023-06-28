package ExemploStatic;

public class IdiomaConfig {
    private static String idiomaPadrao = "Inglês";
    private static int tamanhoFontePadrao = 12;

    public static String getIdiomaPadrao() {
        return idiomaPadrao;
    }

    public static int getTamanhoFontePadrao() {
        return tamanhoFontePadrao;
    }

    public static void alterarConfiguracoesPadrao(String novoIdioma, int novoTamanhoFonte) {
        idiomaPadrao = novoIdioma;
        tamanhoFontePadrao = novoTamanhoFonte;
    }
}

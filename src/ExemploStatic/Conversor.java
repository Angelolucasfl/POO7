package ExemploStatic;

public class Conversor {
    public static double converterParaDolar(double valorReal, double taxaConversao) {
        return valorReal * taxaConversao;
    }

    public static double converterParaReal(double valorDolar, double taxaConversao) {
        return valorDolar / taxaConversao;
    }
}

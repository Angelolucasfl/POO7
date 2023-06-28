package ExemploStatic;

public class Main {
    public static void main(String[] args) {

        double valorReal = 100.0;
        double valorDolar = Conversor.converterParaDolar(valorReal, 0.1);
        System.out.println("Valor em dólar: " + valorDolar);
        
        double valorDolarNovo = 50.0;
        double valorRealNovo = Conversor.converterParaReal(valorDolarNovo, 0.1);
        System.out.println("Valor em real: " + valorRealNovo);
        
      
        System.out.println(IdiomaConfig.getIdiomaPadrao());
        System.out.println(IdiomaConfig.getTamanhoFontePadrao());
    }
}


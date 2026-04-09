package aplicandoComportamentosEmComum.exercicio1;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double dolar){
        double cotacaoDolar = 4.80;
        double valorReal = dolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}

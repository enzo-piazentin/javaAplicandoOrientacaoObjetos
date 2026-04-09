package aplicandoComportamentosEmComum;

import aplicandoComportamentosEmComum.Exercicio3.ConversorTemperaturaPadrao;
import aplicandoComportamentosEmComum.Exercicio4.Nome;
import aplicandoComportamentosEmComum.Exercicio4.TabuadaMultiplicacao;
import aplicandoComportamentosEmComum.exercicio1.ConversorMoeda;
import aplicandoComportamentosEmComum.exercicio2.CalculadoraSalaRetangular;

public class HoraDaPratica {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        conversor.converterDolarParaReal(10);

        System.out.println("\n-----------------------------------\n");

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();

        sala.setAltura(10);
        System.out.println(sala.getAltura());
        sala.setLargura(5);
        System.out.println(sala.getLargura());
        sala.calcularArea();
        sala.calcularPerimetro();

        System.out.println("\n-----------------------------------\n");

        ConversorTemperaturaPadrao converter = new ConversorTemperaturaPadrao();

        converter.setCelsius(25);
        converter.celsiusParaFahrenheit();
        converter.setFahrenheit(77);
        converter.fahrenheitParaCelsius();

        System.out.println("\n-----------------------------------\n");

        Nome Enzo = new Nome("Enzo", 3);
        TabuadaMultiplicacao cinco = new TabuadaMultiplicacao(Enzo);
        cinco.mostrarTabuada();

        Nome Mariana = new Nome("Mariana", 10);
        TabuadaMultiplicacao dez = new TabuadaMultiplicacao(Mariana);
        Mariana.setNumero(5);
        dez.setNumero(Mariana.getNumero());
        dez.mostrarTabuada();
    }
}

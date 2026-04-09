package aplicandoComportamentosEmComum.Exercicio3;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private int celsius;
    private double fahrenheit;

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public void celsiusParaFahrenheit() {
        fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");
    }

    @Override
    public void fahrenheitParaCelsius() {
        celsius = (int) ((fahrenheit - 32.0) * 5.0 / 9.0);
        System.out.println(fahrenheit + "°F é igual a " + celsius + "°C");
    }
}

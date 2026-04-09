package aplicandoComportamentosEmComum.exercicio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura, largura, area;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura >= 0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida");
        }
    }

    @Override
    public void calcularArea() {
        area = altura * largura;
        System.out.println("Área: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perímetro: " + perimetro);
    }
}

package aplicandoComportamentosEmComum.Exercicio4;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;
    private String nome;

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TabuadaMultiplicacao(Nome nome) {
        this.numero = nome.getNumero();
        this.nome = nome.getNome();
    }


    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada de Multiplicação do " + nome + ":");
        System.out.println("Tabuada de Multiplicação do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

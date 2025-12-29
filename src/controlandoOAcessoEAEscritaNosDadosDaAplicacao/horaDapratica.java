package controlandoOAcessoEAEscritaNosDadosDaAplicacao;

public class horaDapratica {
    public static void main(String[] args) {
        System.out.println("Exercício 1");
        Conta contaBancaria = new Conta();

        contaBancaria.setNumeroConta(123);
        contaBancaria.setSaldo(1000);
        contaBancaria.titular = "Enzo";

        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: " + contaBancaria.getSaldo());
        System.out.println("Titular: "+ contaBancaria.titular);

        contaBancaria.setSaldo(1500);
        System.out.println("Novo Saldo: "+ contaBancaria.getSaldo());

    }
}

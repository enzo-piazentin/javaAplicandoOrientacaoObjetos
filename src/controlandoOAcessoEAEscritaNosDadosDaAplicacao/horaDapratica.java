package controlandoOAcessoEAEscritaNosDadosDaAplicacao;

public class horaDapratica {
    public static void main(String[] args) {
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

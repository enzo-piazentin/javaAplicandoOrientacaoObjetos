package reaproveitandoCaracteristicasEComportamento.exercicio3;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal(double valor){
        double tarifa = 12.90;
        valor -= tarifa;
        System.out.println("Tarifa mensal cobrada: " + tarifa + " | Saldo atual: " + valor);
    }

}
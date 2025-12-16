package modeloOScreenMatch.horaDaPratica;

public class Carro {
    String modelo, cor;
    int ano ,anoDoCarro;


    void pegaAnoDoCarro(){
        ano = 2025 - anoDoCarro ;
        System.out.println("A idade do Carro: " + ano);
    }

    void fichatecnica(){
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Cor do Carro: " + cor);
        System.out.println("Ano do Carro: " + anoDoCarro);
        pegaAnoDoCarro();
    }
}

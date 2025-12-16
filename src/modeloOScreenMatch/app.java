package modeloOScreenMatch;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Filme meuFilme = new Filme();
        meuFilme.nome ="Homem-Aranha: Através do Aranhaverso";
        meuFilme.anoDeLancamento = 2023;
        meuFilme.duracaoEmMinutos = 140;

        meuFilme.exibeFihaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Soma das avaliações: "+ meuFilme.somaDasAvaliacoes);
        System.out.println("Avaliação do filme: "+ meuFilme.totalDeAvaliacao);
        System.out.println("Media do filme: "+ meuFilme.pegaMedia());
    }
}

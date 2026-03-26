package modeloOScreenMatch;

public class Musica {
    String nomeDoAlbum, artista;
    int anoDeLancamento, numDeAvaliacoes;
    double avaliacao;

    void infoAlbumArtistaEAno(){
        System.out.println("Nome do Album: " + nomeDoAlbum);
        System.out.println("Nome do(a) Artista: " + artista);
        System.out.println("Ano de lançamento do album: "+ anoDeLancamento);
    }

    void pegaMedia(double nota){
        avaliacao += nota;
        numDeAvaliacoes++;
    }
    double daMedia(){
        return avaliacao / numDeAvaliacoes;
    }
}

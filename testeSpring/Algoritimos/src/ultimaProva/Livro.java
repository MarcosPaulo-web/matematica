package ultimaProva;

public class Livro {

    public String titulo;
    public int numPaginas;
    public double valor;

    @Override
    public String toString() {
        return "\ntitulo = " + titulo + "\nNumero de paginas=" + numPaginas +
                "\nvalor = " + valor;
    }
}

package q02.Catalogo;

public class LivroFisico extends Produto{
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, double preco, int numeroPaginas) {
        super(titulo, autor, preco);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nPreço: " + getPreco() +
                "\nNúmero de Páginas: " + getNumeroPaginas();
    }
}
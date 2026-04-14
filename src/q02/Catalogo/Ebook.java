package q02.Catalogo;

public class Ebook extends Produto{
    private String formatoArquivo;

    public Ebook(String titulo, String autor, double preco, String formatoArquivo) {
        super(titulo, autor, preco);
        this.formatoArquivo = formatoArquivo;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nPreço: " + getPreco() +
                "\nFormato do Arquivo: " + getFormatoArquivo();
    }
}
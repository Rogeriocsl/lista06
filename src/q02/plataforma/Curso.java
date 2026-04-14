package q02.plataforma;

public class Curso implements Avaliavel, Compravel{
    private String titulo;
    private String nomeInstrutor;
    private double notaMedia;
    private double preco;

    public Curso(String titulo, String nomeInstrutor, double notaMedia, double preco) {
        this.titulo = titulo;
        this.nomeInstrutor = nomeInstrutor;
        this.notaMedia = notaMedia;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Curso: " + getTitulo() +
                "\nNome do Instrutor: " + getNomeInstrutor() +
                "\nNota Média: " + getNotaMedia();
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String gerarRecibo(String nomeComprador) {
        return "RECIBO\nComprador: " + nomeComprador +
                "\nProduto: Curso " + getTitulo() +
                "\nInstrutor: " + getNomeInstrutor() +
                "\nPreço: R$" + getPreco();
    }
}
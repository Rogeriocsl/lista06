package q02.plataforma;

public class TrilhaDeAprendizado implements Avaliavel{
    private String nome;
    private int numeroCursos;
    private double notaMedia;

    public TrilhaDeAprendizado(String nome, int numeroCursos, double notaMedia) {
        this.nome = nome;
        this.numeroCursos = numeroCursos;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCursos() {
        return numeroCursos;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Nome: " + getNome() +
                "\nNúmero de Cursos: " + getNumeroCursos() +
                "\nNota Média: " + getNotaMedia();
    }
}
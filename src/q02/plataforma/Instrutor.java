package q02.plataforma;

public class Instrutor implements Avaliavel{
    private String nome;
    private String especialidade;
    private double notaMedia;

    public Instrutor(String nome, String especialidade, double notaMedia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Instrutor: " + getNome() +
                "\nEspecialidade: " + getEspecialidade() +
                "\nNota Média: " + getNotaMedia();
    }
}
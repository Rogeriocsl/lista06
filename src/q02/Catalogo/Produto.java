package q02.Catalogo;

import java.util.Objects;

public abstract class Produto {
    private String titulo;
    private String autor;
    private double preco;

    public Produto(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Produto other)) return false;

        return Objects.equals(this.titulo, other.titulo) && Objects.equals(this.autor, other.autor);
    }
}
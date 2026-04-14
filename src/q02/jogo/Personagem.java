package q02.jogo;

public abstract class Personagem {
  protected   String nome;
  protected   int pontosDeVida;

    public Personagem(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public boolean estaVivo(){
            return pontosDeVida > 0;
    }

    public void receberDano(int dano){
        pontosDeVida -= dano;
        if(pontosDeVida < 0){
            pontosDeVida = 0;
        }
    }

    public abstract void executarAtaque(Personagem alvo);

    public abstract String getClasse();

}

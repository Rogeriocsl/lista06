package q02.jogo;

public class Mago extends Personagem {
    private int danoMagico;
    private int custoMana;
    private int manaAtual;

    public Mago(String nome, int pontosDeVida, int danoMagico, int custoMana, int manaAtual) {
        super(nome, pontosDeVida);
        this.danoMagico = danoMagico;
        this.custoMana = custoMana;
        this.manaAtual = manaAtual;
    }

    public int getManaAtual(){
        return manaAtual;
    }

    public void executarAtaque(Personagem alvo){
        if(estaVivo() && manaAtual >= custoMana){
            manaAtual -= custoMana;
            alvo.receberDano(danoMagico);
            System.out.println( getNome() +" soltou magia ");
        }

    }
    public String getClasse(){
        return "Mago";
    }
}

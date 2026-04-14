package q02;

public class Arqueiro extends Personagem {
    private int danoFlecha;
    private int flechasRestantes;

    public Arqueiro(String nome, int pontosDeVida, int danoFlecha, int flechasRestantes) {
        super(nome, pontosDeVida);
        this.danoFlecha = danoFlecha;
        this.flechasRestantes = flechasRestantes;
    }

    public int getFlechasRestantes() {
        return flechasRestantes;
    }

    @Override
    public void executarAtaque(Personagem alvo) {
        if(estaVivo() && flechasRestantes > 0){
            alvo.receberDano(danoFlecha);
            flechasRestantes--;
            System.out.println(getNome() +" Atirou flecha");
        }
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }
}

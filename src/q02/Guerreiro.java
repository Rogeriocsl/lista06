package q02;

public class Guerreiro extends Personagem {
    private int danoEspada;

    public Guerreiro(String nome, int pontosDevida, int danoEspada) {
        super(nome, pontosDevida);
        this.danoEspada = danoEspada;
    }

    @Override
    public void executarAtaque(Personagem alvo) {
        if(estaVivo()){
            alvo.receberDano(danoEspada);
            System.out.println(" Atacou" + getNome()) ;
        }
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }

}

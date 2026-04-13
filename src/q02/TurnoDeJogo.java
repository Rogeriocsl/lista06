package q02;

import java.util.ArrayList;
import java.util.List;

public class TurnoDeJogo {

    private List<Personagem> personagens = new ArrayList<>();

    public void adicionarPersonagem(Personagem personagem){
        personagens.add(personagem);
    }

    public void executarTurno(Personagem alvo){
        for(Personagem personagem : personagens){
            if(personagem.estaVivo()){
                personagem.executarAtaque(alvo);
            }
        }
    }

    public int contarVivos(){
        int vivos = 0;
        for(Personagem personagem : personagens){
            if(personagem.estaVivo()){
                vivos++;
            }
        }
        return vivos;
    }

}

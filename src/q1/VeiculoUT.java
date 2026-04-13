package q1;

public class VeiculoUT extends Veiculo {
    public VeiculoUT(String placa, int ano) {
        super(placa, ano);
    }

    @Override
    public String getDescricao() {
        return "Veículo Utilitário [Placa: " + getPlaca() + ", Ano: " + getanoFabricacao() + "]";
    }
}
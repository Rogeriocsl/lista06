package q1;

abstract class Veiculo {
    private String placa;
    private int anoFabricacao;

    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public int getanoFabricacao() {
        return anoFabricacao;
    }

    public abstract String getDescricao();
}

package q1;

public class VeiculoPJ extends Veiculo {
    private String cnpj;
    private String codigoFrota;

    public VeiculoPJ(String placa, int ano, String cnpj, String codigoFrota) {
        super(placa, ano);
        this.cnpj = cnpj;
        this.codigoFrota = codigoFrota;
    }

    @Override
    public String getDescricao() {
        return "Veículo PJ [Placa: " + getPlaca() + ", CNPJ: " + cnpj + ", Frota: " + codigoFrota + "]";
    }
}
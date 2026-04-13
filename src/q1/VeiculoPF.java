package q1;

public class VeiculoPF extends Veiculo {
    private String cpfLocatario;

    public VeiculoPF(String placa, int ano, String cpfLocatario) {
        super(placa, ano);
        this.cpfLocatario = cpfLocatario;
    }

    @Override
    public String getDescricao() {
        return "Veículo PF [Placa: " + getPlaca() + ", CPF: " + cpfLocatario + "]";
    }
}
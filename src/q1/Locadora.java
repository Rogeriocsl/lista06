package q1;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();

        frota.add(new VeiculoPF("CAD-123", 2001, "123.456.789-00"));
        frota.add(new VeiculoPJ("HGH5050", 2025, "00.000.000/0000-00", "FROTA-1A"));
        frota.add(new VeiculoUT("KKK-6767", 2026));

        System.out.println("Relatório de Veículos");
        for (Veiculo v : frota) {
            System.out.println(v.getDescricao());
        }
    }
}
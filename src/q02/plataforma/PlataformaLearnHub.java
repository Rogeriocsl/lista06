package q02.plataforma;


import java.util.ArrayList;
import java.util.List;

public class PlataformaLearnHub {
    private List<Avaliavel> entidades = new ArrayList<>();

    public void cadastrar(Avaliavel a) {
        entidades.add(a);
    }

    public List<Avaliavel> listarPorNotaMinima(double notaMinima) {
        List<Avaliavel> filtrados = new ArrayList<>();
        for (Avaliavel a : entidades) {
            if (a.getNotaMedia() >= notaMinima) {
                filtrados.add(a);
            }
        }
        return filtrados;
    }

    public List<Compravel> listarCompravel() {
        List<Compravel> compraveis = new ArrayList<>();
        for (Avaliavel a : entidades) {
            // Verifica se a entidade também implementa Compravel
            if (a instanceof Compravel) {
                compraveis.add((Compravel) a);
            }
        }
        return compraveis;
    }

    public String gerarPaginaDeBusca(double notaMinima) {
        StringBuilder sb = new StringBuilder("--- RESULTADOS DE BUSCA ---\n");
        for (Avaliavel a : listarPorNotaMinima(notaMinima)) {
            sb.append(a.gerarResumoPublico()).append("\n");
        }
        return sb.toString();
    }

    public String processarCompra(String nomeComprador, String tituloCurso) {
        for (Avaliavel a : entidades) {
            if (a instanceof Curso c) {
                if (c.getTitulo().equalsIgnoreCase(tituloCurso)) {
                    return c.gerarRecibo(nomeComprador);
                }
            }
        }
        return null;
    }

    public List<String> gerarRecibosEmLote(String nomeComprador) {
        List<String> recibos = new ArrayList<>();

        for (Avaliavel a : entidades) {
            if (a instanceof Compravel c) {
                recibos.add(c.gerarRecibo(nomeComprador));
            }
        }

        return recibos;
    }


}
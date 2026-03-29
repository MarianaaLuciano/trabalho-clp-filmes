import java.util.*;
import java.util.stream.Collectors;

public class Sistema {
    // Armazenamento indexado por ID para busca O(1)
    private Map<Integer, Filme> filmes = new HashMap<>();
    private Map<Integer, Usuario> usuarios = new HashMap<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    /**
     * Adiciona um objeto Filme ao mapa de filmes do sistema.
     */
    public void adicionarFilme(Filme f) {
        this.filmes.put(f.getId(), f);
    }

    // --- FASE 1: CONSULTAS ---

    /**
     * Filtra filmes por genero utilizando Streams API.
     */
    public List<Filme> filmesPorGenero(String genero) {
        return filmes.values().stream()
            .filter(f -> f.getGenero().equalsIgnoreCase(genero))
            .collect(Collectors.toList());
    }

    /**
     * Filtra filmes com ano de lancamento superior ao parametro informado.
     */
    public List<Filme> filmesDeAnoSuperior(int ano) {
        return filmes.values().stream()
            .filter(f -> f.getAno() > ano)
            .collect(Collectors.toList());
    }
}
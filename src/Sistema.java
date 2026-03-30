import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Sistema {
    // Mapa para guardar os filmes por ID
    private Map<Integer, Filme> filmes = new HashMap<>();

    // Método para ler o CSV de filmes (usando vírgula como separador)
    public void carregarFilmes(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pula a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;
                
                // O seu arquivo usa vírgula: id,titulo,generos,diretor,ano
                String[] dados = linha.split(",");
                
                if (dados.length >= 5) {
                    try {
                        int id = Integer.parseInt(dados[0].trim());
                        String titulo = dados[1].trim();
                        String generos = dados[2].trim();
                        String diretor = dados[3].trim();
                        int ano = Integer.parseInt(dados[4].trim());

                        Filme f = new Filme(id, titulo, ano, generos, diretor);
                        filmes.put(id, f);
                    } catch (NumberFormatException e) {
                        continue; // Pula linhas com erro de número
                    }
                }
            }
            System.out.println("Carga de filmes concluida. Total: " + filmes.size());
        } catch (IOException e) {
            System.err.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }

    // FILTRO 1: Por Gênero (Fase 1)
    public List<Filme> filmesPorGenero(String genero) {
        return filmes.values().stream()
            .filter(f -> f.getGenero().toLowerCase().contains(genero.toLowerCase()))
            .collect(Collectors.toList());
    }

    // FILTRO 2: Por Ano Superior (Fase 1)
    public List<Filme> filmesDeAnoSuperior(int ano) {
        return filmes.values().stream()
            .filter(f -> f.getAno() > ano)
            .collect(Collectors.toList());
    }
}
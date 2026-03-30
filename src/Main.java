import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Carrega o arquivo que está na sua pasta src
        sistema.carregarFilmes("src/filmes.csv");

        System.out.println("\n--- TESTE FASE 1 ---");

        // Testando a busca por Gênero
        System.out.println("Buscando filmes de 'Ficção':");
        List<Filme> resultadosGenero = sistema.filmesPorGenero("Ficção");
        for (Filme f : resultadosGenero) {
            System.out.println(" - " + f.getTitulo());
        }

        // Testando a busca por Ano
        System.out.println("\nBuscando filmes lançados após 2010:");
        List<Filme> resultadosAno = sistema.filmesDeAnoSuperior(2010);
        for (Filme f : resultadosAno) {
            System.out.println(" - " + f.getTitulo() + " (" + f.getAno() + ")");
        }
    }
}
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Instanciacao de objetos para teste
        Filme f1 = new Filme(1, "Interestelar", 2014, "Ficcao", "Christopher Nolan");
        Filme f2 = new Filme(2, "Duna", 2021, "Ficcao", "Denis Villeneuve");
        Filme f3 = new Filme(3, "Bacurau", 2019, "Drama", "Kleber Mendonca");

        // Persistencia temporaria no sistema
        sistema.adicionarFilme(f1);
        sistema.adicionarFilme(f2);
        sistema.adicionarFilme(f3);

        // Execucao de testes da Fase 1
        System.out.println("Resultados para genero 'Ficcao':");
        List<Filme> ficcao = sistema.filmesPorGenero("Ficcao");
        for (Filme f : ficcao) {
            System.out.println("- " + f.getTitulo());
        }

        System.out.println("\nResultados para anos superiores a 2015:");
        List<Filme> recentes = sistema.filmesDeAnoSuperior(2015);
        for (Filme f : recentes) {
            System.out.println("- " + f.getTitulo() + " (" + f.getAno() + ")");
        }
    }
}
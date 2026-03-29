public class Filme {
    // Atributos privados (Encapsulamento)
    private int id;
    private String titulo;
    private int ano;
    private String genero;
    private String diretor;

    // Construtor: O "nascimento" do objeto Filme
    public Filme(int id, String titulo, int ano, String genero, String diretor) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
    }

    // Getters: Para que outras classes consigam LER os dados
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getAno() { return ano; }
    public String getGenero() { return genero; }
    public String getDiretor() { return diretor; }

    // O toString ajuda a gente a "printar" o filme bonitinho no terminal para testar
    @Override
    public String toString() {
        return "Filme{id=" + id + ", titulo='" + titulo + "'}";
    }
}
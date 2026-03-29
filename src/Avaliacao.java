public class Avaliacao {
    private int usuarioId;
    private int filmeId;
    private double nota;

    public Avaliacao(int usuarioId, int filmeId, double nota) {
        this.usuarioId = usuarioId;
        this.filmeId = filmeId;
        this.nota = nota;
    }

    public int getUsuarioId() { return usuarioId; }
    public int getFilmeId() { return filmeId; }
    public double getNota() { return nota; }
}
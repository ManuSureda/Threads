public class Libro {
    private int idLibro;
    private String titulo;

    public Libro(int idLibro, String titulo) {
        this.idLibro = idLibro;
        this.titulo = titulo;
    }

    public int getIdLibro() {return idLibro;}

    public void setIdLibro(int idLibro) {this.idLibro = idLibro;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}


}

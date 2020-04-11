import java.util.Random;

public class Socio extends Thread{
    private Biblioteca biblioteca;
    private String nombre;
    private Libro libro;

    public Socio(Biblioteca biblioteca, String nombre) {
        this.nombre = nombre;
        this.biblioteca = biblioteca;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Libro getLibro() {return libro;}

    public void setLibro(Libro libro) {this.libro = libro;}

    public Biblioteca getBiblioteca() { return biblioteca; }

    public void setBiblioteca(Biblioteca biblioteca) { this.biblioteca = biblioteca; }

    public int aleatorio ()
    {
        Random ran = new Random();
        int aux = this.biblioteca.getLibros().size();
        int val = ran.nextInt()%aux;

        if (val<0)
        {
            val = val* (-1);
        }
        return val;
    }

    @Override
    public void run() {

        try
        {
            int val = 0;
            for (int i =0;i<10;i++)
            {
                val = this.aleatorio();
                this.setLibro(biblioteca.retirar(val));
                if (this.getLibro()!=null){
                    System.out.println("El socio " + this.getNombre()+ " saco el libro "+this.getLibro().getTitulo()+ " cantidad de libros: "+ biblioteca.getLibros().size());
                }
                Socio.sleep((long)aleatorio());

                biblioteca.devolver(this.libro);
                if(this.getLibro()!=null){
                    System.out.println("El socio " + this.getNombre()+ " devolvio el libro "+this.getLibro().getTitulo()+ " cantidad de libros: "+ biblioteca.getLibros().size());
                }
                Socio.sleep((long)aleatorio());
            }
        }
        catch (InterruptedException e)
        {

        }
    }
}

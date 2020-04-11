import java.util.ArrayList;
import java.util.Random;

public class Donador extends Thread {
    private ArrayList<Libro> libros;
    private Biblioteca biblioteca;
    private String nombre;

    public Donador(ArrayList<Libro> libros, Biblioteca biblioteca, String nombre) {
        this.libros = libros;
        this.biblioteca = biblioteca;
        this.nombre = nombre;
    }

    public Biblioteca getBiblioteca() { return biblioteca; }

    public void setBiblioteca(Biblioteca biblioteca) { this.biblioteca = biblioteca; }

    public ArrayList<Libro> getLibros() { return libros; }

    public void setLibros(ArrayList<Libro> libros) { this.libros = libros; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int aleatorio ()
    {
        Random ran = new Random();

        int val = ran.nextInt()%20;

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
            int i=0;
            while(!libros.isEmpty())
            {

                this.biblioteca.donar(libros.get(0));
                System.out.println("\nEl donador " + this.getNombre()+ " dono el libro "+this.libros.get(i).getTitulo()+" id: "+ this.libros.get(i).getIdLibro() + "\n");
                libros.remove(0);
                Socio.sleep((long)aleatorio());
            }
        }
        catch (InterruptedException e)
        {

        }
    }
}

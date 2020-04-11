import java.util.HashMap;

public class Biblioteca{
    private HashMap<Integer,Libro> libros;

    public Biblioteca() {
        this.libros = new HashMap<>();
    }

    public HashMap<Integer, Libro> getLibros() {return libros;}

    public void setLibros(HashMap<Integer, Libro> libros) { this.libros = libros; }

    public synchronized Libro retirar (int idLibro){
        while (libros.get(idLibro)== null)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {}
        }
            Libro aux = libros.get(idLibro);
            if (aux!=null){
                libros.remove(idLibro);
                return aux;
            }else{
                return null;
            }
    }

    public synchronized void devolver (Libro l){
        libros.put(l.getIdLibro(),l);
        notifyAll();
    }


}

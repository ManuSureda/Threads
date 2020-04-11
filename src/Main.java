import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro (0, "La vaca loca");
        Libro libro2 = new Libro (1, "El viejo y el mar");
        Libro libro3 = new Libro (2, "Tu vieja tambien");
        Libro libro4 = new Libro (3, "Harry el sucio Potter");
        Libro libro5 = new Libro (4, "Aca no sabia que poner");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.getLibros().put(libro1.getIdLibro(),libro1);
        biblioteca.getLibros().put(libro2.getIdLibro(),libro2);
        biblioteca.getLibros().put(libro3.getIdLibro(),libro3);
        biblioteca.getLibros().put(libro4.getIdLibro(),libro4);
        biblioteca.getLibros().put(libro5.getIdLibro(),libro5);

        Socio socio1 = new Socio(biblioteca, "Cecilia");
        Socio socio2 = new Socio(biblioteca, "Miguel");
        Socio socio3 = new Socio(biblioteca, "Pedro");
        Socio socio4 = new Socio(biblioteca, "Eugenia");
        Socio socio5 = new Socio(biblioteca, "Victoria");
        Socio socio6 = new Socio(biblioteca, "Belen");
        Socio socio7 = new Socio(biblioteca, "Gustavo");
        Socio socio8 = new Socio(biblioteca, "Federico");
        Socio socio9 = new Socio(biblioteca, "Pablo");
        Socio socio10 = new Socio(biblioteca, "Amelia");

        socio1.start();
        socio2.start();
        socio3.start();
        socio4.start();
        socio5.start();
        socio6.start();
        socio7.start();
        socio8.start();
        socio9.start();
        socio10.start();
    }
}
import java.util.ArrayList;
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
        biblioteca.getLibros().put(6,new Libro(6,"jarri el susio poter"));
        biblioteca.getLibros().put(7,new Libro(7,"eish of empaiers"));
        biblioteca.getLibros().put(8,new Libro(8,"ricardo martin"));
        biblioteca.getLibros().put(9,new Libro(9,"apoteosico"));
        biblioteca.getLibros().put(10,new Libro(10,"el bar sinson"));
        biblioteca.getLibros().put(11,new Libro(11,"lirbrito libron"));
        biblioteca.getLibros().put(12,new Libro(12,"jamon y queso"));
        biblioteca.getLibros().put(13,new Libro(13,"papa"));
        biblioteca.getLibros().put(14,new Libro(14,"tomate"));
        biblioteca.getLibros().put(15,new Libro(15,"salchicha"));
        biblioteca.getLibros().put(16,new Libro(16,"yuyo"));
        biblioteca.getLibros().put(17,new Libro(17,"empanada"));
        biblioteca.getLibros().put(18,new Libro(18,"tuco"));
        biblioteca.getLibros().put(19,new Libro(19,"ribotril"));


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

        ArrayList <Libro> librossss = new ArrayList<>();
        librossss.add(new Libro(20,"lirboide1"));
        librossss.add(new Libro(21,"lirboide2"));
        librossss.add(new Libro(22,"lirboide3"));
        Donador d = new Donador(librossss,biblioteca,"ELQUEDONA");

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

        d.start();

    }
}
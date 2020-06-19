package equalsEhashCode;

import java.time.LocalDate;

public class TesteEquals {
    public static void main(String[] args) {

        Pessoa fabiana = new Pessoa(
                "Fabiana Oliveira",
                LocalDate.of(1987,10,11),
                "33344566787890",
                "Caruaru");

        Pessoa fabianaCopia = new Pessoa(
                "Fabiana Oliveira",
                LocalDate.of(1987,10,11),
                "33344566787890",
                "Caruaru");

        Pessoa joana = new Pessoa(
                "Joana Oliveira",
                LocalDate.of(1987,10,11),
                "33344566787870",
                "Caruaru");

        System.out.println("Comparando objetos fabiana com joana = "+(fabiana.equals(joana)));
        System.out.println("Comparando objetos fabiana com fabianaCopia = "+(fabiana.equals(fabianaCopia)));

    }
}

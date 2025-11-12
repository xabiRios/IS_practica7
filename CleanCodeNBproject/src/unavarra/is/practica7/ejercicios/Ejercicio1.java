package unavarra.is.practica7.ejercicios;

public class Ejercicio1 {
    
    public static Boolean empiezaAyTerminaS(String s){
		return(s.startsWith("A") && (s.endsWith("S"));
    }

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println(empiezaAyTerminaS("HOLA"));
        System.out.println(empiezaAyTerminaS("ADIOS"));
    }
    
}

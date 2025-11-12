package unavarra.is.practica7.ejercicios;

public final class Ejercicio6 {
	
	private Ejercicio6() {
	}
	
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    public static char obtenerLetraDNI(int dni) {
		int resto = dni % 23;
		return LETRAS_DNI.charAt(resto);
    }
            
    public static void main(String[] args) {
        System.out.println(DNI(72700123)); 
    }
    
}

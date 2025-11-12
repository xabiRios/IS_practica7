package unavarra.is.practica7.ejercicios;

public final class Ejercicio4 {
	
	private Ejercicio4() {
	}

    private static final String[] DIAS_SEMANA = {
        "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"
    };
    
    public static String obtenerNombreDia(int numeroDia) {
		if (numeroDia < 1 || numeroDia > 7) {
            return "dia incorrecto";
        }
        return DIAS_SEMANA[numeroDia - 1];
    }
    

    public static void main(String[] args) {
        System.out.println(obtenerNombreDia(3));
        System.out.println(obtenerNombreDia(9));
    }
    
}

package unavarra.is.practica7.ejercicios;

public class Ejercicio5 {
    
    public static String obtenerDuracionMes(int numeroMes) {
		if (numeroMes == 2) {
            return "Es un mes de 28 o 29 dias";
        }
        if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            return "Es un mes de 30 dias";
        }
        if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || 
            numeroMes == 7 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) {
            return "Es un mes de 31 dias";
        }
        return "Mes incorrecto";
    }
        
    public static void main(String[] args) {
        System.out.println(obtenerDuracionMes(1));
        System.out.println(obtenerDuracionMes(2));
        System.out.println(obtenerDuracionMes(4));
        System.out.println(obtenerDuracionMes(13));
    }
    
}

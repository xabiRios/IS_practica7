package unavarra.is.practica7.ejercicios;

public class Ejercicio3 {
	
	private Ejercicio3() {
	}
	
	public enum EstadoValidacion {
        CORRECTO,
        HORA_INCORRECTA,
        MINUTOS_INCORRECTOS,
        SEGUNDOS_INCORRECTOS
    }
    
    public static EstadoValidacion horaValidada(int hora, int minutos, int segundos){
        if (hora <= 0 || hora >= 24) {
            return EstadoValidacion.HORA_INCORRECTA;
        }
        if (minutos <= 0 || minutos >= 60) {
            return EstadoValidacion.MINUTOS_INCORRECTOS;
        }
        if (segundos <= 0 || segundos >= 60) {
            return EstadoValidacion.SEGUNDOS_INCORRECTOS;
        }
        return EstadoValidacion.CORRECTO;
    }

    public static void main(String[] args) {
        System.out.println(horaValidada(9,34,23));
        System.out.println(horaValidada(25,34,23));
    }
    
}

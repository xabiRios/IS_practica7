package unavarra.is.practica7.ejercicios;

import java.time.LocalDate;

public class Ejercicio7 {
    public static class Paciente {
		
		private String nombre;
        private float peso;
        private float altura;
        private int añoNacimiento;
        
        
        private static final float UMBRAL_SOBREPESO = 25.0f;
        private static final int EDAD_RIESGO = 65;
        
        public Paciente(String nombre, float peso, float altura, int añoNacimiento) {
            this.nombre = nombre;
            this.peso = peso;
            this.altura = altura;
            this.añoNacimiento = añoNacimiento;
        }
        
        private float calcularIMC() {
			return this.peso / (this.altura * this.altura);
        }
        
        private int calcularEdad() {
            return LocalDate.now().getYear() - this.añoNacimiento;
        }
        
        public boolean tieneRiesgoCardiovascular() {
            boolean tieneSobrepeso = this.calcularIMC() >= UMBRAL_SOBREPESO;
            boolean esMayor = this.calcularEdad() > EDAD_RIESGO;
            
            return tieneSobrepeso && esMayor;
        }
        
        public String getNombre() {
            return this.nombre;
        }
    }
    
	
	public static void verificarRiesgo(Paciente[] pacientes) {
		for (Paciente paciente : pacientes) {
			if (paciente.tieneRiesgoCardiovascular()) {
                System.out.println(paciente.getNombre() + " tiene riesgo cardiovascular");
            }
        }
    }
    public static void main(String[] args) {  
        String[] datosPacientes = {
            "paciente1,80.2,1.84,2001",
            "paciente2,90.2,1.75,1940",
            "paciente3,89.2,1.75,2001"
        };
        Paciente[] listaPacientes = new Paciente[datosPacientes.length];
        
        for (int i = 0; i < datosPacientes.length; i++) {
            String[] t = datosPacientes[i].split(",");
            
            String nombre = t[0];
            float peso = Float.parseFloat(t[1]);
            float altura = Float.parseFloat(t[2]);
            int año = Integer.parseInt(t[3]);
            listaPacientes[i] = new Paciente(nombre, peso, altura, año);
        }
        verificarRiesgo(listaPacientes);
    }
    
}

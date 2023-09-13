import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Introduce el día de nacimiento:");
        int dia = scanner.nextInt();

        System.out.println("Introduce el mes de nacimiento:");
        int mes = scanner.nextInt();

        System.out.println("Introduce el año de nacimiento:");
        int anio = scanner.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de Nacimiento: " + persona.getDiaNacimiento() + "/" +
                persona.getMesNacimiento() + "/" + persona.getAnioNacimiento());

        System.out.println("\nEdad: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia Cardiaca Máxima: " + persona.calcularFrecuenciaMaxima() + " ppm");
        System.out.println("Rango de Frecuencia Cardiaca Esperada: " + persona.calcularRangoFrecuenciaEsperada() + " ppm");
    }
}

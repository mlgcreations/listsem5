import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
    }

    // Métodos para obtener y establecer los atributos
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDiaNacimiento() { return diaNacimiento; }
    public void setDiaNacimiento(int dia) { this.diaNacimiento = dia; }

    public int getMesNacimiento() { return mesNacimiento; }
    public void setMesNacimiento(int mes) { this.mesNacimiento = mes; }

    public int getAnioNacimiento() { return anioNacimiento; }
    public void setAnioNacimiento(int anio) { this.anioNacimiento = anio; }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        return Period.between(fechaNacimiento, hoy).getYears();
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String calcularRangoFrecuenciaEsperada() {
        int maxima = calcularFrecuenciaMaxima();
        double minRango = maxima * 0.50;
        double maxRango = maxima * 0.85;
        return String.format("%.2f - %.2f", minRango, maxRango);
    }
}

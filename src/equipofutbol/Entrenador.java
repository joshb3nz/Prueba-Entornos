package equipofutbol;

public class Entrenador {
    // Atributos
    private String nombre;
    private int edad;
    private int experiencia;

    // Constructor
    public Entrenador(String nombre, int edad, int experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
    }

    // Métodos
    public void dirigirEquipo(Equipo equipo) {
        System.out.println("El entrenador " + this.nombre + " está dirigiendo al equipo " + equipo.getNombre() + ".");
    }

    public void hacerCambio(Jugador jugadorEntra, Jugador jugadorSale) {
        System.out.println("El entrenador " + this.nombre + " está haciendo un cambio: entra " + jugadorEntra.getNombre()
                + " y sale " + jugadorSale.getNombre() + ".");
    }

    public void entrenarJugador(Jugador jugador) {
        System.out.println("El entrenador " + this.nombre + " está entrenando a " + jugador.getNombre() + ".");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
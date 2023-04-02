package equipofutbol;
import java.util.ArrayList;
import java.util.List;
public class Equipo {
    // Atributos
    private String nombre;
    private int puntos;
    private int golesMarcados;
    private int golesRecibidos;
    private List<Jugador> jugadores;

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.golesMarcados = 0;
        this.golesRecibidos = 0;
        this.jugadores = new ArrayList<>();
    }

    // Métodos
    public void jugarPartido(Equipo equipoRival, int golesEquipoLocal, int golesEquipoVisitante) {
        // Actualizamos los goles marcados y recibidos de cada equipo
        this.golesMarcados += golesEquipoLocal;
        this.golesRecibidos += golesEquipoVisitante;
        equipoRival.golesMarcados += golesEquipoVisitante;
        equipoRival.golesRecibidos += golesEquipoLocal;

        // Actualizamos los puntos de cada equipo
        if (golesEquipoLocal > golesEquipoVisitante) {
            this.puntos += 3;
        } else if (golesEquipoLocal == golesEquipoVisitante) {
            this.puntos += 1;
            equipoRival.puntos += 1;
        } else {
            equipoRival.puntos += 3;
        }
    }

    public void añadirJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
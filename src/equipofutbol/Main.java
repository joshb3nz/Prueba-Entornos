package equipofutbol;

public class Main {
    public static void main(String[] args) {
        // Creamos dos equipos
        Equipo equipo1 = new Equipo("Equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2");

        // Creamos algunos jugadores
        Jugador jugador1 = new Jugador("Jugador 1", "Delantero", 9);
        Jugador jugador2 = new Jugador("Jugador 2", "Defensa", 4);
        Jugador jugador3 = new Jugador("Jugador 3", "Mediocampista", 8);

        // Añadimos los jugadores al primer equipo
        equipo1.añadirJugador(jugador1);
        equipo1.añadirJugador(jugador2);
        equipo1.añadirJugador(jugador3);

        // Jugar partido entre los dos equipos
        equipo1.jugarPartido(equipo2, 2, 1);

        // Mostramos la información de los equipos
        System.out.println("Información del equipo " + equipo1.getNombre());
        System.out.println("Puntos: " + equipo1.getPuntos());
        System.out.println("Goles marcados: " + equipo1.getGolesMarcados());
        System.out.println("Goles recibidos: " + equipo1.getGolesRecibidos());
        System.out.println("Jugadores:");
        for (Jugador jugador : equipo1.getJugadores()) {
            System.out.println(jugador.getNombre() + " - " + jugador.getPosicion() + " - " + jugador.getNumeroCamiseta());
        }

        System.out.println();

        System.out.println("Información del equipo " + equipo2.getNombre());
        System.out.println("Puntos: " + equipo2.getPuntos());
        System.out.println("Goles marcados: " + equipo2.getGolesMarcados());
        System.out.println("Goles recibidos: " + equipo2.getGolesRecibidos());
    }
}
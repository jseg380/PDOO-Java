
package ejercicios;

import java.util.ArrayList;


public class Cliente {
    private String dni;
    private String nombre;
    private ArrayList<Reserva> reservas;
    
    public Cliente (String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        reservas = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }
    
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}

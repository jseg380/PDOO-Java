package ejercicios;

import java.util.ArrayList;

public class Hotel {
    private static int NUM_HOTELES = 0;
    private String nombre;
    private String ciudad;
    private int estrellas;
    private Director director;
    private ArrayList<Reserva> reservas;
    private ArrayList<Empleado> empleados;
    private ArrayList<Habitacion> habitaciones;
    
    public Hotel(String nombre, String ciudad, int estrellas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estrellas = estrellas;
        reservas = new ArrayList<>();
        empleados = new ArrayList<>();
        habitaciones = new ArrayList<>();
        NUM_HOTELES++;
    }
    
    public static int getNUM_HOTELES() {
        return NUM_HOTELES;
    }
    
    public void setDirector (Director director) {
        this.director = director;
    }
    
    public Director getDirector() {
        return director;
    }
    
    public void addReserva(Cliente c, String fechaE, String fechaS) {
        reservas.add(new Reserva(fechaE, fechaS, c, this));
    }
    
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    public boolean addEmpleado(Empleado empleado) {
        boolean correcto = true;
        
        if (empleado.addTrabajo(this))
            empleados.add(empleado);
        else
            correcto = false;
        
        return correcto;
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void addHabitacion(int numero, int capacidad) {
        habitaciones.add(new Habitacion(numero, capacidad));
    }
    
    public int buscarHabitacionCapacidad(int capacidad) {
        int numHabitacion = -1;
        for (int i = 0; i < habitaciones.size() && numHabitacion == -1; i++) {
            if (habitaciones.get(i).getCapacidad() >= capacidad) {
                numHabitacion = habitaciones.get(i).getNumero();
            }
        }
        
        return numHabitacion;
    }

    public String toString() {
        return "Hotel " + nombre + "\nCiudad " + ciudad + "\nEstrellas " + estrellas;
    }
}

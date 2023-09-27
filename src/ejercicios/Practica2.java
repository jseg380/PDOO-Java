
package ejercicios;


public class Practica2 {
    public static void main(String[] args) {
        Hotel hotel1, hotel2;
        
        hotel1 = new Hotel("1", "París", 5);
        hotel2 = new Hotel("2", "Berlín", 5);
        
        System.out.println("Hay " + Hotel.getNUM_HOTELES() + " hoteles");
        
        
        Director director1;
        
        director1 = new Director("Pedro", 987654321);
        
        hotel1.setDirector(director1);
        
        System.out.println(hotel1.getDirector());
        
        Cliente cliente1;
        
        cliente1 = new Cliente("12345678A", "Felipe");
        
        Reserva reservaC1;
        String fechaE = "08/10/2022",
               fechaS = "10/10/2022";
        
        reservaC1 = new Reserva(fechaE, fechaS, cliente1, hotel2);
        
        cliente1.addReserva(reservaC1);
        hotel2.addReserva(cliente1, fechaE, fechaS);
        
        System.out.println("\n\n\n");
        
        System.out.println("Reservas de " + hotel2);
        for (Reserva reserva: hotel2.getReservas()) {
            System.out.println(reserva.getCliente().getNombre() + "\n" + 
                    reserva.getFechaEntrada());
        }
        
        Empleado empleado1;
        
        empleado1 = new Empleado("Mario");
        
        hotel1.addEmpleado(empleado1);
        empleado1.addTrabajo(hotel1);
        
        System.out.println(hotel1.getEmpleados().size());
        
        
        hotel1.addHabitacion(1, 2);
        hotel1.addHabitacion(1, 3);
        
        int numHuespedes = 2,
            numHabitacion = hotel1.buscarHabitacionCapacidad(numHuespedes);
        
        if (numHabitacion == -1)
            System.out.println("No hay habitaciones con capacidad " + 
                    "suficiente para " + numHuespedes + " personas");
        else
            System.out.println("La habitación " + numHabitacion + 
                    " tiene capacidad para al menos " + numHuespedes + " personas");
        
        
   }
}

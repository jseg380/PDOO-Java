
package ejercicios;


public class Reserva {
    private String fechaEntrada,
                   fechaSalida;
    private Cliente cliente;
    private Hotel hotel;
    
    public Reserva(String fechaE, String fechaS, Cliente cliente, Hotel hotel) {
        fechaEntrada = fechaE;
        fechaSalida = fechaS;
        this.cliente = cliente;
        this.hotel = hotel;
    }
    
    public String getFechaEntrada() {
        return fechaEntrada;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public String toString() {
        return ("Reserva\n" + hotel + "\n" + cliente.getNombre() + "\nDesde: " + 
                fechaEntrada + "\nHasta: " + fechaSalida);
    }
}

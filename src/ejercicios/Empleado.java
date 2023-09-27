
package ejercicios;

import java.util.ArrayList;


public class Empleado {
    private String nombre;
    private ArrayList<Hotel> trabaja = new ArrayList<>();
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean addTrabajo(Hotel hotel) {
        boolean correcto = true;
        
        if (trabaja.size() < 2 && !trabaja.contains(hotel))
            trabaja.add(hotel);
        else
            correcto = false;
        
        return correcto;
    }
}

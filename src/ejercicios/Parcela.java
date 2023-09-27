
package ejercicios;


public class Parcela {
    
    private String nombre;
    private float precioCompra;
    private float precioEdificar;
    private float precioBaseAlquiler;
    private int numCasas=0;
    private int numHoteles=0;
    private final float FACTORALQUILERCALLE = 1.0f;
    private final float FACTORALQUILERCASA = 1.0f;
    private final float FACTORALQUILERHOTEL = 4.0f;
    
    public Parcela (String nombre, float precioCompra, float precioEdificar, 
                    float precioAlquiler){
        this.nombre=nombre;
        this.precioCompra=precioCompra;
        this.precioEdificar=precioEdificar;
        precioBaseAlquiler=precioAlquiler;
        
    }


    public String getNombre() {
        return nombre;
    }
   
    public float getPrecioCompra() {
        return precioCompra;
    }

    public float getPrecioEdificar() {
        return precioEdificar;
    }
    
    public int getNumHoteles() {
        return numHoteles;
    }
  
   public int getNumCasas(){
       return numCasas;
   }
   
    public float getPrecioAlquilerCompleto(){
        return (precioBaseAlquiler * (FACTORALQUILERCASA + numCasas + 
                numHoteles * FACTORALQUILERHOTEL));
    }
    
    public boolean construirCasa(){
        numCasas++;
        return true;
    }

    public boolean construirHotel(){
        numHoteles++;
        return true;
    }
    
    boolean igualdadIdentidad (Parcela otraParcela){
        return(this == otraParcela);
    }
    
    public boolean igualdadEstado (Parcela otraParcela){
       boolean iguales=true;
       
       if(!nombre.equals(otraParcela.nombre))
           iguales=false;
       else if(precioCompra != otraParcela.precioCompra)
           iguales=false;
       else if(precioEdificar != otraParcela.precioEdificar)
           iguales=false;
       else if(precioBaseAlquiler != otraParcela.precioBaseAlquiler)
           iguales=false;
       else if(numCasas != otraParcela.numCasas)
           iguales=false;
       else if(numHoteles != otraParcela.numHoteles)
           iguales=false;
       
       return iguales;
    }
}

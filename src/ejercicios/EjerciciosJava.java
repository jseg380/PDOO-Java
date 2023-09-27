
package ejercicios;


public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parcela p1 = new Parcela ("Parcela 1", 1, 2, 3);
        Parcela p2 = new Parcela ("Parcela 2", 35, 50, 10);
        Parcela p1_copia = new Parcela ("Parcela 1", 1, 2, 3);
        Parcela p1_2 = p1;
        
        p1.construirCasa();
        p1.construirHotel();
        p1.construirHotel();
        
        p1_copia.construirCasa();
        p1_copia.construirHotel();
        p1_copia.construirHotel();
        
        System.out.println(p1);    // Precio de alquiler completo incluido
        
        for (int i = 0; i < 3; i++)
            p2.construirCasa();
        
        System.out.println("\n\n");
        
        // Dos parcelas con la misma identidad
        
        if (p1.igualdadIdentidad(p1_2))
            System.out.println("p1 es la misma que p1_2");
        else
            System.out.println("p1 NO es la misma que p1_2");
        
        System.out.println("\n");
        
        // Dos parcelas con diferente identidad pero mismo estado
        
        if (p1.igualdadIdentidad(p1_copia))
            System.out.println("p1 es la misma que p1_copia");
        else
            System.out.println("p1 NO es la misma que p1_copia");
        
        if (p1.igualdadEstado(p1_copia))
            System.out.println("p1 tiene el mismo estado que p1_copia");
        else
            System.out.println("p1 NO tiene el mismo estado que p1_copia");
        
        System.out.println("\n");
        
        // Dos parcelas con diferente identidad y estado
        
        if (p1.igualdadIdentidad(p2))
            System.out.println("p1 es la misma que p2");
        else
            System.out.println("p1 NO es la misma que p2");
        
        if (p1.igualdadEstado(p2))
            System.out.println("p1 tiene el mismo estado que p2");
        else
            System.out.println("p1 NO tiene el mismo estado que p2");
    }
    
}

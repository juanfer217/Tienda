package umariana.taller2;
/**
 *
 * @author JuanJaramillo - JoseCabrera
 */
import java.util.Scanner;
import umariana.taller2.Productos;

public class TiendaBarrio {

    public static void main(String[] args) {
        Productos p = new Productos();
        Scanner sc= new Scanner(System.in);
       
        boolean activo = true;
        do{
            System.out.println(" ________________________");
            System.out.println("|       MENU TIENDA      |");
            System.out.println("|                        |");
            System.out.println("|1. Agregar producto     |");
            System.out.println("|2. Ver inventario       |");
            System.out.println("|3. Productos organizados|");
            System.out.println("|4. Eliminar producto    |");
            System.out.println("|5. Salir                |");
            System.out.println("|________________________|");
            
            int opcion =sc.nextInt();
            switch(opcion){
                case 1: 
                    p.agregarProducto();
                    break;
                case 2: 
                  p.verInventario();
                    break;
                case 3:
                 p.organizar();
                    break;
                case 4:
                  p.eliminar();                 
                    break;
                case 5:
               activo = false; 
                    System.out.println("PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");   
            }
            
        }while(activo);
    }
}
        

    

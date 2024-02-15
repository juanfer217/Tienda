package umariana.taller2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Productos {
     private int idProducto;
    private String nombre; 
    private float precio; 
    private int cantidad;
     Scanner sc= new Scanner(System.in);
        ArrayList<Productos> misProductos = new ArrayList<>();

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
   
 public Productos() {
    
    }

    public Productos(String nombre, int idProducto, float precio, int cantidad) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public void agregarProducto() {
                    System.out.println("Agregue nombre de producto");
                    
                    String nombre = sc.next();
                    
                    System.out.println("ingrese id del producto");
                    int idProducto = sc.nextInt();
                    
                    System.out.println("Añada precio al producto");
                    float precio = sc.nextFloat();
                    
                    System.out.println("Qué cantidad de producto?");
                    int cantidad = sc.nextInt();
                    Productos nuevoProducto = new Productos (nombre, idProducto, precio, cantidad);
                    
                    misProductos.add(nuevoProducto);
    
}
    public void verInventario(){
                 System.out.println("Productos de la tienda");
                 System.out.println("----------------------");
                    
                    for(Productos p :misProductos){
                        
                        System.out.println("Nombre: " + p.getNombre());
                        
                        System.out.println("Id producto: " + p.getIdProducto());
                        
                        System.out.println("Precio: " + p.getPrecio());
                        
                        System.out.println("cantida: " + p.getCantidad());
                        
                        System.out.println("---------------------");
                    
                    }
    }
    
    public void organizar(){
           for (int i = 0; i < misProductos.size() - 1; i++) {
                        for (int j = i + 1; j < misProductos.size(); j++) {
                            Productos producto1 = misProductos.get(i);
                            Productos producto2 = misProductos.get(j);

                            if (producto1.getCantidad() > producto2.getCantidad()) {
                                misProductos.set(i, producto2);
                                misProductos.set(j, producto1);
                            }
                        }
                    }
                    System.out.println("Ordenado por cantidad:");
                    System.out.println("----------------------");
                    for (Productos p : misProductos) {
                        System.out.println("Nombre: " + p.getNombre());
                        System.out.println("id:" + p.getIdProducto());
                        System.out.println("Precio: " + p.getPrecio());
                        System.out.println("Cantidad: " + p.getCantidad());
                        System.out.println("---------------------");
                    }
    }
    
    public void eliminar(){

                    System.out.println("Digite el id del producto que quieres eliminar");
                    int id = sc.nextInt();
                    Iterator<Productos> it = misProductos.iterator();
                    
                    while(it.hasNext()){
                        Productos p = it.next();
                        if(p.getIdProducto()==id){
                            it.remove();
                        }
                        System.out.println("El producto " + p.nombre + " con la id " + id + " ha sido eliminado" );
                        System.out.println(" ");
                    }                    
    }
}
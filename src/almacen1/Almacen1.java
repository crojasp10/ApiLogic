/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen1;
 import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author pc
 */
public class Almacen1 {
    
    double TotalNeto=0;
    int Domicilio=10000;
    int SubTotal=0;
    double Iva=0;
    private ArrayList<Productos> productos;
    
    public Almacen1(){
        productos = new ArrayList();
    }
    public Almacen1(ArrayList <Productos> productos){
        this.productos = productos;
    }
    public void agregarProducto ( Productos p){
        productos.add(p);
    }
    
    public void listarProductos(){
        System.out.println("***Inventario Productos***");
        for(Productos i:productos){
            SubTotal= SubTotal + (i.Cantidad*i.Precio);
            System.out.println(i);
        }
        if(SubTotal>=70000){
                Iva = SubTotal*(0.19);
            }
        if(SubTotal>100000){
                Domicilio=0;  
        }
        if(SubTotal>70000){
        TotalNeto = SubTotal + (SubTotal*(0.19)); 
        }
        else{
            TotalNeto = SubTotal;
        } 
        System.out.println("\tIva: " + Iva + "\n"+ "\tTotalNeto:"+ TotalNeto+ 
                            "\n"+ "\tDomicilio:"+ Domicilio  );
    
    }
    
    
    public void Enunciado(){
        System.out.println("Que desea hacer?:\n"
                        + "\t1:Seleccionar producto\n"
                        + "\t2:facturar\n"
                        + "\t3:salir");
    }
    
    public void procesarComandos(){
        
    String bandera2 = "verdad";
    while(bandera2!="falso"){    
        
        
        Scanner cc = new Scanner(System.in);
            System.out.println("Ingrese # de CC");
            String cedu = cc.nextLine();
            Scanner direccion = new Scanner(System.in);
            System.out.println("Ingrese dirección");
            String direc = direccion.nextLine();
  
            if(cedu.equals("12345") && direc.equals("carrera")){
                bandera2="falso";
            }
            else{
             System.out.println("Verifique sus datos");
            }
    }
    String bandera = "verdad"; 
    Enunciado();
    while (bandera!="falso"){
                
                Scanner comand = new Scanner (System.in);
                String comando = comand.nextLine();
                if (comando.equals("1")){
                    Scanner nombre = new Scanner(System.in);
                    System.out.println("Nombre del producto: ");
                    String name = nombre.nextLine();
                    Scanner pric = new Scanner(System.in);
                    System.out.println("Precio del producto: ");
                    int price = pric.nextInt();
                    Scanner quan = new Scanner(System.in);
                    System.out.println("Cantidad del producto: ");
                    int quantity = quan.nextInt();
                    
                    Productos p = new Productos (name,price,quantity);
                    agregarProducto(p);
                    Enunciado();
                    productos.clear();
                }
                if (comando.equals("2")){
                    listarProductos();
                    Enunciado();
                }
                if (comando.equals("3")){
                    bandera="falso";   
                }
                
                
            }
            
            
        }
        
    
    
    public static void main(String[] args) {
         new Almacen1().procesarComandos();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen1;

/**
 *
 * @author pc
 */
public class Productos {
    
    String Nombre;
    int Precio;
    int Cantidad; 
    int Domicilio = 10000;
   

public Productos( String nombre, int precio, int cantidad){
    Nombre = nombre;
    Precio = precio;
    Cantidad = cantidad;
}

public int Iva(){
    int Subtotal=Precio*Cantidad;
    double Iva=0;
    if(Subtotal>=70000){
       Iva = Subtotal*(0.19);
    }
    if(Subtotal>100000){
        Domicilio=0;    
    }   
    return (int) Iva;
}

public int TotalNeto(){
    int Subtotal= Precio*Cantidad;
    double TotalNeto;
    if(Subtotal>70000){
    TotalNeto = Subtotal -(Subtotal*(0.19)); 
    }
    else{
        TotalNeto = Subtotal;
    }
    return (int) TotalNeto;
    
}

   @Override
public String toString(){
    String s="";
    s+="\tProducto "+ Nombre +"\n";
    s+="\tPrecio "+ Precio + "x"+ Cantidad;
    //s+="\tIva: $"+ Iva() + "\n";
    //s+="\tTotal Neto: $"+ TotalNeto() + "\n";
    //s+="\tDomicilio: " + Domicilio;
     
    return s;   
     }
    
   
    
    
}

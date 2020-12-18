/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.GrupoRedis.Entidates;
import com.google.gson.Gson;
import javax.swing.JTable;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import redis.clients.jedis.Jedis;
import uth.GrupoRedis.UI.FrameMenu;

/**
 *
 * @author alico
 */
public class Producto {
    
    private String num_producto;
    private String nombre;
    private double precio;

    public Producto(String num_producto, String nombre, double precio) {
        this.num_producto = num_producto;
        this.nombre = '"'+nombre+'"';
        this.precio = precio;
    }
    
    public Producto() {
        this.num_producto = "";
        this.nombre = "";
        this.precio = 0;
    }

    public String getNum_producto() {
        return num_producto;
    }

    public void setNum_producto(String num_producto) {
        this.num_producto = num_producto;
    }

    public String getNombre() {
        
        String aux="";
        
        for(int i=0;i<nombre.length();i++){
            
            if(nombre.charAt(i)!='"'){
                aux+=nombre.charAt(i);
            }
        }
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = '"'+nombre+'"';
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" + "num_producto=" + num_producto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    //---------------------------------------------------------------------------------------------------
    //MIS METODOS
    public static void listarProductosEnTabla(Producto p[],JTable tabla){
        
        DefaultTableModel model ;
        
        String columnas[] = {"N° PRODUCTO", "NOMBRE", "PRECIO"};
        
        model = new DefaultTableModel(null, columnas);

        String [] filas = new String[3];     
        

        for (Producto aux: p) {

                  filas[0] = aux.getNum_producto();
                  filas[1] = aux.nombre;
                  filas[2] = aux.getPrecio()+"";
                  
                  model.addRow(filas);
        }
        
            
                
            tabla.setModel(model);
    }
    
    public static Producto[] redefinir(Producto []arg){
        Producto aux[] = new Producto[arg.length+1];      
        for(int i = 0; i < arg.length; i++) 
            aux[i] = arg[i]; 
        
        return aux;
    }
    
    public static String[] listarCodigosProductos(Jedis jedis){
        
        Set<String> llaves =jedis.keys("*");
        
        String codigosProductos[] = new String[0];
        
        for (String aux: llaves) {
            if(FrameMenu.tresPrimerasLetras(aux).equals("PRO")){
                 codigosProductos = FrameMenu.redefinirString(codigosProductos);
                 codigosProductos[codigosProductos.length-1] = aux+"";
            } 
        }
        
        return codigosProductos;
    }
    
    public static Producto[] listarObjetosProductos(Jedis jedis){
        
        Producto p = new Producto();
        
        Producto arr[] = new Producto[0];
        
        String llaves[] =listarCodigosProductos(jedis);
        
        for (String aux: llaves) {
            p = new Gson().fromJson(jedis.get(aux), Producto.class);
            
            arr = Producto.redefinir(arr);
            
            arr[arr.length-1] = p;
        }
        
        return arr;
        
    }
    
    public static String generarCodigo(Jedis r){
        
        String codigo="";
        
        while(true){
            codigo = "PRO."+FrameMenu.generarId();
            
            if(FrameMenu.buscarId(listarCodigosProductos(r), codigo));
            else break;
        }
        
        return codigo;
    }
    
    public static void buscarTablaNombre(String buscar, Producto nuevo[], JTable tabla) {
        
        DefaultTableModel model ;
        
        String columnas[] = {"N° PRODUCTO", "NOMBRE", "PRECIO"};
        
        model = new DefaultTableModel(null, columnas);
        
        int numLetras = buscar.length();
        
            
            Producto arrBuscar[] = new Producto[0];

            for (Producto e : nuevo) {
                String nomCortado = "";
                if (numLetras <= e.getNombre().length()) {
                    for (int i = 0; i < numLetras; i++) {
                        nomCortado += e.getNombre().charAt(i);
                    }

                    if (nomCortado.equalsIgnoreCase(buscar)) {
                        arrBuscar = redefinir(arrBuscar);
                        arrBuscar[arrBuscar.length - 1] = e;
                    }
                }
            }

            //int cont = 1;


            //JOptionPane.showMessageDialog(null, ""+temp.length);
            for (Producto e : arrBuscar) {
                model.addRow(new String[]{e.getNum_producto(), e.getNombre(), e.getPrecio()+""});
               // cont++;
            }

            tabla.setModel(model);

        }
    
    
}

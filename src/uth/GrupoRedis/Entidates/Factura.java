/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.GrupoRedis.Entidates;

import com.google.gson.Gson;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import redis.clients.jedis.Jedis;
import uth.GrupoRedis.UI.FrameMenu;

/**
 *
 * @author alico
 */
public class Factura {
    
    private String n_factura;
    private String rtn;
    private String nombreCliente;
    private double descuento;
    private double isv;
    private double subTotal;
    private double total;
    private String id_productos; // CDP.n_factura

    public Factura(String n_factura, String rtn, String nombreCliente, double descuento, double isv, double subTotal, double total, String id_productos) {
        this.n_factura = n_factura;
        this.rtn = '"'+rtn+'"';
        this.nombreCliente = '"'+nombreCliente+'"';
        this.descuento = descuento;
        this.isv = isv;
        this.subTotal = subTotal;
        this.total = total;
        this.id_productos = id_productos;
    }
    
    public Factura() {
        this.n_factura = "";
        this.rtn = "";
        this.nombreCliente = "";
        this.descuento = 0;
        this.isv = 0;
        this.subTotal = 0;
        this.total = 0;
        this.id_productos = "";
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getN_factura() {
        return n_factura;
    }

    public void setN_factura(String n_factura) {
        this.n_factura = n_factura;
    }

    public String getRtn() {
        
        String aux="";
        
        for(int i=0;i<rtn.length();i++){
            
            if(rtn.charAt(i)!='"'){
                aux+=rtn.charAt(i);
            }
        }
        
        return aux;
    }

    public void setRtn(String rtn) {
        this.rtn = '"'+rtn+'"';
    }

    public String getNombreCliente() {
        String aux="";
        
        for(int i=0;i<nombreCliente.length();i++){
            
            if(nombreCliente.charAt(i)!='"'){
                aux+=nombreCliente.charAt(i);
            }
        }
        
        return aux;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = '"'+nombreCliente+'"';
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIsv() {
        return isv;
    }

    public void setIsv(double isv) {
        this.isv = isv;
    }

    public String getId_productos() {
        return id_productos;
    }

    public void setId_productos(String id_productos) {
        this.id_productos = id_productos;
    }

    @Override
    public String toString() {
        return "{" + "n_factura=" + n_factura + ", rtn=" + rtn + ", nombreCliente=" + nombreCliente + ", descuento=" + descuento + ", isv=" + isv + ", subTotal=" + subTotal + ", total=" + total + ", id_productos=" + id_productos + '}';
    }

    
    //---------------------------------------------------------------------------------------------------
    //MIS METODOS
    
    public static Factura[] redefinir(Factura []arg){
        Factura aux[] = new Factura[arg.length+1];      
        for(int i = 0; i < arg.length; i++) 
            aux[i] = arg[i]; 
        
        return aux;
    }
    
    public static String generarCodigo(Jedis r){
        
        String codigo="";
        
        while(true){
            codigo = "FTA."+FrameMenu.generarId();
            
            if(FrameMenu.buscarId(listarCodigosFactura(r), codigo));
            else break;
        }
        
        return codigo;
    }
    
    public static String[] listarCodigosFactura(Jedis jedis){
        
        Set<String> llaves =jedis.keys("*");
        
        String codigosFacturas[] = new String[0];
        
        for (String aux: llaves) {
            if(FrameMenu.tresPrimerasLetras(aux).equals("FTA")){
                 codigosFacturas = FrameMenu.redefinirString(codigosFacturas);
                 codigosFacturas[codigosFacturas.length-1] = aux+"";
            } 
        }
        
        return codigosFacturas;
    }
    
    public static Factura[] listarObjetosFactura(Jedis jedis){
        
        Factura p = new Factura();
        
        Factura arr[] = new Factura[0];
        
        String llaves[] =listarCodigosFactura(jedis);
        
        for (String aux: llaves) {
            //System.out.println(jedis.get(aux));
            
            p = new Gson().fromJson(jedis.get(aux), Factura.class);
            
            arr = Factura.redefinir(arr);
            
            arr[arr.length-1] = p;
        }
        
        return arr;
        
    }
    
    public static void listarFacturasEnTabla(Factura f[],JTable tabla){
        
        DefaultTableModel model ;
        
        String columnas[] = {"N° FACTURA", "RTN", "CLIENTE"};
        
        model = new DefaultTableModel(null, columnas);

        String [] filas = new String[3];     
        

        for (Factura aux: f) {

                  filas[0] = aux.getN_factura();
                  filas[1] = aux.rtn;
                  filas[2] = aux.getNombreCliente();
                  
                  model.addRow(filas);
        }
        
            
                
            tabla.setModel(model);
    }
    
    public static void buscarTablaNombre(String buscar, Factura nuevo[], JTable tabla) {
        
        DefaultTableModel model ;
        
        String columnas[] = {"N° FACTURA", "RTN", "CLIENTE"};
        
        model = new DefaultTableModel(null, columnas);
        
        int numLetras = buscar.length();
        
            
            Factura arrBuscar[] = new Factura[0];

            for (Factura e : nuevo) {
                String nomCortado = "";
                if (numLetras <= e.getNombreCliente().length()) {
                    for (int i = 0; i < numLetras; i++) {
                        nomCortado += e.getNombreCliente().charAt(i);
                    }

                    if (nomCortado.equalsIgnoreCase(buscar)) {
                        arrBuscar = redefinir(arrBuscar);
                        arrBuscar[arrBuscar.length - 1] = e;
                    }
                }
            }

            //int cont = 1;


            //JOptionPane.showMessageDialog(null, ""+temp.length);
            for (Factura e : arrBuscar) {
                model.addRow(new String[]{e.getN_factura(), e.getRtn(), e.getNombreCliente()});
               // cont++;
            }

            tabla.setModel(model);

        }
}

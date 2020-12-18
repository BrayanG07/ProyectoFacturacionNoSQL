package uth.GrupoRedis.UI;


import redis.clients.jedis.Jedis;
import uth.GrupoRedis.Entidates.Producto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alico
 */
public class AgregarProductos {
    
    public static void agregarProductos(){
        Jedis redis = new Jedis("localhost");
        Producto p;
        
        p = new Producto(Producto.generarCodigo(redis), "Frijoles lb", 10.5);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Pera unid", 5);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Apio unid", 3);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Manzana unid", 10.89);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Arroz lb", 12.5);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Cebolla lb", 11.36);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Aguacate unid", 8);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Fosforos unid", 1);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Chile unid", 6);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Aguacate unid", 8);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Sardina unid", 15.35);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Mayonesa unid", 12.35);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Leche litro", 15);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Queso lb", 56.81);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Carne cerdo lb", 36.39);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
        
        p = new Producto(Producto.generarCodigo(redis), "Carne pollo lb", 32.75);
        redis.del(p.getNum_producto());
        redis.set(p.getNum_producto(), p.toString());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonInventario;

import java.util.ArrayList;
/**
 *
 * @author Sala-2-11-PC14
 */
public class Inventario {
    protected int capacidad;
    protected ArrayList<Interactuables> listaObjetos;
    
    public Inventario(int capacidad, ArrayList<Interactuables> listaObjetos) {
        this.capacidad = capacidad;
        this.listaObjetos = listaObjetos;
    }
    
    public void agregarItem(Interactuables item) {
        if(capacidad > listaObjetos.size()) {
            System.out.print("No queda espacio en el inventario.");
        }
        
        else {
            listaObjetos.add(item);
        }
    }
    
    public Interactuables obtenerObjeto(Interactuables Item) {
        
        for(i = 0; i < listaObjetos.size(); i++){
            Interactuables O = listaObjetos.get(i);
            if(Item.getIdObjeto().equals(O.getIdObjeto()) == 0) {
                return listaObjetos.get(i);
            }
        }
        
        return null;
    }

    
    public void actualizarObjeto(Interactuables nuevoItem, int indice){
        listaObjetos.set(indice,nuevoItem);
    }
    
    public void borrarItem(int indice) {
        listaObjetos.remove(indice);
    }
    
}

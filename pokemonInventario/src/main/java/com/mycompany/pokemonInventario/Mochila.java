/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonInventario;

/**
 *
 * @author Sala-2-11-PC14
 */
public class Mochila extends Inventario {
    
    public Mochila(int capacidad, ArrayList <Interactuables> listaObjetos){
        super(capacidad,listaObjetos);
    }
    
    public void usarObjeto(int indice){
        Objeto item = (Objeto) listaObjetos.get(indice);
        System.out.println("Has usado " + item.getNombreObjeto());
    }
}

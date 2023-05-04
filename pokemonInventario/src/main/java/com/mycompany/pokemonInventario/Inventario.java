/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
/**
 *
 * @author Sala-2-11-PC14
 */
public class Inventario {
    private int capacidad;
    private ArrayList<Interactuables> listaObjetos;
    
    public Inventario(int capacidad, ArrayList<Interactuables> listaObjetos) {
        this.capacidad = capacidad;
        this.listaObjetos = listaObjetos;
    }
    
    public Inventario(){
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Interactuables> getListaObjetos() {
        return listaObjetos;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaObjetos(ArrayList<Interactuables> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }


}

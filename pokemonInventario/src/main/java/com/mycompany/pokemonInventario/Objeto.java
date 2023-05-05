/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonInventario;

/**
 *
 * @author Sala-2-11-PC14
 */
public class Objeto extends Interactuables{
    private String tipoObjeto;

    public Objeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }
    
    public Objeto(){
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }
    
    
}

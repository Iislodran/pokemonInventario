/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonInventario;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pokedex extends Inventario{

    public Pokedex(int capacidad, ArrayList<Interactuables> listaObjetos) {
        super(capacidad, listaObjetos);
    }
    
    public void elegirPokemon(int indice) {
        Pokemon pokemon = (Pokemon) listaObjetos.get(indice);
        System.out.println("Pokemon elegido: " + pokemon.getNombrePokemon());
    }

}

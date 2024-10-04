package com.example.crr

class Persona {
    // Atributos privados
    private var nombre: String
    private var edad: Int
    // Constructor primario
    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
    // Getter para obtener el nombre
    fun getNombre(): String {
        return nombre
    }
    // Setter para modificar el nombre
    fun setNombre(nuevoNombre: String) {
        nombre = nuevoNombre
    }
    // Getter para obtener la edad
    fun getEdad(): Int {
        return edad
    }
    // Setter para modificar la edad
    fun setEdad(nuevaEdad: Int) {
        edad = nuevaEdad
    }
    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }

    fun equals(p2:Persona): Boolean{
        if (this.getNombre().equals(p2.nombre) && this.getEdad().equals(p2.getEdad())){
            return true
        }else{
            return false
        }
    }
}
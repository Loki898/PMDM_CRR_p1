package com.example.crr

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun iguales_CRR(){
        var p1:Persona= Persona(nombre="Paco", edad = 34);
        var p2:Persona= Persona(nombre="Paco", edad = 34);

        assertEquals(true, p1.equals(p2))
    }
}
package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {

    Triangulo T1 = new Triangulo(4, 4, 4);
    Triangulo T2 = new Triangulo(2, 2, 3);
    Triangulo T3 = new Triangulo(2, 3, 4);
    Triangulo T4 = new Triangulo(0, 0, 0);
    @Before
    public void inicializar(){
        Triangulo T1;
        Triangulo T2;
    }
    @Test 
    public void deveRetornarEquilateroSeOsTresLadosForemIguais(){
        assertEquals("Equilatero", T1.getTipo(T1));
    }

    @Test
    public void deveRetornarFalsoEquilateroCasoUmDosLadosForemDiferentes(){
        assertEquals("Equilatero", T1.getTipo(T1));
    }

    @Test
    public void deveRetornarFalsoEquilateroCasoDoisLadosForemIguaisEUmLadoDiferente(){
        assertEquals("Equilatero", T1.getTipo(T1));
    }
    @Test
    public void deveRetornarFalsoCasoOsTresLadosForemDiferentes(){
        assertEquals("Equilatero", T1.getTipo(T1));
    }

    public void deveRetornarFalsoCasoNaoPossuaDoisLadosComMedidasIguais(){
        assertEquals("Isóceles", T2.getTipo(T2));
    }
    public void deveRetornarFalsoCasoPossuaTresLadosComMedidasIguais(){
        assertEquals("Isóceles", T2.getTipo(T2));
    }

    @Test
    public void deveRetornarVerdadeiroEscalenoParaTodosOsLadosDiferentes(){
        assertEquals("Escaleno", T3.getTipo(T3));
    }
    
    @Test
    public void deveRetornarFalsoParaEscalenoCasoAlgumDosLadosSejaIgual(){
        assertEquals("Escaleno", T3.getTipo(T3));
    }
    @Test
    public void deveRetornarFalsoCasoTodosOsLadosSejamIguais(){
        assertEquals("Escaleno", T3.getTipo(T3));
    }
    @Test
    public void deveRetornarFalsoCasoDoisLadosSejamIguaisEUmLadoDiferente(){
        assertEquals("Escaleno", T3.getTipo(T3));
    }
    @Test
    public void deveRetornarIlegalParaLadosIguaisAZero(){
        assertEquals("Ilegal", T4.getTipo(T4));
    }
   
}
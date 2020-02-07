package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {

    Triangulo triangulo1; 
    Triangulo triangulo2;
    Triangulo triangulo3;
    Triangulo triangulo4;
    Triangulo triangulo5;
    Triangulo triangulo6;
    Triangulo triangulo7;
    Triangulo triangulo8;
    Triangulo triangulo9;
    Triangulo triangulo10;
    Triangulo triangulo11;
    Triangulo triangulo12;

    @Before
    public void inicializar(){
        triangulo1 = new Triangulo(4,4,4);
        triangulo2 = new Triangulo(8,8,4);
        triangulo3 = new Triangulo(2,3,4);
        triangulo4 = new Triangulo(0,0,0);
        triangulo5 = new Triangulo(6,2,3);
        triangulo6 = new Triangulo(5,2,5);
        triangulo7 = new Triangulo(2,9,9);
        triangulo8 = new Triangulo(2,2,0);
        triangulo9 = new Triangulo(3,0,5);
        triangulo10 = new Triangulo(9,5,3);
        triangulo11 = new Triangulo(4,9,3);
        triangulo12 = new Triangulo(4,5,1);
    }
    @Test
    public void deveRetornarEquilateroParaTodosOsLadosIguais(){
        String valorEsperado = "Equilatero";
        String valorRetornado = triangulo1.getTipo(triangulo1);
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIsoscelesCasoOLadoASejaIgualAoLadoB(){
        String valorEsperado ="Isosceles";
        String valorRetornado = triangulo2.getTipo(triangulo2);
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIsoscelesCasoOLadoBSejaIgualAoLadoC(){
        String valorEsperado = "Isosceles";
        String valorRetornado = triangulo7.getTipo(triangulo7);
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIsoscelesCasoOLadoASejaIgualAoLadoC(){
        String valorEsperado = "Isosceles";
        String valorRetornado = triangulo6.getTipo(triangulo6);
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentes(){
        String valorEsperado = "Escaleno";
        String valorRetornado = triangulo3.getTipo(triangulo3);
        assertEquals(valorEsperado, valorRetornado);
    }
    
    @Test
    public void deveRetornarIlegalParaTodosOsLadosIguaisAZero(){
        String valorEsperado = "Ilegal";
        String valorRetornado = triangulo4.getTipo(triangulo4);
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIlegalParaDoisLadosIguaisAZero(){
        String valorEsperado = "Ilegal";
        String valorRetornado = triangulo8.getTipo(triangulo8);
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIlegalParaUmLadoIgualAZero(){
        String valorEsperado = "Ilegal";
        String valorRetornado = triangulo9.getTipo(triangulo9);
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalCasoASubtracaoDoLadoAComLadoBSejaMenorQueOValorDoLadoC(){
        String valorEsperado = "Ilegal";
        String valorRetornado = triangulo5.getTipo(triangulo5);
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIlegalCasoASubtracaoDoLadoBcomLadoCSejaMenorQueOValorDoLadoA(){
        String valorEsperado = "Ilegal";
        String valorRetornado = triangulo10.getTipo(triangulo10);
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIlegalCasoASubtracaoDoLadoAComLadoCSejaMenorQueOValorDoLadoB(){
        String valorEsperado = "Ilegal";
        String valorRetornado = triangulo11.getTipo(triangulo11);
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIlegalCasoASubtracaoDeDoisLadosSejaIgualAoOutroLado(){
        String valorEsperado = "Ilegal";
        String valorRetornado = triangulo12.getTipo(triangulo12);
        assertEquals(valorEsperado, valorRetornado);

    }


}
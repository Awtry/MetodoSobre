package test;

import Metodos.MetodosSobrecargados;


public class test {
    public static void main(String[] args) {
   
        int  Cuadrado = MetodosSobrecargados.Calculo(4, 6);
        double Triangulo = MetodosSobrecargados.Calculo(10.50, 20.50);
        double Circulo = MetodosSobrecargados.Calculo(5);
        
        System.out.println("El área del Cuadrado/Rectangulo es: " + Cuadrado);
        System.out.println("El área del Trisangulo es: " + Triangulo);
        System.out.println("El área del Circulo es: " + Circulo);
    }
}

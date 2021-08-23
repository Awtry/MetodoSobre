package Metodos;


public class MetodosSobrecargados {
    
    public static int Calculo(int a, int b){   
        System.out.println("Área Cuadrado");
        return a * b;
    }
    
    public static double Calculo(double a, double b){
        System.out.println("Área Triangulo");
        return (a*b)/2;
    }
    
    public static double Calculo(double radio){
        System.out.println("Área Circulo");
        return 3.1416 * (radio * radio);
    }
}

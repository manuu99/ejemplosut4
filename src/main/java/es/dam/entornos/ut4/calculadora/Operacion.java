package es.dam.entornos.ut4.calculadora;

public class Operacion {
    private double a;
    private double b;

    public Operacion(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
//    public double suma() {
//        return a + b;
//    }
//    
//    public double resta() {
//        return a - b;
//    }
//    
//    public double multiplica() {
//        return a * b;
//    } 
//    
//    public double divide() {
//        return a / b;
//    }

}

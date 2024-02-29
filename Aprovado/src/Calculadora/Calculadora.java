package Calculadora;

class Calculadora {
    double total;

    public double somar(double x, double y) {
        total = x + y;
        return(total);
    }

    public double subtrair(double x, double y) {
        total = x - y;
        return(total);
    }

    public double dividir(double x, double y) {
        total = x / y;
        return(total);
    }

    public double multiplicar(double x, double y) {
        total = x * y;
        return (total);
    }
}


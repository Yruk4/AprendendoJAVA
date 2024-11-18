package POO.aprendendo_classes.src.alturaRetangulo.entidade;

public class Retangulo {


    public double altura, largura;

    public double largura() {
        return this.largura;
    }

    public double altura() {
        return this.altura;
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return (this.largura + this.altura) * 2;
    }

    public double diagonal() {
        double calculoPotencia = Math.pow(this.largura, 2) + Math.pow(this.altura, 2);
        return Math.sqrt(calculoPotencia);
    }

    public String toString() {
        return "Area do triangulo: " + area()
                + " "
                + "Perimetro: " + perimetro()
                + " "
                + "Diagonal: " + diagonal();
    }
}

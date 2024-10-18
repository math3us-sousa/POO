package Exercise1;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double area(){
        return Math.PI * this.raio * this.raio;
    }
    public double getDiametro(){
        return 2 * this.raio;
    }
    public String toString() {
        return "Exercise1.Circulo [raio=" + raio + ", cor=" + getCor() + "]";
    }
}

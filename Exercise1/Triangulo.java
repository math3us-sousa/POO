package Exercise1;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double area(){
        return (base*altura)/2;
    }
    public String toString() {
        return "Exercise1.Triangulo [base=" + base + ", altura=" + altura + ", cor=" + getCor() + "]";
    }
}

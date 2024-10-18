package Exercise1;

public class Quadrado extends Retangulo{
    public Quadrado(double lado, String cor) {
        super(lado,lado,cor);
    }
    @Override
    public String toString() {
        return "Exercise1.Quadrado [lado=" + getLado1() + ", cor=" + getCor() + "]";
    }
}

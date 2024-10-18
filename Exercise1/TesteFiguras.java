package Exercise1;

public class TesteFiguras {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4.0, 5.0, "Azul");
        Quadrado quadrado = new Quadrado(4.0, "Verde");
        Triangulo triangulo = new Triangulo(3.0, 6.0, "Vermelho");
        Circulo circulo = new Circulo(2.5, "Amarelo");
        System.out.println(retangulo);
        System.out.println("Área do retângulo: " + retangulo.area());

        System.out.println(quadrado);
        System.out.println("Área do quadrado: " + quadrado.area());

        System.out.println(triangulo);
        System.out.println("Área do triângulo: " + triangulo.area());

        System.out.println(circulo);
        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Diâmetro do círculo: " + circulo.getDiametro());
    }
}

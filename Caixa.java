import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite comprimento da cx: ");
        float comprimento = scanner.nextFloat();
        System.out.print("Digite altura da cx: ");
        float altura = scanner.nextFloat();
        System.out.print("Digite largura da cx: ");
        float largura = scanner.nextFloat();

        float area = 2 * ( comprimento * largura + comprimento * altura + largura * altura);
        System.out.print("A area da caixa é: " + area);
    }
}

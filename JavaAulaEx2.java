
/**
 * @author 32212259
 */
import java.util.Scanner;
public class JavaAulaEx2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        char vogal;
        
        System.out.println("Digite uma vogal para que apareça uma palavra: ");
        vogal = teclado.next().charAt(0);
        
        switch (vogal) {
            case 'a':
                System.out.println(vogal+("vocado"));
                break;
            case 'e':
                System.out.println(vogal+("lon Musk"));
                break;
            case 'i':
                System.out.println(("Y")+vogal+(" Long Ma"));
                break;
            case 'o':
                System.out.println(vogal+("lho - olho"));
                break;
            case 'u':
                System.out.println(vogal+("va"));
                break;
             }
    }
    
}

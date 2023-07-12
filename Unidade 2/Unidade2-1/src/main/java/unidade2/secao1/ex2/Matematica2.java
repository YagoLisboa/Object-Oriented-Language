package unidade2.secao1.ex2;

/**
 *
 * @author Yago Lisboa
 */
public class Matematica2 {
    static final double PI  = 3.1415926535;
    static final double E   = 2.7182818284;
    static final double PHI = 1.6180339887;
    
    static int soma(int a, int b){
        return a + b;
    }
    
    static int mult(int a, int b){
        return a * b;
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Numero Pi: " + Matematica2.PI);
        System.out.println("Numero E: " + Matematica2.E);
        System.out.println("Numero Phi: " + Matematica2.PHI);
        System.out.println("Soma: " + Matematica2.soma(5, 3));
        System.out.println("Multiplicação: " + Matematica2.mult(5, 3));
    }
}

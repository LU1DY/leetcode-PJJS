package dia_002;

public class isPalindrome {
    public static boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        String invertido = new StringBuilder(original).reverse().toString();
        boolean resultado = original.equals(invertido);
        return resultado;
    }

    public static void main(String[] args) {
        boolean resultado = isPalindrome.isPalindrome(-121);
        System.out.println(resultado);
    }
}

public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = 'a';
        char arroba = '\u0040';
        char arrobaDecimal = 64;
        char arrobaSimbolo = '@';

        System.out.println("caracter = " + caracter);
        System.out.println("arroba = " + arroba);
        System.out.println("arrobaDecimal = " + arrobaDecimal);
        System.out.println("arrobaSimbolo = " + arrobaSimbolo);

        System.out.println("tipo char corresponde en byte a: " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a: " + Character.SIZE);
        System.out.println("Valor máximo en un char: " + Character.MIN_VALUE);
        System.out.println("Valor minimo en un char: " + Character.MAX_VALUE);
    }
}

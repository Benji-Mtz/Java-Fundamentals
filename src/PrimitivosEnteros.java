public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor máximo en un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo en un byte: " + Byte.MIN_VALUE);


        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor máximo en un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo en un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor máximo en un int: " + Integer.MIN_VALUE);
        System.out.println("Valor minimo en un int: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor máximo en un long: " + Long.MIN_VALUE);
        System.out.println("Valor minimo en un long: " + Long.MAX_VALUE);

        var numeroVar = 9223372036854775808D; // Asume el valor maximo
        System.out.println("numeroVar es = " + numeroVar + " y es de tipo " + ((Object)numeroVar).getClass().getSimpleName());

    }
}
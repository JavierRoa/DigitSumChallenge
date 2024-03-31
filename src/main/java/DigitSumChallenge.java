public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits for 125 = " + sumDigits(125));
        System.out.println("The sum of digits for 1000 = " + sumDigits(1000));
        System.out.println("The sum of digits for 5 = " + sumDigits(5));
    }
    // Solución (menos eficiente):
    private static int sumDigits(int number) {
        if(number<0) {  // Valido que el número sea mayor a 0.
            return -1;
        }
        int sumOfDigits = 0;  // Creo la variable sumOfDigits.
        String numberString = String.valueOf(number);  // Transformo el número en un String
        for(int i=0; i<numberString.length();i++) {  // Recorro el string.
            int digit = Character.getNumericValue(numberString.charAt(i));  // Paso cada caracter a un número int.
            sumOfDigits += digit;  // Finalmente sumo cada dígito a la variable sumOfDigits.
        }
        return sumOfDigits;  // Retorno la suma de los dígitos.
    }
    // Solución (más eficiente):
    private static int sumDigitsSimplified(int number) {
        if(number<0) {  // Valido que el número sea mayor a 0.
            return -1;
        }
        int sumOfDigits = 0;  // Creo la variable sumOfDigits.

        while (number > 0){  // Uso un bucle while que en cada iteración:
            sumOfDigits += number % 10;  // - Suma a sumOfDigits, el mod 10 de number (el último dígito).
            number /= 10;  // Divido number / 10, para remover el último dígito
        }
        return sumOfDigits;  // Retorno el valor de sumOfDigits.
    }
}

package Modelo;

/**
 *
 * @author Gabriel Torres & Emerson Vera
 */
public class ConversionesYOperaciones {
    
    public static boolean validarDecimal(String decimal) {
        String caracteresDecimales = "0123456789";
        for (int i = 0; i < decimal.length(); i++) {
            char caracter = decimal.charAt(i);
            // Si no se encuentra dentro de los caracteres válidos, regresamos false
            if (caracteresDecimales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean validarBinario(String binario) {
        for (int i = 0; i < binario.length(); i++) {
            char caracter = binario.charAt(i);
            if (caracter != '0' && caracter != '1') {
                return false;
            }
        }
        return true;
    }

    public static boolean validarOctal(String octal) {
        String caracteresOctales = "01234567";
        for (int i = 0; i < octal.length(); i++) {
            char caracter = octal.charAt(i);
            // Si no se encuentra dentro de los caracteres válidos, regresamos false
            if (caracteresOctales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }

// Nota: se debe enviar la cadena hexadecimal convertida a mayúsculas
    public static boolean validarHexadecimal(String hexadecimal) {
        // Comprobar si solo tiene números del 0 al 9 y letras de la A a la F
        String caracteresHexadecimales = "0123456789ABCDEF";
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = Character.toUpperCase(hexadecimal.charAt(i));
            // Si no se encuentra dentro de los caracteres válidos, regresamos false
            if (caracteresHexadecimales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }

    public String decimalABinario(int decimal) {
//        if (validarDecimal(decimal) == false) {
//            throw new RuntimeException("NO ES UN NUMERO DECIMAL");
//        }
        if (decimal == 0) {
            return "0";
        } else {
            String binario = "";
            while (decimal > 0) {
                binario = (decimal % 2) + binario;
                decimal = decimal / 2;
            }
            return binario;
        }
    }

    public String decimalAOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        } else {
            int residuo;
            String octal = "";
            char[] Octales = {'0', '1', '2', '3', '4', '5', '6', '7'};
            while (decimal > 0) {
                residuo = decimal % 8;
                char caracter = Octales[residuo];
                octal = caracter + octal;
                decimal = decimal / 8;
            }
            return octal;
        }
    }

    public String decimalAHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        } else {
            int residuo;
            String hexadecimal = "";
            char[] Hexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            while (decimal > 0) {
                residuo = decimal % 16;
                char caracterHexadecimal = Hexadecimales[residuo];
                hexadecimal = caracterHexadecimal + hexadecimal;
                decimal = decimal / 16;
            }
            return hexadecimal;
        }
    }

    public long binarioADecimal(String bin) {
        long decimal = 0;
        long potencia = 0;
        long binario = Long.parseLong(bin);
        // Ciclo infinito hasta que binario sea 0
        while (binario != 0) {
            long temp = binario % 10;
            decimal += temp * Math.pow(2, potencia);
            binario = binario / 10;
            potencia++;
        }
        return decimal;
    }

    public long octalADecimal(String oct) {
        long decimal = 0;
        long potencia = 0;
        long octal = Long.parseLong(oct);
        // Ciclo infinito que se rompe cuando octal es 0
        while (octal != 0) {
            if (octal == 0) {
                break;
            } else {
                long temp = octal % 10;
                decimal += temp * Math.pow(8, potencia);
                octal = octal / 10;
                potencia++;
            }
        }
        return decimal;
    }

    public long hexadecimalADecimal(String hexadecimal) {
        String caracteresHexadecimales = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        long decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
            decimal = 16 * decimal + posicionEnCaracteres;
        }
        return decimal;
    }

    public String hexadecimalABinario(String hexadecimal) {
        String caracteresHexadecimales = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        String decimal = "";
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            int num = caracteresHexadecimales.indexOf(caracter);
            String bin = decimalABinario(num);
            if (i > 0) {
                bin = String.format("%4s", bin).replace(' ', '0');
            }
            decimal = decimal + bin;
        }
        return decimal;
    }

    public String octalABinario(String octal) {
        String decimal = "";
        for (int i = 0; i < octal.length(); i++) {
            char caracter = octal.charAt(i);
            int num = Character.getNumericValue(caracter);
            String bin = decimalABinario(num);
            if (i > 0) {
                bin = String.format("%3s", bin).replace(' ', '0');
            }
            decimal = decimal + bin;
        }
        return decimal;
    }

    public String binarioAOctal(String binario) {
        String octal = "";
        while (binario.length() % 3 != 0) {
            binario = "0" + binario;
        }
        int numero = 0;
        for (int i = 0; i < binario.length(); i += 3) {
            numero = 0;
            numero += Character.getNumericValue(binario.charAt(i)) * 4;
            numero += Character.getNumericValue(binario.charAt(i + 1)) * 2;
            numero += Character.getNumericValue(binario.charAt(i + 2));
            octal += Integer.toString(numero);
        }
        return octal;
    }

    public String binarioAHexadecimal(String binario) {
        String hexadecimal = "";
        while (binario.length() % 4 != 0) {
            binario = "0" + binario;
        }
        int numero = 0;
        for (int i = 0; i < binario.length(); i += 4) {
            numero = 0;
            numero += Character.getNumericValue(binario.charAt(i)) * 8;
            numero += Character.getNumericValue(binario.charAt(i + 1)) * 4;
            numero += Character.getNumericValue(binario.charAt(i + 2)) * 2;
            numero += Character.getNumericValue(binario.charAt(i + 3));
            String hex = decimalAHexadecimal(numero);
            hexadecimal += hex;
        }
        return hexadecimal;
    }

    public String octalAHexadecimal(String octal) {
        String hexadecimal = "";
        String bin = octalABinario(octal);
        hexadecimal = binarioAHexadecimal(bin);
        return hexadecimal;
    }

    public String hexadecimalAOctal(String hexadecimal) {
        String octal = "";
        String bin = hexadecimalABinario(hexadecimal);
        octal = binarioAOctal(bin);
        return octal;
    }

    public String sumarNumerosBinarios(String numeroUno, String numeroDos) {
        String resultado = "";
        char acarreo = '0';
        while (numeroUno.length() != numeroDos.length()) {
            if (numeroUno.length() > numeroDos.length()) {
                numeroDos = "0" + numeroDos;
            } else {
                numeroUno = "0" + numeroUno;
            }
        }
        for (int i = numeroUno.length() - 1; i >= 0; i--) {
            if (numeroUno.charAt(i) == '0' && numeroDos.charAt(i) == '0') {
                if (acarreo == '0') {
                    resultado = "0" + resultado;
                } else {
                    resultado = "1" + resultado;
                    acarreo = '0';
                }
            } else if ((numeroUno.charAt(i) == '0' && numeroDos.charAt(i) == '1')
                    || (numeroUno.charAt(i) == '1' && numeroDos.charAt(i) == '0')) {
                if (acarreo == '0') {
                    resultado = "1" + resultado;
                } else {
                    acarreo = '1';
                    resultado = "0" + resultado;
                }
            } else if ((numeroUno.charAt(i) == '1' && numeroDos.charAt(i) == '1')) {
                if (acarreo == '0') {
                    acarreo = '1';
                    resultado = "0" + resultado;
                } else {
                    resultado = "1" + resultado;
                }
            }
        }
        if (acarreo == '1') {
            resultado = acarreo + resultado;
        }
        return resultado;
    }

    public String multiplicacionNumerosBinarios(String numeroUno, String numeroDos) {
        long num1 = binarioADecimal(numeroUno);
        long num2 = binarioADecimal(numeroDos);
        long min = Long.min(num1, num2);
        String bin = "";
        if (num1 == Long.max(num1, num2)) {
            bin = numeroUno;
        } else {
            bin = numeroDos;
        }
        String suma = "";
        for (int i = 0; i < min; i++) {
            suma = sumarNumerosBinarios(suma, bin);
        }
        return suma;
    }

    public String restarNumerosBinarios(String numeroUno, String numeroDos) {
        String resultado = restarNumerosBinariosOperacion(numeroUno, numeroDos);
        if (resultado.charAt(0) == '-') {
            resultado = "Complemento a 2:" + resultado.substring(1);;
        }
        return resultado;
    }

    public String restarNumerosBinariosOperacion(String numeroUno, String numeroDos) {
        String resultado = "";
        char debo = '0';
        while (numeroUno.length() != numeroDos.length()) {
            if (numeroUno.length() > numeroDos.length()) {
                numeroDos = "0" + numeroDos;
            } else {
                numeroUno = "0" + numeroUno;
            }
        }

        for (int i = numeroUno.length() - 1; i >= 0; i--) {
            if ((numeroUno.charAt(i) == '0' && debo == '0')
                    || (numeroUno.charAt(i) == '1' && debo == '1')) {
                if (numeroDos.charAt(i) == '0') {
                    debo = '0';
                    resultado = "0" + resultado;
                } else {
                    debo = '1';
                    resultado = "1" + resultado;
                }
            } else if (numeroUno.charAt(i) == '1' && debo == '0') {
                debo = '0';
                if (numeroDos.charAt(i) == '0') {
                    resultado = "1" + resultado;
                } else {
                    resultado = "0" + resultado;
                }
            } else if (numeroUno.charAt(i) == '0' && debo == '1') {
                debo = '1';
                if (numeroDos.charAt(i) == '0') {
                    resultado = "1" + resultado;
                } else {
                    resultado = "0" + resultado;
                }
            }
        }
        if (debo == '1') {
            resultado = "-" + resultado;
        }
        return resultado;
    }

//    public String complementoADos(String numero) {
//        int indice = numero.length();
//        String nuevo = "";
//        for (int i = numero.length() - 1; i >= 0; i--) {
//            if (numero.charAt(i) == '1') {
//                nuevo = numero.charAt(i) + nuevo;
//                indice = i - 1;
//                break;
//            }
//            nuevo = numero.charAt(i) + nuevo;
//        }
//        for (int i = indice; i >= 0; i--) {
//            if (numero.charAt(i) == '1') {
//                nuevo = '0' + nuevo;
//            } else if (numero.charAt(i) == '0') {
//                nuevo = '1' + nuevo;
//            } else {
//                nuevo = numero.charAt(i) + nuevo;
//            }
//        }
//        return nuevo;
//    }
    public String divisionNumerosBinarios(String numeroUno, String numeroDos) {
        String resultado = "";
        int cont = 0;
        String tmp = numeroUno;
        boolean stop = true;
        while (stop) {
            tmp = restarNumerosBinariosOperacion(tmp, numeroDos);
            if (tmp.charAt(0) == '-') {
                stop = false;
            } else {
                cont++;
            }
        }
        resultado = decimalABinario(cont);

        return resultado;
    }

    public String sumarNumerosOctales(String numeroUno, String numeroDos) {
        String resultado = "";
        int acarreo = 0;
        while (numeroUno.length() != numeroDos.length()) {
            if (numeroUno.length() > numeroDos.length()) {
                numeroDos = "0" + numeroDos;
            } else {
                numeroUno = "0" + numeroUno;
            }
        }
        int tmp = 0;
        for (int i = numeroUno.length() - 1; i >= 0; i--) {
            if (acarreo > 0) {
                tmp = Character.getNumericValue(numeroUno.charAt(i)) + Character.getNumericValue(numeroDos.charAt(i)) + acarreo;
                acarreo--;
            } else {
                tmp = Character.getNumericValue(numeroUno.charAt(i)) + Character.getNumericValue(numeroDos.charAt(i));
            }
            if (tmp > 7) {
                tmp -= 8;
                acarreo++;
            }
            resultado = Integer.toString(tmp) + resultado;
        }
        if (acarreo == 1) {
            resultado = Integer.toString(acarreo) + resultado;
        }
        return resultado;
    }

    public String multiplicacionNumerosOctales(String numeroUno, String numeroDos) {
        long num1 = octalADecimal(numeroUno);
        long num2 = octalADecimal(numeroDos);
        long min = Long.min(num1, num2);
        String oct = "";
        if (num1 == Long.max(num1, num2)) {
            oct = numeroUno;
        } else {
            oct = numeroDos;
        }
        String suma = "";
        for (int i = 0; i < min; i++) {
            suma = sumarNumerosOctales(suma, oct);
        }
        return suma;
    }

    public String restaOctal(String numeroUno, String numeroDos) {
        String resultado = "";
        if (Integer.parseInt(numeroUno) < Integer.parseInt(numeroDos)) {
            resultado = "Complemento a 8: " + restaOctalComplementoAOcho(numeroUno, numeroDos);
        } else {
            resultado = restaOctalOperacion(numeroUno, numeroDos);
        }
        return resultado;
    }

    public String restaOctalOperacion(String numeroUno, String numeroDos) {
        String resultado = "";
        int acarreo = 0;
        int tmp = 0;
        while (numeroUno.length() != numeroDos.length()) {
            if (numeroUno.length() > numeroDos.length()) {
                numeroDos = "0" + numeroDos;
            } else {
                numeroUno = "0" + numeroUno;
            }
        }
        for (int i = numeroUno.length() - 1; i >= 0; i--) {
            int num1 = Character.getNumericValue(numeroUno.charAt(i));
            int num2 = Character.getNumericValue(numeroDos.charAt(i)) + acarreo;
            if (num1 < num2) {
                num1 += 8;
                acarreo = 1;
            } else {
                acarreo = 0;
            }
            tmp = num1 - num2;
            resultado = Integer.toString(tmp) + resultado;
        }
        return resultado;
    }

    public String restaOctalComplementoAOcho(String numeroUno, String numeroDos) {
        String resultado = "";
        String tmp = "";
        for (int i = 0; i < 7; i++) {
            tmp = tmp + '7';
        }
        resultado = restaOctalOperacion(numeroUno, numeroDos);
        return tmp + resultado;
    }

    public String divisionNumerosOctales(String numeroUno, String numeroDos) {
        String resultado = "";
        int cont = 0;
        String tmp = numeroUno;
        boolean stop = true;
        while (stop) {
            tmp = restaOctal(tmp, numeroDos);
            if (tmp.charAt(0) == 'C') {
                stop = false;
            } else {
                cont++;
            }
        }
        resultado = decimalAOctal(cont);

        return resultado;
    }

    public String sumarNumerosHexadecimal(String numeroUno, String numeroDos) {
        String caracteresHexadecimales = "0123456789ABCDEF";
        String resultado = "";
        int acarreo = 0;
        while (numeroUno.length() != numeroDos.length()) {
            if (numeroUno.length() > numeroDos.length()) {
                numeroDos = "0" + numeroDos;
            } else {
                numeroUno = "0" + numeroUno;
            }
        }
        int tmp = 0;
        for (int i = numeroUno.length() - 1; i >= 0; i--) {
            int num1 = caracteresHexadecimales.indexOf(numeroUno.charAt(i));
            int num2 = caracteresHexadecimales.indexOf(numeroDos.charAt(i));
            if (acarreo > 0) {
                tmp = num1 + num2 + acarreo;
                acarreo--;
            } else {
                tmp = num1 + num2;
            }
            if (tmp > 15) {
                tmp -= 16;
                acarreo++;
            }
            resultado = decimalAHexadecimal(tmp) + resultado;
        }
        if (acarreo == 1) {
            resultado = Integer.toString(acarreo) + resultado;
        }
        return resultado;
    }

    public String multiplicacionNumerosHexadecimales(String numeroUno, String numeroDos) {
        long num1 = hexadecimalADecimal(numeroUno);
        long num2 = hexadecimalADecimal(numeroDos);
        long min = Long.min(num1, num2);
        String hexa = "";
        if (num1 == Long.max(num1, num2)) {
            hexa = numeroUno;
        } else {
            hexa = numeroDos;
        }
        String suma = "";
        for (int i = 0; i < min; i++) {
            suma = sumarNumerosHexadecimal(suma, hexa);
        }
        return suma;
    }

    public String restaHexadecimal(String numeroUno, String numeroDos) {
        long num1 = hexadecimalADecimal(numeroUno);
        long num2 = hexadecimalADecimal(numeroDos);
        String resultado = "";
        if (num1 < num2) {
            resultado = "complemento a 16: " + restaHexadecimalComplementoADieciseis(numeroUno, numeroDos);
        } else {
            resultado = restaHexadecimalOperacion(numeroUno, numeroDos);
        }
        return resultado;
    }

    public String restaHexadecimalOperacion(String numeroUno, String numeroDos) {
        String caracteresHexadecimales = "0123456789ABCDEF";
        String resultado = "";
        int acarreo = 0;
        int tmp = 0;
        while (numeroUno.length() != numeroDos.length()) {
            if (numeroUno.length() > numeroDos.length()) {
                numeroDos = "0" + numeroDos;
            } else {
                numeroUno = "0" + numeroUno;
            }
        }
        for (int i = numeroUno.length() - 1; i >= 0; i--) {
            int num1 = caracteresHexadecimales.indexOf(numeroUno.charAt(i));
            int num2 = caracteresHexadecimales.indexOf(numeroDos.charAt(i)) + acarreo;
            if (num1 < num2) {
                num1 += 16;
                acarreo = 1;
            } else {
                acarreo = 0;
            }
            tmp = num1 - num2;
            resultado = decimalAHexadecimal(tmp) + resultado;
        }
        return resultado;
    }

    public String restaHexadecimalComplementoADieciseis(String numeroUno, String numeroDos) {
        String resultado = "";
        String tmp = "";
        for (int i = 0; i < 4; i++) {
            tmp = tmp + 'F';
        }
        resultado = restaHexadecimalOperacion(numeroUno, numeroDos);
        return tmp + resultado;
    }

    public String divisionNumerosHexadecimales(String numeroUno, String numeroDos) {
        String resultado = "";
        int cont = 0;
        String tmp = numeroUno;
        boolean stop = true;
        while (stop) {
            tmp = restaHexadecimal(tmp, numeroDos);
            if (tmp.charAt(0) == 'c') {
                stop = false;
            } else {
                cont++;
            }
        }
        resultado = decimalAHexadecimal(cont);

        return resultado;
    }
}

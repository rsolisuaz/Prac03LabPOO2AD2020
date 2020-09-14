package mx.edu.uaz.ingsoftware.poo2.prac03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PruebaCalculadora {
    private Pattern patronExpr;
    private CalculadoraSimple calc;
    public static void main(String[] args) {
        PruebaCalculadora pc = new PruebaCalculadora();
        try {
            pc.patronExpr = Pattern.compile("^([+\\-]?\\d+(\\.\\d+)?)\\s*([+\\-/*\\^])\\s*([+\\-]?\\d+(\\.\\d+)?)$");
            pc.calc = new CalculadoraSimple();
            pc.procesaEntrada();
        }
        catch (PatternSyntaxException pex) {
            // Si entra aqui la expresion regular esta mal escrita
            System.err.println(pex.getMessage());
        }
    }

    private void procesaEntrada() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("El programa espera expresiones de 2 operandos (+,-,*,/,^), linea vacia para terminar:");
            String linea=in.readLine().trim();;
            while (linea!=null && !linea.isEmpty()) {
                Matcher m = patronExpr.matcher(linea);
                if (m.find()) {
                    String op1Str = m.group(1);
                    String op=m.group(3);
                    String op2Str = m.group(4);
                    double result = 0;
                    try {
                        double num1 = Double.parseDouble(op1Str);
                        double num2 = Double.parseDouble(op2Str);
                        switch (op.charAt(0)) {
                            case '+' : result = calc.suma(num1,num2);
                                break;
                            case '-' : result = calc.resta(num1,num2);
                                break;
                            case '*' : result = calc.mult(num1,num2);
                                break;
                            case '/' : result = calc.divide(num1,num2);
                                break;
                            case '^' : result = calc.eleva(num1,(int)num2);
                                break;
                        }
                        System.out.println(result);
                    }
                    catch (NumberFormatException nex) {
                        // Si entra aqui no se dieron numeros
                        System.out.println("Invalida");
                    }
                    catch (ArithmeticException eaex) {
                        System.out.println(eaex.getMessage());
                    }
                }
                else {
                    System.out.println("Invalida");
                }
                linea=in.readLine().trim();
            }
            in.close();
            System.out.println("Gracias por usar esta calculadora.");
        }
        catch (IOException eio) {

        }
    }

}

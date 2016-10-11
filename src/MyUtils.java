/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Lluis Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";

        for (int x = cadena.length() - 1; x >= 0; x--) {
            resultat = resultat + cadena.charAt(x);
        }

        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat menors a 150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        Calendar c1 = new GregorianCalendar();
        int resultat = 0;
        int dia, mes, any;
        int dia2, mes2, any2;

        dia = (c1.get(Calendar.DATE));
        mes = (c1.get(Calendar.MONTH));
        any = (c1.get(Calendar.YEAR));

        dia2 = dia - day;
        mes2 = month - mes;
        any2 = any - year;

        if (dia2 <= 0) {
            dia2 = 0 - dia2;
            mes2 -= 1;
        }
        if (mes2 <= 0) {
            any2 -= 1;
            mes2 += 12;
        }

        if (any2 > 150) {
            resultat = -2;
        } else {
            resultat = -1;
        }

        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        int factorial = 1;

        if (numero == 0) {
            return 1;
        } else {
            for (int i = (int) numero; i > 0; i--) {
                factorial *= i;
            }

            double resultat = factorial;

            if (resultat < 0) {
                return -1;
            } else {
                return resultat;
            }

        }

    }
}

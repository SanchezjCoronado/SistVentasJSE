/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Josue Cuba
 */
public class Formatos {
    public static SimpleDateFormat sdtfecha=new SimpleDateFormat("dd/MM/yyyy");
    public static DecimalFormat dfreales= new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
    
    public static java.sql.Date Fechasql(String fecha) throws ParseException
    {
        java.util.Date f= Formatos.sdtfecha.parse(fecha);
        GregorianCalendar gc= new GregorianCalendar();
        gc.setTimeInMillis(f.getTime());
        java.sql.Date f2= new java.sql.Date(gc.getTimeInMillis());
        return f2;
    }
}

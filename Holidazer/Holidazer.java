package Holidazer;

import java.util.Hashtable;

public class Holidazer {


    public static void main(String[] args){
        Hashtable<String, String> feriados = new Hashtable<>(13);
        feriados.put("01-01-2024","Confraternização Mundial");
        feriados.put("12-02-2024" , "Carnaval");
        feriados.put("13-02-2024" , "Carnaval");
        feriados.put("29-03-2024" , "Sexta-feira Santa");
        feriados.put("21-04-2024" , "Tiradentes");
        feriados.put("01-05-2024" , "Dia do Trabalho");
        feriados.put("30-05-2024" , "Corpus Christi");
        feriados.put("07-09-2024" , "Independência do Brasil");
        feriados.put("12-10-2024" , "Nossa Senhora Aparecida");
        feriados.put("15-11-2024" , "Proclamação da República");
        feriados.put("20-11-2024" , "Dia Nacional de Zumbi e da Consciência Negra");
        feriados.put("20-11-2024" , "Dia Nacional de Zumbi e da Consciência Negra");
        feriados.put("25-12-2024" , "Natal");

        showHolidays(feriados);
        isHoliday(feriados, "25-12-2024");
        isHoliday(feriados, "21-01-2024");
    }

    public static void showHolidays(Hashtable<String, String> holidays){
        holidays.forEach((key,value)->{
            System.out.println(key + " " + value);
        });
    }

    public static void isHoliday(Hashtable<String, String> holidays, String data){
        if(holidays.containsKey(data)){
            System.out.println("Dia " +  data +  " é " + holidays.get(data));
            return;
        } 
        System.out.println("Dia " +  data +  " não é feriado");
    }
}

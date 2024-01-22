package com.feriados.api.feriados;

import java.util.Hashtable;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Holidays {
    private static Hashtable<String, String> feriados = new Hashtable<>(13);
    
   @PostConstruct
    public void init(){
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
    }

    public String showHolidays(){
        StringBuilder holidayList = new StringBuilder();
        
        System.out.println(feriados.size());
        feriados.forEach((key,value)->{
            holidayList.append(key + " " + value + "\n");
        });
        
        return holidayList.toString();
    }

    public String isHoliday(String data){
        if(feriados.containsKey(data)){
            return "Dia " +  data +  " é " + feriados.get(data);
            
        } 
        return "Dia " +  data +  " não é feriado";
    }
    
}

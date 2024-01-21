package Holidazer;

public class Feriado {
    
    private String data;
    private String name;

    Feriado(String data,String name){
        setData(data);
        setName(name);
    }

    public String getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setName(String name) {
        this.name = name;
    }
}

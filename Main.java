package sample;

import java.util.Locale;

class Persona
{
    //variables del objeto = atributos -> estado de un objeto
    //Tipos primitivos numericos se inician a cero
    //bolean a false
    //Purista de Objetos -> El estado siempre es privado
    private int edad;
    private String name;

    public void setName(String name)
    {
        this.name = name; //this -> este
    }

    public String getName(){
        return this.name;
    }

    public void cumpliranios()
    {
        edad ++;
    }

    public int getEdad()
    {
        return edad;
    }
}
//Debuggear
//Breakpoints -> Puntos de parada
//Modificadores de acceso: private, public, protected y <default>
public class Main {

    public static void main(String[] args) {
        Persona panchito = new Persona();
        Persona lupita = new Persona();

        panchito.setName("Panchito");
        lupita.setName("Lupita");

        panchito.cumpliranios(); //enviar mensaje cumpliranios a objeto panchito
        panchito.cumpliranios();
        panchito.cumpliranios();
        panchito.cumpliranios();

        lupita.cumpliranios();
        lupita.cumpliranios();

        System.out.println(panchito.getName() + " tiene ".toUpperCase() + panchito.getEdad()+ " años");

        System.out.println(lupita.getName() + " tiene " + lupita.getEdad()+ " años");

    }
}
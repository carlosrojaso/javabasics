package paquete;

/**
 * Created by carlosrojas on 4/21/15.
 */
public class Carro {
    private String Marca;
    private int Puertas;
    private int Velocidad;
    private String Color;

    Carro(){

        this.Marca = "No definida";
        this.Puertas = 0;
        this.Velocidad = 0;
        this.Color = "No definida";
    }

    Carro(String Marca, int Puertas, int Velocidad, String Color){
        this.Marca = Marca;
        this.Puertas = Puertas;
        this.Velocidad = Velocidad;
        this.Color = Color;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public String getMarca(){
        return this.Marca;
    }

    public void setPuertas(int Puertas){
        this.Marca = Marca;
    }

    public int getPuertas(){
        return this.Puertas;
    }


    public void ImprimirCarro(){
        System.out.println(
                "Mi carro::: \n" +
                        "Marca: " + this.Marca + "\n" +
                        "Puertas: " + this.Puertas + "\n" +
                        "Velocidad: " + this.Velocidad + "\n" +
                        "Color: " + this.Color
        );
    }

}

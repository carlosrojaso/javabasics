package paquete;

/**
 * Created by carlosrojas on 4/21/15.
 */
public class ValoresPorDefecto {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    void imprimirValoresIniciales() {
        System.out.print("Tipo Variable\tValor Inicial\n");
        System.out.print("boolean\t\t" + t + "\n");
        System.out.print("char\t\t[" + c + "]" + "\n");
        System.out.print("byte\t\t" + b + "\n");
        System.out.print("short\t\t" + s + "\n");
        System.out.print("int\t\t" + i + "\n");
        System.out.print("long\t\t" + l + "\n");
        System.out.print("float\t\t" + f + "\n");
        System.out.print("double\t\t" + d + "\n");
    }

}
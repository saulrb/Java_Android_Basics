package mx.itesm.m1_srb_eje_trapecio;

/**
 * Created by saul on 27/1/2017.
 */

public abstract class Trapecio  implements CalculosFiguraGeometrica{

    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calculaArea() {
        return ( ( (this.baseMayor + this.baseMenor) * this.altura) / 2 );
    }

    public String despliegaTrapecio(){
        return "Trapecio Base Mayor:".concat(String.valueOf(this.baseMayor))
                .concat(" Base Menor:").concat(String.valueOf(this.baseMenor))
                .concat(" Altura:").concat(String.valueOf(this.altura))
                .concat(" Perimetro:").concat(String.valueOf(this.calculaPerimetro()))
                .concat(" Area:").concat(String.valueOf(this.calculaArea()));
    }

}

package ar.edu.unlam.ejercicio07y08;

public class Rectangulo implements Figura, Comparable<Figura>{

    private Double lado1;
    private Double lado2;
    private Double area;
    private Double perimetro;

    public Rectangulo(Double lado1, Double lado2){

        this.lado1 = lado1;
        this.lado2 = lado2;
        area = calcularArea();
        perimetro = calcularPerimetro();
    }

    public Double calcularArea(){

        return lado2 * lado1;
    }

    public Double calcularPerimetro(){
    	
        return this.lado2 * 2 + this.lado1 * 2;
    }

    public Double diferenciaArea(Rectangulo rectangulo){

        return this.calcularArea() - rectangulo.calcularArea();
    }
    
    public Double getPerimetro() {
    	return perimetro;
    }
    
    public Double getArea() {
    	return area;
    }

	@Override
	public int compareTo(Figura f) {
		if(f.calcularPerimetro()>perimetro) {
			return -1;
		} else if (f.calcularPerimetro() == perimetro) {
			return 0;
		} else {
			return 1;
		}
	}

}
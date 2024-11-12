class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2); // A = π * r²
    }

    @Override
    public double comprimento() {
        return 2 * Math.PI * raio; // Comprimento = 2 * π * r
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

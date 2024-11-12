class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2); // A = L²
    }

    @Override
    public double comprimento() {
        return 4 * lado; // Comprimento = 4 * L
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
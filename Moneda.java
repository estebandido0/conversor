public class Moneda {

    private double valor; // Monto original
    private String divisa; // Codigo de divisa original

    // Crea una moneda
    public Moneda(double valor, String divisa) {
        // Asigna el valor y la divisa
        this.valor = valor;
        this.divisa = divisa;
    }

    // Convierte a la divisa seleccionada
    public double convertir(String divisa) {

        return this.valor
                / Divisas.valueOf(this.divisa).factor // Conviete a dolares
                * Divisas.valueOf(divisa).factor; // Conviete a divisa seleccionada

    }

}

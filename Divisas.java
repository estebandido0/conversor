public enum Divisas {
    // El numero indica equivalente a un dolar (USD$1)
    USD(1.0),
    EUR(0.9475),
    GBP(0.836365),
    JPY(136.135),
    KRW(1314.96),
    CLP(826.2);

    final double factor;

    Divisas(double factor) {
        this.factor = factor;
    }

}
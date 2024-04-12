class CondicionMultiplo implements ICondicion {
    private int divisor;

    public CondicionMultiplo(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public boolean cumple(int numero) {
        return numero % divisor == 0;
    }
}
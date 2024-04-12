class AndCondition implements ICondicion {
    private ICondicion condicion1;
    private ICondicion condicion2;

    public AndCondition(ICondicion condicion1, ICondicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(int numero) {
        return condicion1.cumple(numero) && condicion2.cumple(numero);
    }
}

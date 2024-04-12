class NotCondition implements ICondicion {
    private ICondicion condicion;

    public NotCondition(ICondicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(int numero) {
        return !condicion.cumple(numero);
    }
}

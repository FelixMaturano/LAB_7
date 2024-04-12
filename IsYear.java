class IsYear implements ICondicion {
    @Override
    public boolean cumple(int numero) {
        return numero >= 1000 && numero <= 9999;
    }
}
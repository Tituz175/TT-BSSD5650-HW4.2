public abstract class ToppingDecorator implements IPizza {
    IPizza mTempPizza;

    public ToppingDecorator(IPizza mTempPizza) {
        this.mTempPizza = mTempPizza;
    }

    @Override
    public String getDescription() {
        return mTempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return mTempPizza.getCost();
    }
}

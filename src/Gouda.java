public class Gouda extends ToppingDecorator {
    public Gouda(IPizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Gouda";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

public class Onions extends ToppingDecorator {
    public Onions(IPizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Onions";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

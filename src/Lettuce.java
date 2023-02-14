public class Lettuce extends ToppingDecorator {
    public Lettuce(IPizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Lettuce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

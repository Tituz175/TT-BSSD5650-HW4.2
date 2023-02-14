public class AlfredoSauce extends ToppingDecorator {
    public AlfredoSauce(IPizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Alfredo Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

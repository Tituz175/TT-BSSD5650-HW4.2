public class Crustless implements IPizza {
    @Override
    public String getDescription() {
        return "Crustless";
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}

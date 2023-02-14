public class ThickCrust implements IPizza {
    @Override
    public String getDescription() {
        return "Thick Crust";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}

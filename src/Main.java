public class Main {
    public static void main(String[] args) {
        ToppingsFactory.ToppingsEnum[] toppings1 = new ToppingsFactory.ToppingsEnum[] {
                ToppingsFactory.ToppingsEnum.MUSHROOM,
                ToppingsFactory.ToppingsEnum.MUSHROOM,
                ToppingsFactory.ToppingsEnum.TOMATOSAUCE,
                ToppingsFactory.ToppingsEnum.GOUDA,
                ToppingsFactory.ToppingsEnum.PEPPERONI
        };

        ToppingsFactory.ToppingsEnum[] toppings2 = new ToppingsFactory.ToppingsEnum[] {
                ToppingsFactory.ToppingsEnum.ONIONS,
                ToppingsFactory.ToppingsEnum.MUSHROOM,
                ToppingsFactory.ToppingsEnum.PESTOSAUCE,
                ToppingsFactory.ToppingsEnum.ALFREDOSAUCE,
        };

        ToppingsFactory.ToppingsEnum[] toppings3 = new ToppingsFactory.ToppingsEnum[] {
                ToppingsFactory.ToppingsEnum.GOUDA,
                ToppingsFactory.ToppingsEnum.PESTOSAUCE,
                ToppingsFactory.ToppingsEnum.LETTUCE,
        };

        IPizza pizza1 = PizzaFactory.createPizza(PizzaFactory.PizzaCrustEnum.THICK);
        pizza1 = ToppingsFactory.decoratePizza(toppings1, pizza1);

        IPizza pizza2 = PizzaFactory.createPizza(PizzaFactory.PizzaCrustEnum.THIN);
        pizza2 = ToppingsFactory.decoratePizza(toppings2, pizza2);

        IPizza pizza3 = PizzaFactory.createPizza(PizzaFactory.PizzaCrustEnum.NONE);
        pizza3 = ToppingsFactory.decoratePizza(toppings3, pizza3);


        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());

        System.out.println(pizza3.getDescription());
        System.out.println(pizza3.getCost());
    }
}
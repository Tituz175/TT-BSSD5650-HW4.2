public class ToppingsFactory {
    enum ToppingsEnum {
        MUSHROOM {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new Mushrooms(target);
            }
        },
        PEPPERONI {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new Pepperoni(target);
            }
        },
        GOUDA {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new Gouda(target);
            }
        },
        TOMATOSAUCE {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new TomatoSauce(target);
            }
        },
        ALFREDOSAUCE {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new AlfredoSauce(target);
            }
        },
        PESTOSAUCE {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new PestoSauce(target);
            }
        },
        ONIONS {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new Onions(target);
            }
        },
        LETTUCE {
            @Override
            public ToppingDecorator getInstance(IPizza target) {
                return new Lettuce(target);
            }
        };

        public abstract ToppingDecorator getInstance(IPizza target);
    }

    static IPizza decoratePizza(ToppingsFactory.ToppingsEnum[] toppings, IPizza target) {
        for (ToppingsFactory.ToppingsEnum topping:toppings){
            target = topping.getInstance(target);
        }
        return target;
    }

}

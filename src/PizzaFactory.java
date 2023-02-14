public class PizzaFactory {

    enum PizzaCrustEnum {
        THIN {
            @Override
            public IPizza getInstance() {
                return new ThinCrust();
            }
        },
        THICK {
            @Override
            public IPizza getInstance() {
                return new ThickCrust();
            }
        },
        NONE {
            @Override
            public IPizza getInstance() {
                return new Crustless();
            }
        };
        public abstract IPizza getInstance();
    }

    static IPizza createPizza(PizzaCrustEnum type){
        return type.getInstance();
    }
}

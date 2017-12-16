package product.order;

import java.util.List;

public class ProductStep {

    private final List<Runnable> steps;

    ProductStep(final List<Runnable> steps) {
        this.steps = steps;
    }

    public DestinationCityStep addProduct(final String product) {

        steps.add(() -> System.out.println("Adding product: " + product));

        return new DestinationCityStep(steps);
    }
}

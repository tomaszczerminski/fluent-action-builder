package product.order;

import java.util.List;

public class DestinationPostCodeStep {

    private final List<Runnable> steps;

    DestinationPostCodeStep(final List<Runnable> steps) {
        this.steps = steps;
    }

    public OrderProductTransaction withDestinationPostCode(final String destinationPostCode) {

        steps.add(() -> System.out.println("Adding destination post code: " + destinationPostCode));

        return new OrderProductTransaction(steps);
    }
}

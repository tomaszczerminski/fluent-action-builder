package product.order;

import java.util.List;

public class DestinationCityStep {

    private final List<Runnable> steps;

    DestinationCityStep(final List<Runnable> steps) {
        this.steps = steps;
    }

    public DestinationPostCodeStep withDestinationCity(final String destinationCity) {

        steps.add(() -> System.out.println("Adding destination city: " + destinationCity));

        return new DestinationPostCodeStep(steps);
    }
}

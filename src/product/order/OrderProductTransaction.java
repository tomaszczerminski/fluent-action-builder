package product.order;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public final class OrderProductTransaction {

    private final List<Runnable> steps;

    OrderProductTransaction(final List<Runnable> steps) {
        this.steps = steps;
    }

    public static ProductStep builder() {
        return new ProductStep(new LinkedList<>());
    }

    public OrderProductTransaction build() {
        return new OrderProductTransaction(steps);
    }

    public List<Runnable> getSteps() {
        return new LinkedList<>(steps);
    }

    public static final class Result {

        private final Exception thrownException;

        Result(final Exception thrownException) {
            this.thrownException = thrownException;
        }

        public Optional<Exception> getThrownException() {
            return Optional.ofNullable(thrownException);
        }
    }
}

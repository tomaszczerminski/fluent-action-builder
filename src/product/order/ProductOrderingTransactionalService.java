package product.order;

import java.util.function.Supplier;

public class ProductOrderingTransactionalService {

    private OrderProductTransaction orderProductTransaction;

    public ProductOrderingTransactionalService begin(final Supplier<OrderProductTransaction> transactionSupplier) {

        System.out.println("Initializing transaction...");

        this.orderProductTransaction = transactionSupplier.get();

        return this;
    }

    public OrderProductTransaction.Result commit() {

        System.out.println("Committing...");

        for(final Runnable step: orderProductTransaction.getSteps()) {
            try {
                step.run();
            } catch (final Exception e) {
                System.out.println("Commit failure...");
                return new OrderProductTransaction.Result(e);
            }
        }

        System.out.println("Commit success...");
        return new OrderProductTransaction.Result(null);
    }
}

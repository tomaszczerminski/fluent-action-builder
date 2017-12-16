import product.order.ProductOrderingTransactionalService;
import product.order.OrderProductTransaction;

public class Main {
    public static void main(final String[] args) {

        final OrderProductTransaction.Result result = new ProductOrderingTransactionalService()
                .begin(() ->
                        OrderProductTransaction
                                .builder()
                                .addProduct("Product no. 1")
                                .withDestinationCity("City no. 1")
                                .withDestinationPostCode("Post code no. 1")
                                .build()
                ).commit();

        result.getThrownException().ifPresent(Exception::printStackTrace);
    }
}

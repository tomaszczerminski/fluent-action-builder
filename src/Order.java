class Order {

    private String product;
    private String destinationCity;
    private String destinationPostCode;

    String getProduct() {
        return product;
    }

    void setProduct(final String product) {
        this.product = product;
    }

    String getDestinationCity() {
        return destinationCity;
    }

    void setDestinationCity(final String destinationCity) {
        this.destinationCity = destinationCity;
    }

    String getDestinationPostCode() {
        return destinationPostCode;
    }

    void setDestinationPostCode(final String destinationPostCode) {
        this.destinationPostCode = destinationPostCode;
    }
}

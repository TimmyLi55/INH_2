public class ProductRepository {
    private Product[] products = new Product[0];

    public void saveProducts(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] getProducts() {
        return products;
    }

    public void removeById(int id) {
        if (findById(id) == null){
            throw new NotFoundException("ID " + id + " не найден");
        }
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.id != id) {
                tmp[index] = product;
                index++;
            }

        }
        products = tmp;
    }

    public Product findById(int id) {
        for (Product product : products){
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}

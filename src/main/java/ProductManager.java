public class ProductManager {
    private ProductRepository repos;

    public ProductManager(ProductRepository repos) {
        this.repos = repos;
    }

    public void addProduct(Product product) {
        repos.saveProducts(product);
    }

    public Product[] searchBy(String text) { // Доработал метод для случаев когда поиск находит несколько совпадений по именам
        Product[] result = new Product[getCountMatchedProductForArgs(text)];
        int index = 0;
        for (Product product : repos.getProducts()) {
            if (matches(product, text)) {
                result[index] = product;
                index++;
            }
        }
        return result;
    }

    public int getCountMatchedProductForArgs(String text) { // Получение количества найденных продуктов по имени для создания массива.
        int index = 0;
        for (Product product : repos.getProducts()){
            if (matches(product, text)) {
                index++;
            }
        }
        return index;

    }


    private boolean matches(Product product, String text) {
        if (product.getName().contains(text)) {
            return true;
        } else {
            return false;
        }
    }


}

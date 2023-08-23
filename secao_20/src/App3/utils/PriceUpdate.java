package App3.utils;

import java.util.function.Consumer;

import App3.entities.Product;

public class PriceUpdate implements Consumer<Product> {

    // aumenta o preço em 10%
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

}

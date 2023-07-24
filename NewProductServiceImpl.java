package exam.productproblem;

import java.util.List;
import java.util.stream.Collectors;

public class NewProductServiceImpl implements INewProductService {

    IOldProductService oldService;

    public NewProductServiceImpl(IOldProductService oldService){
        this.oldService=oldService;
    }

    @Override
    public ProductDetails getProductById(long id) {
        Product product = oldService.findProductById(id);
        if (product != null)
            return new ProductDetails(product.getName(), product.getPrice());
        return null;
    }

    @Override
    public List<ProductDetails> fetchAllProducts() {
        return oldService.getAll()
                .stream()
                .map(product -> new ProductDetails(product.getName(), product.getPrice()))
                .collect(Collectors.toList());
    }
}

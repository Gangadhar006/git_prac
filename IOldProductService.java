package exam.productproblem;


import java.util.List;

public interface IOldProductService {

    List<Product> getAll();

    Product findProductById(long id);

}

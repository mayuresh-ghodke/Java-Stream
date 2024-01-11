import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String title;
    double price;

    public Product(int id, String title, double price)
    {
        this.id= id;
        this.title = title;
        this.price = price;
    }
}
public class ProductPriceFilter
{
    public static void main(String[] args)
    {
        List<Product> productlist = new ArrayList<Product>();

        productlist.add(new Product(10, "Lenovo", 30000));
        productlist.add(new Product(11, "Dell", 40000));
        productlist.add(new Product(12, "HP", 38000));
        productlist.add(new Product(13, "Acer", 35000));

        List<Product> list =  productlist.stream().filter(p->p.price >32000).collect(Collectors.toList());

        System.out.println(list);

        productlist.stream().filter(p->p.price>32000).forEach(pl->System.out.println(pl.price));
    }   



}

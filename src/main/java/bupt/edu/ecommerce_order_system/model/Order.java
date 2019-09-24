package bupt.edu.ecommerce_order_system.model;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Order extends Stuff {
    protected String accountId;
    protected Set<String> productsId;
    protected Map<String, Double> productsNumber;

}
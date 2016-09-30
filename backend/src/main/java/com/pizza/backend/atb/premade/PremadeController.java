package com.pizza.backend.atb.premade;

import com.pizza.backend.atb.toppings.model.*;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class PremadeController {

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/premade", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    List<OrderDetail> get() {

        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setPremadeName("Hawaiian");
        orderDetail1.setSize(Size.MEDIUM);
        orderDetail1.setBaseSauce(Sauce.TOMATO);
        orderDetail1.setCheese(Cheese.MOZZARELLA);
        orderDetail1.setCrustStyle(Crust.ORIGINAL);
        orderDetail1.setMeats(Arrays.asList(Meat.HAM));
        orderDetail1.setOrderDate(new Date().toString());
        orderDetail1.setOtherToppings(Arrays.asList(OtherTopping.PINEAPPLE, OtherTopping.BASIL, OtherTopping.FRESHTOMATO));

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setPremadeName("ATB Special");
        orderDetail2.setSize(Size.MEDIUM);
        orderDetail2.setBaseSauce(Sauce.TOMATO);
        orderDetail2.setCheese(Cheese.CHEDDAR);
        orderDetail2.setCrustStyle(Crust.GLUTENFREE);
        orderDetail2.setMeats(Arrays.asList(Meat.PEPPERONI, Meat.SAUSAGE));
        orderDetail2.setOrderDate(new Date().toString());
        orderDetail2.setOtherToppings(Arrays.asList(OtherTopping.BASIL, OtherTopping.BLACKOLIVES, OtherTopping.FRIEDEGG));

        OrderDetail orderDetail3 = new OrderDetail();
        orderDetail3.setPremadeName("Meat Lovers");
        orderDetail3.setSize(Size.MEDIUM);
        orderDetail3.setBaseSauce(Sauce.ALFREDO);
        orderDetail3.setCheese(Cheese.CHEDDAR);
        orderDetail3.setCrustStyle(Crust.WHOLEWHEAT);
        orderDetail3.setMeats(Arrays.asList(Meat.PEPPERONI, Meat.ITALIANSAUSAGE, Meat.BACON));
        orderDetail3.setOrderDate(new Date().toString());
        orderDetail3.setOtherToppings(Arrays.asList(OtherTopping.CARAMELIZEDONIONS, OtherTopping.MUSHROOMS));

        OrderDetail orderDetail4 = new OrderDetail();
        orderDetail4.setPremadeName("Classic Pepperoni");
        orderDetail4.setSize(Size.MEDIUM);
        orderDetail4.setBaseSauce(Sauce.TOMATO);
        orderDetail4.setCheese(Cheese.MOZZARELLA);
        orderDetail4.setCrustStyle(Crust.WHOLEWHEAT);
        orderDetail4.setMeats(Arrays.asList(Meat.PEPPERONI));
        orderDetail4.setOrderDate(new Date().toString());
        orderDetail4.setOtherToppings(Arrays.asList(OtherTopping.BLACKOLIVES, OtherTopping.MUSHROOMS));

        return Arrays.asList(orderDetail1, orderDetail2, orderDetail3, orderDetail4);
    }
}

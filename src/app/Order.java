package app;

import app.discount.discountCondition.DiscountCondition;
import app.discount.Discount;


public class Order {
    private Cart cart;
    private Discount discount;

    public Order(Cart cart, Discount discount) {
        this.cart = cart;
        this.discount = discount;
    }

    public void makeOrder(){
        int totalPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(totalPrice);
        System.out.println("[ð£] ì£¼ë¬¸ì´ ìë£ëììµëë¤. ");
        System.out.println("[ð£] ì£¼ë¬¸ ë´ì­ì ë¤ìê³¼ ê°ìµëë¤. ");
        System.out.println("-".repeat(60));

        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("ê¸ì¡ í©ê³      : %dì\n", totalPrice);
        System.out.printf("í ì¸ ì ì© ê¸ì¡ : %dì\n", finalPrice);
    }
}

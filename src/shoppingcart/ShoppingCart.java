package shoppingcart;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<String> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void listItems() {
        if (cart.isEmpty()) {
            System.out.println("Welcome to your shopping cart ");
        } else {
            System.out.println("Items in cart: ");
            for (int i = 0; i< cart.size(); i++) {
                System.out.println((i+1) + "." + cart.get(i));
            }
        }
    }

    public void addItems(String items) {
        String[] newItems = items.split(",");
        for (String item : newItems) {
            if (!cart.contains(item)) {
                cart.add(item);
                System.out.println(item + " added to cart");
            } else {
                System.out.println("You have " + item + " in your cart.");
            }
        }
    }

    public void deleteItem(int index) {
        if (index >= 1 && index <= cart.size()) {
            String removeItem = cart.remove(index - 1);
            System.out.println(removeItem + " removed from cart.");
        } else {
            System.out.println("Incorrect item index.");
        }
    }
}
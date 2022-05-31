package com.sailesh.visitor;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
          new Book("Half blood prince", 400),
          new Book("Chamber of secrets",700),

          new Biscuit("Oreo",20),
          new Biscuit("Parle-G",10)
        };

        System.out.println("Total cost : "+calculateTotal(items));
    }

    private static int calculateTotal(ItemElement[] items) {
        int total=0;
        CartVisitor cartVisitor = new CartVisitorImpl();
        for (ItemElement itemElement: items){
            total+=itemElement.accept(cartVisitor);
        }

        return total;
    }
}

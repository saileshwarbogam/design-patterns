package com.sailesh.visitor;

public class CartVisitorImpl implements CartVisitor{
    @Override
    public int visit(Book book) {
        return book.getPrice();
    }

    @Override
    public int visit(Biscuit biscuit) {
        return biscuit.getPrice();
    }
}

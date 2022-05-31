package com.sailesh.visitor;

public interface CartVisitor {

    int visit(Book book);

    int visit(Biscuit biscuit);
}

package com.sailesh.visitor;

public interface ItemElement {
    public int accept(CartVisitor visitor);
}

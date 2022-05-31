package com.sailesh.bridge;

public abstract  class AutoMobile {

    protected WorkShop produce;
    protected WorkShop assemble;

    public AutoMobile(WorkShop produce, WorkShop assemble) {
        this.produce = produce;
        this.assemble = assemble;
    }

    public abstract void manufacture();
}

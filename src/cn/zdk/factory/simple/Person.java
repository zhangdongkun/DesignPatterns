package cn.zdk.factory.simple;

public abstract class Person {
    String name;
    String identifynumer;

    abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifynumer() {
        return identifynumer;
    }

    public void setIdentifynumer(String identifynumer) {
        this.identifynumer = identifynumer;
    }
}

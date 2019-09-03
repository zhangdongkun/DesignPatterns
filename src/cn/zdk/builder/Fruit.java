package cn.zdk.builder;

import java.math.BigDecimal;

/**
 * 建造者模式
 */
public class Fruit {
    private  String name;
    private BigDecimal price;
    private String color;
    private String roduction;

    public  Fruit (Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.color = builder.color;
        this.roduction = builder.roduction;

    }


    public  static  class Builder {
        private  String name;
        private BigDecimal price;
        private String color;
        private String roduction;
        private String xx;


        public  Builder name(String name) {
            this.name = name;

            return this;

        }

        public  Builder price(BigDecimal p) {
            this.price = p;
            return this;

        }

        public  Builder color(String color) {
            this.color = color;
            return this;

        }

        public  Builder roduction(String roduction) {
            this.roduction = roduction;
            return this;

        }

        public  Fruit   build() {
            return new Fruit(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRoduction() {
        return roduction;
    }

    public void setRoduction(String roduction) {
        this.roduction = roduction;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", roduction='" + roduction + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fruit f =  new Builder().color("red").name("apple").price(BigDecimal.valueOf(100)).build();
        System.out.println(f);
    }
}

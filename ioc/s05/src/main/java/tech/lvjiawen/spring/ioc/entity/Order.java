package tech.lvjiawen.spring.ioc.entity;

public class Order {
    private Float price;
    private Integer quantity;
    private Float total;

    public Order() {
        System.out.println("创建 Order 对象：" + this);
    }

    public void pay() {
        System.out.println("订单金额为：" + total);
    }

    public void init() {
        System.out.println("执行 init 方法");
        total = price * quantity;
    }

    public void destroy() {
        System.out.println("释放与订单对象相关的资源");
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        System.out.println("执行 setPrice 方法");
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        System.out.println("执行 setQuantity 方法");
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
}

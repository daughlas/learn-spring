package tech.lvjiawen.spring.ioc.entity;

public class Apple {
    private String title;
    private String color;
    private String origin;

    public Apple() {
        System.out.println("无参数，Apple 对象已经创建，" + this);
    }

    public Apple(String title, String color, String origin) {
        this.title = title;
        this.color = color;
        this.origin = origin;
        System.out.println("通过带参数构造方法构建，" + this);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("title 属性是通过 setTitle 设置的，值为：" + title);
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}

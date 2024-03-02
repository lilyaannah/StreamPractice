public class Phone {
    public String mark;
    public String display;
    public String color;

    public Phone(String mark, String display, String color) {
        this.mark = mark;
        this.display = display;
        this.color = color;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}

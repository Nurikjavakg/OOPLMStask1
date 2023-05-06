public class Car {

    private String carName;
    private int yearGraduate;
    private String color;
    private int price;

    public Car(String name, int yearGraduate, String color, int price){
        this.carName=name;
        this.yearGraduate=yearGraduate;
        this.color=color;
        this.price=price;
    }
    public String getCarName(){
        return carName;
    }
    public void setCarName(String name){
        this.carName=carName;
    }
    public int getYearGraduate(){
        return yearGraduate;
    }
    public void setYearGraduate(int yearGraduate){
        this.yearGraduate=yearGraduate;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", yearGraduate=" + yearGraduate +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

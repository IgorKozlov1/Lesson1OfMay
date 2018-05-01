import java.util.*;

public class Car implements Comparable {
    private int year;
    private Colour colour;

    public Colour getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public Car(int year, Colour colour) {
        this.year = year;
        this.colour = colour;
    }

    @Override
    public int compareTo(Object car) {
        if (car instanceof Car) {
            Car realCar = (Car) car;
            if (this.getYear() > realCar.getYear()) {
                return 1;
            }
            if (this.getYear() < realCar.getYear()) {
                return -1;
            }
            if (this.getYear() == realCar.getYear()) {
                return 0;
            }

        }
        return 1;
    }
@Override
public int hashCode(){
        int result=year;
        result=31*result+(colour!=null?colour.hashCode():0);
        return result;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (year != car.year) return false;
        return colour == car.colour;
    }

    /**public static void main(String[] args) {
        Car blackCar = new Car(1990, Colour.BLACK);
        Car anotherblackCar = new Car(1990, Colour.BLACK);
        System.out.println(blackCar.equals(anotherblackCar));
        System.out.println(blackCar.getColour());
    } **/



    //код для сравнения compareTo
    /**
    public static void main(String[] args) {

        Car blackCar = new Car(1990, Colour.BLACK);
        Car anotherBlackCar = new Car(1990, Colour.BLACK);
        System.out.println(blackCar.compareTo(anotherBlackCar));
        Car greenCar=new Car(2000,Colour.GREEN);
        System.out.println(blackCar.compareTo(greenCar));
        List<Car> cars=new ArrayList<>();
        cars.add(greenCar);
        cars.add(blackCar);
        cars.add(anotherBlackCar);
        Collections.sort(cars);
        System.out.println(cars.get(0).getYear());

    } **/

    //hashCode & equals нужно закомментить hashCode и equals
    public static void main(String[] args) {
        Car blackCar=new Car(1990,Colour.BLACK);
        Car anotherBlackCar= new Car(1990,Colour.BLACK);
        Car greenCar=new Car(1990,Colour.GREEN);
        Set<Car> cars=new HashSet<>();
        cars.add(blackCar);
        System.out.println(blackCar.hashCode());
        cars.add(anotherBlackCar);
        System.out.println(anotherBlackCar.hashCode());
        cars.add(greenCar);
        System.out.println(greenCar.hashCode());
        System.out.println(cars.size());


    }
}

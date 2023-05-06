import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        University university1 = new University("I. Arabaev", "str. Kievskiy 234", "arabaev@gmail.com", 23423);
        University university2 = new University("KEU", "str. Toktogul 23", "arabaev@gmail.com", 23423);
        University university3 = new University("Manas University", "str. Sovotsky 324", "arabaev@gmail.com", 23423);
        University [] universities={university1,university2,university3};

        for (University university : universities) {
            System.out.println(university);
        }
        System.out.println();




        School school1 = new School("Osmonkulov N:2", "str. Bayalinov 453", "osmonkulov@gmail.com", 23435);
        School school2 = new School("A.Osmonbekov N:23", "str. Tynystonov 346", "a.osmonbekov@gmail.com", 45664);
        School school3 = new School("Frunze N:2", "str. Manas 67", "frunze@gmail.com", 64535);
        School [] schools = {school1,school2,school3};
        for (School school : schools) {
            System.out.println(school);

        } System.out.println();

        Car car1 = new Car("Porshe",1987, "white", 900000);
        Car car2 = new Car("Jip",2011, "braun", 500000);
        Car car3 = new Car("BMV",1923, "white", 800000);
        Car [] cars = {car1,car2,car3};
        for (Car car: cars) {
            System.out.println(car);

            
        }System.out.println();

        Person person1 = new Person("Alymbai uulu Nurmukhamed", 25, "nurik@gmail.com",0223346);
        Person person2 = new Person("Alymbai uulu Nurmukhamed", 25, "nurik@gmail.com",0223346);
        Person person3 = new Person("Alymbai uulu Nurmukhamed", 25, "nurik@gmail.com",0223346);

        Person [] people = {person1, person2, person3};
        for (Person person: people) {
            System.out.println(person);
            
        }

    }


}
package spring.example.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.example.ioc.sources.Car;
import spring.example.ioc.sources.GearBox;

public class Main {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
        Car car = context.getBean("car", Car.class);
        Car car1 = context.getBean("car", Car.class);
        car1.setName("VW");
        car1.getGearBox().setMT("AT");


        System.out.println(car);
        System.out.println(car1);
        context.close();
    }
}

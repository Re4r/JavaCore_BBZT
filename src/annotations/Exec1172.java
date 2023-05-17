package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Exec1172 {
    public static void main(String[] args) {

        Class<Xiaomi> xiaomiClass = Xiaomi.class;
        Class<IPhone> iPhoneClass = IPhone.class;

        SmartPhone smartPhone = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone1 = iPhoneClass.getAnnotation(SmartPhone.class);

        System.out.println("------------");
        System.out.println(smartPhone.os() + "\n" + smartPhone.yearOfCompanyCreation());
        System.out.println("------------");
        System.out.println(smartPhone1.os() + "\n" + smartPhone1.yearOfCompanyCreation());
        System.out.println("------------");

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String os();
    int yearOfCompanyCreation();

}

@SmartPhone(os = "Android", yearOfCompanyCreation = 2010)
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(os = "IOS", yearOfCompanyCreation = 1976)
class IPhone {
    String model;
    double price;
}

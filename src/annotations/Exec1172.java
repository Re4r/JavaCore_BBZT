package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Exec1172 {
    public static void main(String[] args) {

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

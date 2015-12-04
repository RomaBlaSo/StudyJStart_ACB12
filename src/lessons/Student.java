package lessons;

/**
 * Created by roma on 29.11.2015.
 */
public class Student {

    int age;
    String name;
    String sex;
    int weight;
    String phone;

    public void sayInfo(){

        System.out.printf("Student %s - age %d, phone %s%n", name, age, phone);

    }
}

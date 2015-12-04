package lessons;

/**
 * Created by roma on 29.11.2015.
 */
public class StudentGroup {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Kolja";
        student1.age = 25;
        student1.phone = "(093) 556-78-39";
        student1.sex = "male";
        student1.weight = 66;

        Student student2 = new Student();
        student2.name = "Tolja";
        //student2.age = 23;
        student2.phone = "(063) 506-08-39";
        student2.sex = "male";
        student2.weight = 80;

        Student[] group = new Student[10];
        group[0] = student1;
        group[1] = student2;

        for (int i = 0; i < group.length; i++) {

            if (group[i] != null) {
                //System.out.printf("Student %s - age %d, phone %s%n", group[i].name, group[i].age, group[i].phone);
                group[i].sayInfo();
            }

        }

    }

}

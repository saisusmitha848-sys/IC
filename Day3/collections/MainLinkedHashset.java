import java.util.LinkedHashSet;

class MainLinkedHashSet{
    public static void main(String[]args){
        LinkedHashSet <String> courses = new LinkedHashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("React");
        courses.add("Java");

        System.out.println(courses);

        System.out.println("Contains Java: " + courses.contains("Java"));

        courses.remove("Python");

        System.out.println("After Removal: " + courses);
    }
}


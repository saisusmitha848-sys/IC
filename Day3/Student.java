class Student {
    String details;

    public static void main(String[] args) {

        Student s = new Student();
        s.details = "Saran,22,Java,85";

        
        String[] values = s.details.split(",");

        
        System.out.println("Name: " + values[0]);
        System.out.println("Age: " + values[1]);
        System.out.println("Course: " + values[2]);
        System.out.println("Marks: " + values[3]);
    }
}

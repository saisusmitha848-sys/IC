import java.util.LinkedList;

class MainLinkedList{
    public static void main(String[]args){
        LinkedList <String> tasks = new LinkedList <>();

        tasks.add("learn Java");
        tasks.add("learn Python");
        tasks.add("learn SQl");

        tasks.addFirst("Start Training");
        tasks.addLast("Build Project");

        System.out.println(tasks);

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("After Removal: " + tasks);
    }
}

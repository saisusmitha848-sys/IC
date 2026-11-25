class TextEditor {
    String sentence = "I love Python Programming";

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        
        System.out.println("Original Sentence: " + editor.sentence);

       
        String modified1 = editor.sentence.replace("Python", "Java");
        System.out.println("After replacing Python: " + modified1);

        
        String modified2 = editor.sentence.replace('o', '0');
        System.out.println("After replacing o with 0: " + modified2);
    }
}
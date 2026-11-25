class FileValidator {
    String fileName;

    public static void main(String[] args) {

      
        FileValidator f1 = new FileValidator();
        f1.fileName = "student_report.pdf";

        if (f1.fileName.endsWith(".pdf")) {
            System.out.println("PDF File");
        } else {
            System.out.println("Different File Format");
        }

        
        FileValidator f2 = new FileValidator();
        f2.fileName = "student_photo.jpg";

        if (f2.fileName.endsWith(".pdf")) {
            System.out.println("PDF File");
        } else {
            System.out.println("Different File Format");
        }

        
        FileValidator f3 = new FileValidator();
        f3.fileName = "student_notes.docx";

        if (f3.fileName.endsWith(".pdf")) {
            System.out.println("PDF File");
        } else {
            System.out.println("Different File Format");
        }
    }
}

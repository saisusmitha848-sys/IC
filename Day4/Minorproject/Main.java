import java.util.*;

public class Main {
    static class Book {
        private int id, copies;
        private String name, author, category;

        Book(int id, String name, String author, String category, int copies) {
            this.id = id; this.name = name; this.author = author;
            this.category = category; this.copies = copies;
        }

        int getId() { return id; }
        int getCopies() { return copies; }
        String getName() { return name; }
        void setCopies(int copies) { if (copies >= 0) this.copies = copies; }

        public String toString() {
            return id + " | " + name + " | " + author + " | " + category + " | Copies: " + copies;
        }
    }

    static abstract class LibraryMember {
        private int id;
        private String name, contact;

        LibraryMember(int id, String name, String contact) {
            this.id = id; this.name = name; this.contact = contact;
        }

        int getId() { return id; }
        String getName() { return name; }
        void common() { System.out.println(id + " | " + name + " | " + contact); }
        abstract void displayMemberDetails();
    }

    static class Student extends LibraryMember {
        String dept; int year;
        Student(int id, String n, String c, String d, int y) {
            super(id, n, c); dept = d; year = y;
        }
        void displayMemberDetails() {
            common(); System.out.println("Student | " + dept + " | Year: " + year);
        }
    }

    static class Faculty extends LibraryMember {
        String dept, designation;
        Faculty(int id, String n, String c, String d, String des) {
            super(id, n, c); dept = d; designation = des;
        }
        void displayMemberDetails() {
            common(); System.out.println("Faculty | " + dept + " | " + designation);
        }
    }

    static class IssueRecord {
        int id, bookId, memberId;
        boolean active = true;
        IssueRecord(int id, int b, int m) { this.id = id; bookId = b; memberId = m; }
    }

    static abstract class LibraryOperations {
        abstract void addBook(Book b);
        abstract void displayBooks();
        abstract void issueBook(int b, int m);
        abstract void returnBook(int b, int m);
    }

    static class Library extends LibraryOperations {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<LibraryMember> members = new ArrayList<>();
        HashMap<Integer, Book> bookMap = new HashMap<>();
        LinkedHashMap<Integer, IssueRecord> records = new LinkedHashMap<>();
        HashSet<Integer> issued = new HashSet<>();
        int memberId = 1001, recordId = 1;

        void addBook(Book b) {
            if (bookMap.containsKey(b.getId())) { System.out.println("Duplicate book ID"); return; }
            books.add(b); bookMap.put(b.getId(), b);
            System.out.println("Book added");
        }

        void displayBooks() {
            for (Book b : books) System.out.println(b);
            System.out.println("Total books: " + books.size());
        }

        void searchBook(int id) {
            System.out.println(bookMap.containsKey(id) ? bookMap.get(id) : "Book not found");
        }

        void addStudent(String n, String c, String d, int y) {
            members.add(new Student(memberId++, n, c, d, y));
        }

        void addFaculty(String n, String c, String d, String des) {
            members.add(new Faculty(memberId++, n, c, d, des));
        }

        LibraryMember findMember(int id) {
            for (LibraryMember m : members) if (m.getId() == id) return m;
            return null;
        }

        void displayMembers() {
            for (LibraryMember m : members) m.displayMemberDetails();
        }

        void searchMember(int id) {
            LibraryMember m = findMember(id);
            if (m == null) System.out.println("Member not found");
            else m.displayMemberDetails();
        }

        void issueBook(int b, int m) {
            Book book = bookMap.get(b);
            if (findMember(m) == null) { System.out.println("Member not found"); return; }
            if (book == null) { System.out.println("Book not found"); return; }
            if (book.getCopies() == 0) { System.out.println("No copies available"); return; }

            book.setCopies(book.getCopies() - 1);
            IssueRecord r = new IssueRecord(recordId++, b, m);
            records.put(r.id, r); issued.add(b);
            System.out.println("Book issued successfully");
        }

        void returnBook(int b, int m) {
            for (IssueRecord r : records.values()) {
                if (r.bookId == b && r.memberId == m && r.active) {
                    r.active = false;
                    bookMap.get(b).setCopies(bookMap.get(b).getCopies() + 1);

                    boolean stillIssued = false;
                    for (IssueRecord x : records.values())
                        if (x.bookId == b && x.active) stillIssued = true;
                    if (!stillIssued) issued.remove(b);

                    System.out.println("Book returned");
                    return;
                }
            }
            System.out.println("No active issue found");
        }

        void displayIssues(boolean activeOnly) {
            for (IssueRecord r : records.values()) {
                if (!activeOnly || r.active)
                    System.out.println("Member: " + r.memberId + " | Book: " + r.bookId
                            + " | " + bookMap.get(r.bookId).getName()
                            + " | " + (r.active ? "Active" : "Returned"));
            }
        }

        void report() {
            int active = 0, copies = 0;
            for (IssueRecord r : records.values()) if (r.active) active++;
            for (Book b : books) copies += b.getCopies();

            System.out.println("Books: " + books.size() + " | Members: " + members.size()
                    + " | Active issues: " + active + " | Available copies: " + copies);
            for (Book b : books) if (b.getCopies() == 0) System.out.println("Unavailable: " + b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        int ch;

        do {
            System.out.println("\n1.Add Book  2.Display Books  3.Search Book");
            System.out.println("4.Register Student  5.Register Faculty  6.Display Members");
            System.out.println("7.Search Member  8.Issue Book  9.Return Book");
            System.out.println("10.Issued Books  11.Report  12.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("ID, Name, Author, Category, Copies: ");
                    l.addBook(new Book(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt()));
                    break;
                case 2: l.displayBooks(); break;
                case 3: System.out.print("Book ID: "); l.searchBook(sc.nextInt()); break;
                case 4:
                    System.out.print("Name Contact Department Year: ");
                    l.addStudent(sc.next(), sc.next(), sc.next(), sc.nextInt()); break;
                case 5:
                    System.out.print("Name Contact Department Designation: ");
                    l.addFaculty(sc.next(), sc.next(), sc.next(), sc.next()); break;
                case 6: l.displayMembers(); break;
                case 7: System.out.print("Member ID: "); l.searchMember(sc.nextInt()); break;
                case 8:
                    System.out.print("Member ID and Book ID: ");
                    int m = sc.nextInt(), b = sc.nextInt(); l.issueBook(b, m); break;
                case 9:
                    System.out.print("Member ID and Book ID: ");
                    m = sc.nextInt(); b = sc.nextInt(); l.returnBook(b, m); break;
                case 10:
                    System.out.print("Active only? (true/false): ");
                    l.displayIssues(sc.nextBoolean()); break;
                case 11: l.report(); break;
                case 12: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice");
            }
        } while (ch != 12);

        sc.close();
    }
}
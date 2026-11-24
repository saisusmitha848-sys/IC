class UniversityMember {
    int memberId;

    void checkIn() {
        System.out.println("Member checked in");
    }
}

class Staff extends UniversityMember {
    String department;

    void attendMeeting() {
        System.out.println("Staff attending meeting");
    }
}

class Professor extends Staff {
    String subject;

    void conductLecture() {
        System.out.println("Teaching subject: " + subject);
    }
}

class AdminOfficer extends Staff {
    String officeRoom;

    void processFiles() {
        System.out.println("Processing files in room: " + officeRoom);
    }
}

class Inherit5 {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.memberId = 101;
        p.department = "CSE";
        p.subject = "Java";

        AdminOfficer a = new AdminOfficer();
        a.memberId = 102;
        a.department = "Administration";
        a.officeRoom = "A-101";

        System.out.println("--- Professor Details ---");
        p.checkIn();
        p.attendMeeting();
        p.conductLecture();

        System.out.println("\n--- Admin Officer Details ---");
        a.checkIn();
        a.attendMeeting();
        a.processFiles();
    }
}

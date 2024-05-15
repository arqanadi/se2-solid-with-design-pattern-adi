public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Juan dela Cruz", 123456789);

        LibraryResource book = new Book("Advanced Calculus");
        LibraryResource journal = new Journal("Medical Technology Journal");
        LibraryResource thesis = new Thesis("Psychology Thesis");
        LibraryResource newspaper = new Newspaper("Hudyat Daily Newspaper");
        LibraryResource capstone = new Capstone("Computer Science Capstone Project");
        LibraryResource internetAccess = new InternetAccess("Library Internet Access");

        System.out.println("***Welcome to NEU Library!***\n");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
        student.borrowResource(newspaper);
        student.borrowResource(capstone);
        student.borrowResource(internetAccess);

        System.out.println("\nBorrowed Resources by " + student.getName() + " (Stud. ID "+ student.getStudentId() +"):");
        for (LibraryResource resource : student.getBorrowedResources()) {
            System.out.println(resource.getTitle());
        }

    }

}
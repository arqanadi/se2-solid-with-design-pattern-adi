import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private int studentId;
    private List<LibraryResource> borrowedResources;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.borrowedResources = new ArrayList<>();
    }

    public void borrowResource(LibraryResource resource) {
        resource.borrow();
        borrowedResources.add(resource);
    }

    public List<LibraryResource> getBorrowedResources() {
        return borrowedResources;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

}
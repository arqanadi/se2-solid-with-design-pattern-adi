public class Newspaper implements LibraryResource {
    private String title;

    public Newspaper(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing newspaper: " + title);
    }
}
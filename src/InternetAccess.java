public class InternetAccess implements LibraryResource {
    private String title;

    public InternetAccess(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Accessing internet: " + title);
    }
}
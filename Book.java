import java.util.Scanner;

class Book {
    private String name;
    private String contents;
    private boolean isHardcover;
    private int pageCount;

    public Book(String name, String contents, boolean isHardcover, int pageCount) {
        this.name = name;
        this.contents = contents;
        this.isHardcover = isHardcover;
        this.pageCount = pageCount;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Contents: " + contents);
        System.out.println("Hardcover: " + (isHardcover ? "Yes" : "No"));
        System.out.println("Page count: " + pageCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public void setHardcover(boolean hardcover) {
        isHardcover = hardcover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
package lesson2;

public class Magazine implements Printable {
    private String name;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Magazine(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Printingggg magazine....");
    }

}

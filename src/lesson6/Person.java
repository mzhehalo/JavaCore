package lesson6;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Person {
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @NonNull
    private int age;
    @NonNull
    private List<Book> book;
}

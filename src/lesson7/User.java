package lesson7;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    @NonNull
    private int id;
    @NonNull
    private String name;
    @NonNull
    private int age;
    @NonNull
    private boolean status;

    public User(@NonNull String name, @NonNull int age, @NonNull boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public User(@NonNull int id, @NonNull String name, @NonNull int age, @NonNull boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
    }
}
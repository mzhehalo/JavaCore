package lesson6;

import lombok.NonNull;

public class User extends Book implements Comparable<User> {//добавляем возможность сравнивать объекты User

    private String name;
    private Integer age;
    private String email;

    public User(@NonNull String title, @NonNull int pageCount, @NonNull String country) {
        super(title, pageCount, country);
    }

    @Override
    public int compareTo(User o) {
        int result = this.name.compareTo(o.name);
        System.out.println(o + "/" + this);
        System.out.println("result1   " + result);
        if (result == 0) {
            result = this.age.compareTo(o.age);
            System.out.println("result2   " + result);
        }
        System.out.println("returned" + result);
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

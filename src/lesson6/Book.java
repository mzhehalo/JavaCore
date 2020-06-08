package lesson6;


import lombok.Data;
import lombok.NonNull;

import java.util.List;
import java.util.function.Predicate;

@Data
public class Book {
    @NonNull
    private String title;
    @NonNull
    private int pageCount;
    @NonNull
    private String country;

//    static class TestPagesCountMoreThan400 implements Predicate<Book> {
//
//        @Override
//        public boolean test(Book book) {
//            return book.getPageCount() > 400;
//        }
//    }

    public static void showBooksWithPagesMore400(List<Book> bookList) {
        Predicate<Book> bookPredicate = book -> book.getPageCount() > 400;

        for (Book book : bookList) {
            if (bookPredicate.test(book)) {
                System.out.println(book);
            }
        }
    }

}

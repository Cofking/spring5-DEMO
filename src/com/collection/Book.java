package com.collection;

import java.util.List;

public class Book {
    private List<String> Bname;

    @Override
    public String toString() {
        return "Book{" +
                "Bname=" + Bname +
                '}';
    }

    public void setBname(List<String> bname) {
        Bname = bname;
    }
}

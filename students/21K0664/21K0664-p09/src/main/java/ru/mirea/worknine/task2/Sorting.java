package ru.mirea.worknine.task2;

import java.util.Comparator;

public class Sorting implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return b.getGpa() - a.getGpa();
    }

}

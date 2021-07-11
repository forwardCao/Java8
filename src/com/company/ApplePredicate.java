package com.company;

@FunctionalInterface
public interface ApplePredicate<T> {
    boolean test (T apple);
}

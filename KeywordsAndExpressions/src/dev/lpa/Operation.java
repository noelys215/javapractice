package dev.lpa;

@FunctionalInterface
public interface Operation<T> {
    T operate(T val1, T val2);
}

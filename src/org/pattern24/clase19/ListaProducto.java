package org.pattern24.clase19;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaProducto implements List<Producto> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Producto> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Producto producto) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Producto> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Producto> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Producto get(int index) {
        return null;
    }

    @Override
    public Producto set(int index, Producto element) {
        return null;
    }

    @Override
    public void add(int index, Producto element) {

    }

    @Override
    public Producto remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Producto> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Producto> listIterator(int index) {
        return null;
    }

    @Override
    public List<Producto> subList(int fromIndex, int toIndex) {
        return null;
    }
}

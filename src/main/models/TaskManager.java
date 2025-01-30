package main.models;
/*
    TaskManager based on ArrayList, is used to manage tasks
 */
public class TaskManager<E>{
    TaskManager<E> tm;

    public TaskManager() {
        tm = new TaskManager<>();}

    public boolean add(E e) {
        if(e != null) {
            tm.add(e);
            return true;
        }
        return false;
    }

    public E remove(int k) {
        return tm.remove(k);
    }

    public int size() {
        return tm.size();
    }

    public boolean isEmpty() {
        return tm.size() <= 0;
    }

    public void clear() {
        tm.clear();
    }

    public E get(int k) {
        return tm.get(k);
    }

    public E set(int k, E e) {
        tm.set(k, e);
        return e;
    }

    public void sort(){
        // need to implement
    }
}

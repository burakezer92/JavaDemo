package GenericInterface;

public class Student<T> implements IGeneric<T>{//public class Student implements IGeneric<Student>
    @Override
    public boolean insert(T data) {
        System.out.println(data + "ekle");
        return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data + "güncelle");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data + "sil");
        return false;
    }

    @Override
    public T select() {
        System.out.println("çek");
        return null;
    }
}

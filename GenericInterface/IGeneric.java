package GenericInterface;

public interface IGeneric <T> {//<T extens Integer> Bounded types T alacağı değerleri sınırlama
    public boolean insert(T data);
    public boolean update(T data);
    public boolean delete(T data);
    public T select();
}

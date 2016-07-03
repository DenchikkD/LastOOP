package collections;

/**
 * Created by Denni on 20.05.2016.
 */
public interface Collection {


    public Integer size(); // Возвращате количество елементов

    public boolean isEmpty(); // true ящо пустий

    public String toString();//вывод содержимого колекции на экран

    public boolean contains(int element); //Проверка есть ли в коллекции элемент
}

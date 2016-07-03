package collections.deque;

import collections.queue.Queue;

/** Created by IEvgen Boldyr on 27.05.16.
 * Project: OOP - Base002
 *
 * Интерфейс двунаправленной очереди
 */
import java.util.NoSuchElementException;

public interface Deque extends Queue {
    /**
     * Возвращает но не удаляет элемент из начала очереди,
     *
     * @throws NoSuchElementException - если очередь пуста
     */
    public int element() throws NoSuchElementException;

    /**
     * Добавляет элемент в конец очереди,
     *
     * @return true  - элемент удачно добавлен
     * false - элемент не добавлен
     */
    public boolean offer(int element);

    /**
     * Возвращает без удаления элемент из начала очереди
     *
     * @return int element - возврщает значение элемента
     * null    - если очередь пуста, возвращается null
     */
    public Integer peek();

    /**
     * Возвращает c удалением элемент из начала очереди
     *
     * @return int element - возврщает значение элемента
     * null    - если очередь пуста, возвращается null
     */
    public Integer poll();

    /**
     * Возвращает c удалением элемент из начала очереди
     *
     * @return int element - возврщает значение элемента
     * @throws NoSuchElementException - если очередь пуста
     */
    public Integer remove() throws NoSuchElementException;

    /**
     * Добавляет элемент в начало очереди
     */
    public void addFirst(int element);

    /**
     * Добавляет элемент в конец очереди
     */
    public void addLast(int element);

    /**
     * Возвращает без удаления первый элемент в очереди
     *
     * @return true  - элемент удачно добавлен
     * false - элемент не добавлен
     * @throws NoSuchElementException - если очередь пуста /
     */
    public Integer getFirst() throws NoSuchElementException;
                                     /**Возвращает без удаления последний элемент в очереди
     * @throws NoSuchElementException - если очередь пуста /
     *
     */

    public Integer getLast() throws NoSuchElementException;
                                   /**Добавляет элемент в начало очереди
     */
    public boolean offerFirst(int element);

/**Добавляет элемент в конец очереди
 * @return true  - элемент удачно добавлен
 *         false - элемент*/
    /**Добавляет элемент в конец очереди
     * @return true  - элемент удачно добавлен
     *         false - элемент не добавлен*/
    public boolean offerLast(int element);
    /**Возвращает без удаления элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public Integer peekFirst();
    /**Возвращает без удаления элемент из конца очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public Integer peekLast();
    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public int pollFirst();
    /**Возвращает c удалением элемент из конца очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public int pollLast();
    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     * @throws java.util.NoSuchElementException  - если очередь пуста*/
    public int removeFirst() throws NoSuchElementException;
    /**Возвращает c удалением элемент из конца очереди
     * @return int element - возврщает значение элемента
     * @throws java.util.NoSuchElementException  - если очередь пуста*/
    public int removeLast() throws NoSuchElementException;

}
package collections.myArrayQueueCillections;

/**
 * Created by Denni on 31.05.2016.
 */
public interface MyQueue extends MyCollections {



    public boolean offer(Integer value);

    public Integer remove();

    public Integer poll();

    public Integer element();

    public Integer peek();


}

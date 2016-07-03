package lessons14.thrqueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Denni on 24.06.2016.
 */
public class ThreadSafe {

    private static class Safe {
        private Queue<String> queue = new ArrayDeque<String>();

        private static Safe safe;

        public static Safe getSafe() {
            if (safe == null) {
                safe = new Safe();
                return safe;
            }
            return safe;
        }

        public Queue<String> getSafeQueue() {
            return queue;
        }
    }

    public synchronized void add(String value) {
        Safe safe = Safe.getSafe();
        Queue<String> queue = safe.getSafeQueue();
        queue.add(value);

    }

    public synchronized String get() {
        Safe safe = Safe.getSafe();
        Queue<String> queue = safe.getSafeQueue();
        return queue.poll();
    }

}

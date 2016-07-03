package lessons5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 25.05.2016.
 */
public class OuterSafe {
    private static class Safe {

        private List<String> strings;
        private static Safe instance;

        public Safe() {// весь цей клас це сынглтон
            strings = new ArrayList<String>();
        }

        public static Safe getInstance() {  // Універсальне храніліще. Сінглтон.
            if (instance == null) {
                instance = new Safe();
                //при первом вызове - создание обьекта
                return instance;
            } else {
                // при последующих возвращаем обьект
                return instance;
            }
        }

        public List<String> getList() {
            return strings;
        }


    }
    public void addString(String str) {
        //Создаем либо вызываем наше хранилище
        Safe safe = Safe.getInstance();

        //получаем данные из хранилища
        List<String> strings = safe.getList();
        strings.add(str);

    }

    public void getData(){
        Safe safe = Safe.getInstance();
        List<String > strings= safe.getList();
        for( String string: strings){
            System.out.println(string);
        }
    }
}

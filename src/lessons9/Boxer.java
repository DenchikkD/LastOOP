package lessons9;

/**
 * Created by Denni on 08.06.2016.
 */
public class Boxer<T> {
    // универсальный упаковщик (не совсем)))))(упаковщик тиа Т)
    public Container boxing(T boxElement) {
        Container<T> container = new Container<T>();
        container.setElement(boxElement);
        return container;
    }

    public void boxingSuperT(Container<? super T> container, T element) {
        container.setElement(element);
    }

    public void unboxingElementUser(Container<? extends UserT> container) {
        System.out.println("User login: " + container.getElement().getLogin() +
                "\n User password: " + container.getElement().getPassword() +
                "\n User age: " + container.getElement().getAge()
        );
    }

    // универсальный метод роспаковщик
    public Object unboxing(Container<?> container) {
        return (Object) container.getElement();
    }

    // посмотореть тип елемента в контейнере
    public void printContanerTipe(Container<?> container) {

        System.out.println("Type: " + container.getElement().getClass().getName());
    }
}

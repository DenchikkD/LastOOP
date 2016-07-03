package lessons3;

/**
 * Created by Denni on 18.05.2016.
 */
public class Phone {
    public String model;
    public String color;

    public Phone() {
        model = "NoName";
        color = "Black";
    }

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

//    public void aboutMe() {
//        System.out.println("Model : " + model);
//        System.out.println("Color : " + color);
//    }
//


// дефолтний кодн метода
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Phone)) return false;
//
//        Phone phone = (Phone) o;
//
//        if (!model.equals(phone.model)) return false;
//        return color.equals(phone.color);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = model.hashCode();
//        result = 31 * result + color.hashCode();
//        return result;
//    }


    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Phone) {
            Phone phone = (Phone) obj;
            if (model.equals(phone.model) & color.equals(phone.color)) {
                return true;
            }
        }
        return false;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

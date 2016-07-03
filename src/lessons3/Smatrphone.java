package lessons3;

/**
 * Created by Denni on 18.05.2016.
 */
public class Smatrphone extends Phone {
    String os;

    public Smatrphone() {
        super();
    }


    public Smatrphone(String model, String color, String os) {
        super.model = model;// super дає можливість достукатись до змінної яка описана в бвтьківському класі
        super.color = color;

        this.os = os;

    }

//    @Override
//    public void aboutMe() {
//        super.aboutMe();
//        System.out.println("os : " + os);
//    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Smatrphone){
            Smatrphone smatrphone= (Smatrphone)obj;
            if(model.equals(smatrphone.model)&color.equals(smatrphone.color)&os.equals(smatrphone.os)){
                return true;
            }



        }return false;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + os.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Smatrphone{" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                "os='" + os + '\'' +
                '}';
    }
}

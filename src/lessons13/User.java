package lessons13;

/**
 * Created by Denni on 22.06.2016.
 */
public class User {

    private String log = "Denn";
    private String pass = "5555";


    public boolean authCheck(String log, String psaa) throws UserNotAuthExeption {



            if (this.log.equals(log) && this.pass.equals(psaa)) {
//                System.out.println("Ok");
                return true;

            }else{

            throw new UserNotAuthExeption(" Не получилось");


        }

    }
}

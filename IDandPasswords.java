import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo  = new HashMap<String,String>();

     IDandPasswords(){

        logininfo.put("Clyde","clyde");
        logininfo.put("Ngeno","1230");
        logininfo.put("Kipkoch","0123");
     }

     protected HashMap getLoginInfo(){
        return logininfo;
     }
}

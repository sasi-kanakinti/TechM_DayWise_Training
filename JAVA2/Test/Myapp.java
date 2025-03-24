package Test;
public class Myapp {
    public String validate(String role,String opp){
        if(role.equals("admin")){
            if(opp.equals("addStudent")){
                return "Admin can add student";
            }else{
                 return "Operation not possible";
            }
        }else{
             return "Not admin";
        }
    }
    public String login(String role, String uname, String pass){
        if(role.equals("student")){
            if(uname.equals("raju") && pass.equals("123")){
                return "Student Logged in";
            }else{
                return "Invalid Credentials";
            }
        }else{
            return "Invalid User";
        }
       
    }
}
 
 
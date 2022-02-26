package demo.pojo;

public class User {
    private int id;
    private String user_Name;
    private String user_Acount;
    private String user_PSW;

    public User(){

    }
    public User(int id, String name, String acount, String psw){
        this.id=id;
        this.user_Name=name;
        this.user_Acount=acount;
        this.user_PSW=psw;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Acount() {
        return user_Acount;
    }

    public void setUser_Acount(String user_Acount) {
        this.user_Acount = user_Acount;
    }

    public String getUser_PSW() {
        return user_PSW;
    }

    public void setUser_PSW(String user_PSW) {
        this.user_PSW = user_PSW;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_Name='" + user_Name + '\'' +
                ", user_Acount='" + user_Acount + '\'' +
                ", user_PSW='" + user_PSW + '\'' +
                '}';
    }
}

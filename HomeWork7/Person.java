package HomeWork7;


public class Person {
    String nick;
    String password;


    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
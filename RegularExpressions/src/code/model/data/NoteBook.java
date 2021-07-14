package code.model.data;

public class NoteBook {
    String name;
    String nick;


    public NoteBook(String name, String nick)
        throws LoginAlreadyExistsException {
            if (NoteBookBase.checkLogin(nick)){
                throw new LoginAlreadyExistsException("Login already exists",
                        nick);
            }
        this.name = name;
        this.nick = nick;
    }

    public String getName() { return name; }
    public String getNick() { return nick; }
    public void setName(String name) {this.name = name; }
    public void setNick(String nick) { this.nick = nick; }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}

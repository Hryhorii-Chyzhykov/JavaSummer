package code.model.data;

public enum NoteBookBase {
    NOTE_ONE("Taras", "taras123"),
    NOTE_TWO("Nikola","nik12345"),
    NOTE_THREE ("Petro","shoko123");

    private final String firstName;
    private final String login;

    NoteBookBase(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLogin() {
        return login;
    }

    public static boolean checkLogin (String loginData){
        for (NoteBookBase note : NoteBookBase.values()){
            if (note.getLogin().equals(loginData)){return true;}
        }
        return  false;
    }
}

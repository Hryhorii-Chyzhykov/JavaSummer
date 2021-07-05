package code;

/**
 *
 */

public class Notebook {
   private String surname;
   private String name;
   private String patronymic;
   private String abbreviatedName;
   private String nick;
   private String comment;


    public Notebook(String surname, String name, String patronymic, String nick, String comment) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.abbreviatedName = this.surname + " " + this.name.charAt(0) + "." + " "
                + this.patronymic.charAt(0) +".";
        this.nick = nick;
        this.comment = comment;
    }

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPatronymic() {return patronymic;}
    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}
    public String getAbbreviatedName() {return abbreviatedName;}
    public void setAbbreviatedName() {
        this.abbreviatedName = this.surname + " " + this.name.charAt(0) + "." + " "
                + this.patronymic.charAt(0) + ".";}
    public String getNick() {return nick;}
    public void setNick(String nick) {this.nick = nick;}
    public String getComment() {return comment;}
    public void setComment(String comment) {this.comment = comment;}




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook notebook = (Notebook) o;

        if (!surname.equals(notebook.surname)) return false;
        if (!name.equals(notebook.name)) return false;
        if (!patronymic.equals(notebook.patronymic)) return false;
        return nick.equals(notebook.nick);
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + patronymic.hashCode();
        result = 31 * result + nick.hashCode();
        return result;
    }
}

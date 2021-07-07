package code.controller;

/**
 *
 */

public class Notebook {
   private String surname;
   private String name;
   private String abbreviatedName;
   private String nick;


    public Notebook(String surname, String name, String nick) {
        this.surname = surname;
        this.name = name;
        this.abbreviatedName = this.surname + " " + this.name.charAt(0) + ".";
        this.nick = nick;
    }

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAbbreviatedName() {return abbreviatedName;}
    public void setAbbreviatedName() {
        this.abbreviatedName = this.surname + " " + this.name.charAt(0) + ".";}
    public String getNick() {return nick;}
    public void setNick(String nick) {this.nick = nick;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook notebook = (Notebook) o;

        if (!surname.equals(notebook.surname)) return false;
        if (!name.equals(notebook.name)) return false;
        return nick.equals(notebook.nick);
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + nick.hashCode();
        return result;
    }
}

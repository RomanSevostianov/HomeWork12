import javax.management.loading.PrivateMLet;

public class Book {
    private String surname;
    private String name;

    public Book(String name2, String surname2) {
        this.name = name2;
        this.surname = surname2;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname(){
        return  this.surname;
    }

    public  void  setName (String name) {
        this.name=name;
    }
}


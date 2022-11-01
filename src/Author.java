public class Author {
   private  String author;
   private int years;

  public  Author (String author, int years) {
        this.author=author;
        this.years=years;
    }

    public String getAuthor() {
        return this.author;
    }
    public int getYears(){
        return this.years;
    }

    public  void  setName (String name) {
        this.author=name;
    }
}

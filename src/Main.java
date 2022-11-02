public class Main {

    public static void main(String[] args) {

        Book bookOne = new Book ("Roman s kamnem", "Volcov",1985);
        Book bookTwo = new Book ("Terminator", "Morozov",1996);

        Author authorOne = new Author("Ropp", "Serji");
        bookOne.setYearPublication(2000);
        System.out.println(bookOne.getYearPublication());
    }

}

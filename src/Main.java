public class Main {


    public static void main(String[] args) {

        Book bookOne = new Book ("Roman", "Volcov");
        Book bookTwo = new Book("Anna", "Volcova");
        Book bookThree = new  Book("Anna", "Volcova");
        System.out.println(bookOne.getName() + "  " + bookOne.getSurname());

        bookOne.setName("Сергей");
        System.out.println(bookOne.getName());
    }

}

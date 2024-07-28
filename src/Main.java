//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book asd = new Book("",2003,"shrek");
        Book qwe = new Book("Lermontov",2005,"maskarad");
        System.out.println(qwe.getYear());
        qwe.setYear(1996);
        System.out.println(qwe.getYear());
        Author Pushkin = new Author("Aleksanr","Pushkin");
        Author Lermontov = new Author("Mikhail","Lermontov");
        asd.authorVerification();



    }
}


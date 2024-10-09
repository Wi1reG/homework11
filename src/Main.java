//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Aleksanr","Pushkin");
        Author Lermontov = new Author("Mikhail","Lermontov");
        Book asd = new Book(Pushkin,2003,"shrek");
        Book qwe = new Book(Lermontov,2005,"maskarad");
        System.out.println(qwe.getYear());
        qwe.setYear(1996);
        System.out.println(qwe.getYear());
        System.out.println(Pushkin.equals(Lermontov));
        System.out.println(Pushkin);
        System.out.println(asd);
        System.out.println(Lermontov.equals(Pushkin));
        System.out.println(asd.equals(qwe));
        System.out.println(Pushkin.hashCode());
        System.out.println(asd.hashCode());



    }
}

//Реализуйте методы
//toString
//,
//equals
// и
//hashCode
// в классах
//Author
// и
//Book
//, которые вы создали на прошлом уроке.
//
//Обратите внимание, что
//toString
// книги не должен дублировать код из
//toString
// автора, а должен делегировать (вызывать) его версию метода.
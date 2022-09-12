public class Main {
    public static void main(String[] args){
        Book b1 = new Book("Rose Morena");
        Magazine m1 = new Magazine("Vogue");
        Magazine m2 = new Magazine("ELLIE GIRS");
        Book b2 = new Book("Romeo and Jullieta");

        Printable[] printables = {b1,b2,m1,m2};
        for (Printable printable: printables){
 printable.print();

        }
    }
}


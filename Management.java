import java.util.Scanner;

public class Management {
    public static void main(String arg[]) {
        char r;
        do {

            System.out.println("Digital Library Management");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to Complete Issue details");
            System.out.println("Press 5 to Exit");
            Scanner obj3 = new Scanner(System.in);
            System.out.println("Enter Your Choice");
            int a = obj3.nextInt();
            switch (a) {
                case 1:
                    Digital_Library l = new Digital_Library();
                    l.add();
                    break;
                case 2:
                    Digital_Library u = new Digital_Library();
                    u.issue();
                    break;
                case 3:
                    Digital_Library i = new Digital_Library();
                    i.retur();
                    break;
                case 4:
                    Digital_Library s = new Digital_Library();
                    s.detail();
                    break;
                case 5:
                    Digital_Library t = new Digital_Library();
                    t.exit();
                    break;
                default:
                    System.out.println("Your Enter Choice is Invalid");
                    System.out.println("Please try again...");

            }

            System.out.println("Did you Want to use more service y/n");
            r = obj3.next().charAt(0);

        } while (r == 'y');
        if (r == 'n') {
            Digital_Library z = new Digital_Library();
            z.exit();
        }

    }

    static class Digital_Library {
        int a, c;

        void add() {
            System.out.println("Enter Book Name, Book Number and Book Prize");
            Scanner obj1 = new Scanner(System.in);
            String str = obj1.nextLine();
            float Prize = obj1.nextFloat();
            int BookNumber = obj1.nextInt();
            System.out.println("your details is" + str + Prize + BookNumber);
        }

        void issue() {
            Scanner obj2 = new Scanner(System.in);
            System.out.println("Book Name");
            str = obj2.nextLine();
            System.out.println("Book ID");
            a = obj2.nextInt();
            obj2.nextLine();
            System.out.println("Issue Date");
            b = obj2.nextLine();
            System.out.println("totoal Number of book Issued");
            c = obj2.nextInt();
            obj2.nextLine();
            System.out.println("Date of Returing a book");
            date = obj2.nextLine();

        }

        int id() {
            return a;

        }

        void retur() {
            System.out.println("Enter Student Name and Book ID");
            Scanner c = new Scanner(System.in);
            String name = c.nextLine();
            int BookID = c.nextInt();
            if (a == BookID) {
                System.out.println("All Details");
                System.out.println("Book Name:-" + Digital_Library.str);
                System.out.println("Book ID:-" + Digital_Library.a);
                System.out.println("Issue date of a book:-" + Digital_Library.b);
                System.out.println("Total Number of Book Issued:-" + Digital_Library.c);
                System.out.println("Return date of book:-" + Digital_Library.date);

            } else {
                System.out.println("The Entered ID is Wrong");
                System.out.println("Please try again...");
            }
        }

        void detail() {

            System.out.println("Book Name:-" + Digital_Library.str);
            System.out.println("Book ID:-" + Digital_Library.a);
            System.out.println("Issue date of a book:-" + Digital_Library.b);
            System.out.println("Total Number of Book Issued:-" + Digital_Library.c);
            System.out.println("Return date of book:-" + Digital_Library.date);
        }

        void exit() {
            System.exit(0);
        }
    }
}
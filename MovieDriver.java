import java.util.Scanner;

public class MovieDriver{

    public static void main(String[] args)
    {
        String movieName;
        String movieRate; 
        String again;
        int ticket;
        while (1<2)
        {
            Scanner stdin = new Scanner (System.in);
            Movie a = new Movie();
            System.out.println("Please enter the movie's name: ");
            movieName = stdin.nextLine();
            a.setTitle(movieName);
            System.out.println("Please enter the movie's rating: ");
            movieRate = stdin.nextLine();
            a.setRating(movieRate);
            System.out.println("Please enter the number of ticket sold at the (unnamed) movie theater: ");
            ticket = stdin.nextInt();
            a.setSoldTickets(ticket);
            System.out.println(a.toString());
            System.out.println("Do you want to enter another movie? (y or n):");
            again = stdin.next();
            if (again.equals("n"))
            {
                System.exit(0);
            }
            else
            {
                while (1<2)
                {
                    if (again.equals("y"))
                    {
                        break;
                    }
                    else if (again.equals("n"))
                    {
                        System.exit(0);
                    }
                    else
                    {   System.out.println("I don't understand, please type again: ");
                        again = stdin.next();
                    }
                }
            }
        }
    }
}
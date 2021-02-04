import java.util.Scanner;

public class MovieDriver{

    public static void main(String[] args)
    {
        String movieName, movieRate;
        int ticket;

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
        
    }
}
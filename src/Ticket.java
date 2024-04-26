package src;
public class Ticket {
    
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket (int studioNumber, double price, String seat){
        this.studioNumber = studioNumber;
        this.price = price;
        this.seat = seat;

        public String getTicketInfo() {
            return ticketInfo;
        }

        public int getStudioNumber(){
            return studioNumber;
        }

        public void setPrice(double price){
            return price;
        }

        public double getPrice(){
            return price;
        }

        public String getSeat(){
            return seat;
        }

        public static double getTicketPrice(String type){
            return ticketprice;
        }
    
    }
}

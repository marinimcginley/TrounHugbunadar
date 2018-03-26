public class Room {
    private int priceForNight;
    private int numberOfAdults;
    private int numberOfChildren;
    private Date[] isBooked;
    
    public Room(int priceForNight, int numberOfAdults, int numberOfChildren, Date[] isBooked) {
        this.priceForNight = priceForNight;
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
        this.isBooked = isBooked;
    }

    // Tekur inn lista af dagsetningum í samhangandi röð og tékkar hvort herbergið sé laust
    // Skilar true ef herbergið er laust á inntaki annars false
    private boolean isAvailable(Date[] date) {
        for (int i=0; i<isBooked.length; i++) {
            for (int j=0; j<date.length; j++) {
                if (isBooked[i] == date[j]) return false;
            }
        }
        return true;
    }


}

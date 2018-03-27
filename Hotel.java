public class Hotel {
	
	public String nameOfHotel;
	public String locationOfHotel;
	public ArrayList<Room> rooms;
	//public boolean aviableForHandic;
	//public boolean pickUp;
	//public boolean breakfastIncluded;
	public Date checkInStart;
	public Date checkInFinish;

	public Hotel(String nameOfHotel, String locationOfHotel) {
		this.nameOfHotel = nameOfHotel;
		this.locationOfHotel = locationOfHotel;
		//this.checkInStart = checkInStart;
		//this.checkInFinish = checkInFinish;
	}

	public String getNameOfHotel() {
		return nameOfHotel;
	}

	public String getLocationOfHotel() {
		return locationOfHotel;
	}

	/*public Date getCheckInStart() {
		return checkInStart;
	}

	public Date getCheckInFinish() {
		return checkInFinish;
	}*/

	// Býr til herbergi fyrir þetta hótel
	public addRoom(int priceForNight, int numberOfAdults, int numberOfChildren, Date[] isBooked) {
		Room roomTest = new Room(priceForNight, numberOfAdults, numberOfChildren, isBooked);
		rooms.push(roomTest);
	}

	// skilar herbergjum fyrir þetta hotel
	public ArrayList<Room> viewRooms() {
		return rooms;
	}
}
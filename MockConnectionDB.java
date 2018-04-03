import java.util.ArrayList;
import java.net.ConnectException;
import java.lang.Object;
import java.time.LocalDate;

public class MockConnectionDB {

	public MockConnectionDB() {

	}

	public ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException {
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		Hotel hotel1 = new Hotel("Hotel Grand", "Reykjavik");
		LocalDate[] array1 = {LocalDate.of(2018,2,5), LocalDate.of(2018,2,6), LocalDate.of(2018,2,7)};
		hotel1.addRoom(20000, 2, 0, array1);
		Hotel hotel2 = new Hotel("Hotel Siglufjörður", "Siglufjörður");
		LocalDate[] array2 = {LocalDate.of(2018,6,5), LocalDate.of(2018,6,6), LocalDate.of(2018,6,7)};
		hotel2.addRoom(15000, 2, 2, array2);
		Hotel hotel3 = new Hotel("Hotel Akureyri", "Akureyri");
		LocalDate[] array3 = {LocalDate.of(2018,3,15)};
		hotel3.addRoom(9000, 1, 0, array3);

		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);

		return hotels;
	}
}
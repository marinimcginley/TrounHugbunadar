import Hotel;
import java.util.AraryList;
import java.net.ConnectException;
import java.util.Date;

public class MockConnectionDB {

	public MockConnectionDB() {

	}

	// Þurfum að laga hvernig við erum að senda inn dagsetningar. erum að fá villur
	public ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException {
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		Hotel hotel1 = new Hotel("Hotel Grand", "Reykjavik");
		hotel1.addRoom(20000, 2, 0, [2018-02-05, 2018-02-06, 2018-02-07]);
		Hotel hotel2 = new Hotel("Hotel Siglufjörður", "Siglufjörður");
		hotel2.addRoom(15000, 2, 2, [2018-06-05, 2018-06-06, 2018-06-07]);
		Hotel hotel3 = new Hotel("Hotel Akureyri", "Akureyri");
		hotel3.addRoom(9000, 1, 0, [2018-03-15]);

		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);

		return hotels;
	}

	private static interface QueryDB {

	}

	public class MockConnectionDB implements QueryDB {
		public ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException{
			throws new ConnectException();
		}
	}



}
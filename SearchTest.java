import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDate;


public class SearchTest {
	private static ArrayList<Hotel> hotels;

	@Before
	public void setUp() {
		try {
			MockConnectionDB conn = new MockConnectionDB();
			hotels = conn.getMatchingHotelFromDB("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@After
	public void clear() {
		hotels = null;
	}


	@Test
	public void testSearchHotelName() {
		String querySearch = "Grand";

		ArrayList<Hotel> testList = hotels;
		testList.removeIf(hotel -> !hotel.nameOfHotel.contains(querySearch));

		assertNotNull(testList);
		assertFalse(testList.isEmpty());
		for (Hotel item : testList) {
			assert(item.nameOfHotel.contains(querySearch));
		}
		
	}

	@Test
	public void testSearchHotelByDate() {
		LocalDate[] querySearch = {LocalDate.of(2018,6,6)};

		ArrayList<Hotel> testList = hotels;
		// SKIL EKKI ÞESSAR FOKKING LAMBDA SEGÐIR!!!
		//testList.removeIf(hotel -> !hotel.viewRooms.isAvailable(querySearch)); // loopa í gegnum herbergin??

		assertNotNull(testList);
		assertFalse(testList.isEmpty());
		for (Hotel item : testList) {
			for (Room room : item.viewRooms()) {
				
				assert(room.isAvailable(querySearch));
			}
		}
	}

	public static void main(String[] args) {

	}


}
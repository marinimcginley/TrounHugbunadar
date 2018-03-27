import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;


public class SearchTest {
	private ArrayList<Hotel> hotels;

	@Before
	public void makeIt() {
		try {
			MockConnectionDB conn = new MockConnectionDB();
			hotels = conn.getMatchingHotelsFromDB("");
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


}
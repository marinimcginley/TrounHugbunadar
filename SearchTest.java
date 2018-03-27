import java.util.AraryList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class SearchTest {
	private AraryList<Hotels> hotels;

	@Before
	public void makeIt() {
		try {
			MockConnectionDB conn = new MockConnectionDB();
			hotels = conn.getMatchingHotelsFromDB("");
		} catch (Exteption e) {
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

		AraryList<Hotels> testList = hotels;
		testList.removeIf(hotel -> !hotel.nameOfHotel.contains(querySearch));

		assertNotNull(testList);
		assertFalse(testList.isEmpty());
		for (Hotel item : testList) {
			assert(item.nameOfHotel.contains(querySearch));
		}
	}


}
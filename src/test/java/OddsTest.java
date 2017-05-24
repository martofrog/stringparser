import model.Odds;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by nma32 on 24/05/2017.
 */
public class OddsTest {

	/**
	 *
	 * We feed our odds from many different sources, we receive them as strings and manipulate them as java objects.
	 *
	 * A correct odds string is for example "5/2" which corresponds to 3.5 decimal price.
	 * Unfortunately our feeds aren't always reliable and the string can contain literally anything.
	 * Aim of this task is to provide a small and solid module which parses a string and returns an a valid Odds
	 * object if possible.
	 *
	 **/

	@Test
	public void testOddsNotNull() {
		Odds odds = new Odds();

		assertNotNull(odds);
	}

}

package cax.location.test;

import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cax.location.Label;
import cax.location.Location;
import cax.location.LocationOntology;
import cax.location.LocationType;

public class LocationOntologyTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddLocationType() {
		LocationType locationType1 = new LocationType(4, new Label("Suburb",
				"en_AU"));
		locationType1.addLabel(new Label("Bairro", "pt_BR"));

		LocationOntology lo = new LocationOntology(true);
		lo.addLocationType(locationType1);

		assertEquals(4, lo.numberLocationTypes());
	}

	@Test
	public void testAddLocationTypeNull() {

		LocationOntology lo = new LocationOntology(true);
		try {
			lo.addLocationType(null);
		} catch (Exception e) {
			assertNotNull(e);
		}

	}

	@Test
	public void testSearch() {
		LocationOntology lo = new LocationOntology(true);
		String searchTerm = "Brazil";

		List<Location> result = lo.search(searchTerm);
		assertEquals(2, result.size());
	}

}

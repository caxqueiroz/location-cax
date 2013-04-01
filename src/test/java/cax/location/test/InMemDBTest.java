package cax.location.test;

import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cax.location.InMemDB;
import cax.location.Label;
import cax.location.Location;
import cax.location.LocationType;

public class InMemDBTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFilter() {
		String search = "Carlos";
		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(0, filteredLocations.size());

	}

	@Test
	public void testFilter2() {
		String search = "Brasil";

		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(1, filteredLocations.size());

	}

	@Test
	public void testFilter3() {
		String search = "Brazil";
		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(1, filteredLocations.size());

	}

	@Test
	public void testFilter4() {
		String search = "Br";
		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(1, filteredLocations.size());

	}

	@Test
	public void testFilter5() {
		String search = "Br";
		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		Location location1 = new Location(new LocationType(3, new Label("City",
				"en_AU")), new Label("Brasilia", "en_AU"));
		location1.addLabel(new Label("Brasilia", "pt_BR"));
		location1.addLabel(new Label("Brasilia", "fr_FR"));

		locations.addElement(location1);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(2, filteredLocations.size());

	}
	
	@Test
	public void testFilter6() {
		String search = "Br Australia";
		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		Location location1 = new Location(new LocationType(3, new Label("City",
				"en_AU")), new Label("Brasilia", "en_AU"));
		location1.addLabel(new Label("Brasilia", "pt_BR"));
		location1.addLabel(new Label("Brasilia", "fr_FR"));

		locations.addElement(location1);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(0, filteredLocations.size());

	}
	
	@Test
	public void testFilter7() {
		String search = "Br*";
		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		Location location1 = new Location(new LocationType(3, new Label("City",
				"en_AU")), new Label("Brasilia", "en_AU"));
		location1.addLabel(new Label("Brasilia", "pt_BR"));
		location1.addLabel(new Label("Brasilia", "fr_FR"));

		locations.addElement(location1);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(0, filteredLocations.size());

	}
	
	
	@Test
	public void testFilter8() {
		String search = "br";
		InMemDB<Location> locations = new InMemDB<Location>();
		Location location0 = new Location(new LocationType(1, new Label(
				"Country", "en_AU")), new Label("Brazil", "en_AU"));
		location0.addLabel(new Label("Brasil", "pt_BR"));
		location0.addLabel(new Label("Brésil", "fr_FR"));

		locations.addElement(location0);

		Location location1 = new Location(new LocationType(3, new Label("City",
				"en_AU")), new Label("Brasilia", "en_AU"));
		location1.addLabel(new Label("Brasilia", "pt_BR"));
		location1.addLabel(new Label("Brasilia", "fr_FR"));

		locations.addElement(location1);

		List<Location> filteredLocations = locations.search(search);

		assertNotNull(filteredLocations);
		assertEquals(2, filteredLocations.size());

	}
}

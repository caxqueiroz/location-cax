package cax.location.marshalling;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import cax.location.Label;
import cax.location.Location;

public class LocationAdapter extends XmlAdapter<CustomLocation, Location> {

	@Override
	public CustomLocation marshal(Location location) throws Exception {

		return new CustomLocation().setCurrentType(location.getLocationType())
				.setLabels(location.getLabels());
	}

	@Override
	public Location unmarshal(CustomLocation cLocation) throws Exception {
		Location location = new Location(cLocation.getCurrentType(),
				cLocation.getDefaultLabel());
		for (Label label : cLocation.getLabels()) {
			location.addLabel(label);
		}
		return location;
	}

}

package cax.location.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cax.location.Broker;
import cax.location.BrokerManager;

public class BrokerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBrokerString() {
		Broker broker = BrokerManager.getInstance().createBroker("broker_01");
		Assert.assertNotNull(broker);
		Assert.assertEquals(broker,
				BrokerManager.getInstance().getBroker("broker_01"));
	}

	@Test
	public void testGetIdentifier() {
		Broker broker = BrokerManager.getInstance().createBroker("broker_01");
		assertNotNull(broker);
		assertNotNull(broker.getIdentifier());
		assertEquals("broker_01", broker.getIdentifier());
	}

}

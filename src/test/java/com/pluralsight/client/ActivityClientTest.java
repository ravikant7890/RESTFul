package com.pluralsight.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.pluralsight.model.Activity;

public class ActivityClientTest {
	
	@Test
	public void testCreate()
	{
		ActivityClient client = new ActivityClient();
		
		Activity activity = new Activity();
		activity.setDescription("Dancing");
		activity.setDuration(90);
		
		activity = client.create(activity);
		
		assertNotNull(activity);
	}

	@Test
	public void testGet() {
		//fail("Not yet implemented");
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("14");
		
		//System.out.println(activity);
		
		assertNotNull(activity);
	}

	@Test
	public void testGetList()
	{
		ActivityClient client = new ActivityClient();
		
		List<Activity> activityList = client.get();
		
		System.out.println(activityList);
		
		assertNotNull(activityList);
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetWithBadRequest()
	{
		ActivityClient activityClient = new ActivityClient();
		
		activityClient.get("12");
	}

	@Test(expected=RuntimeException.class)
	public void testGetWithNotFound()
	{
		ActivityClient activityClient = new ActivityClient();
		
		activityClient.get("7777");
	}
}

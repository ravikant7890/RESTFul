package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepositoy {

	@Override
	public List<Activity> findAllActivities()
	{
		List<Activity> activities= new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		activities.add(activity1);
		
		Activity activity2= new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		activities.add(activity2);
		
		return activities;
		
	}

	@Override
	public Activity findActivity(String activityId) {

		if(activityId.equals("7777"))
		{
			return null;
		}
		
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		activity1.setId("1234");
		
		User user1= new User();
		user1.setId("5678");
		user1.setName("Ravikant");
		
		activity1.setUser(user1);
		
		return activity1;
	}

	@Override
	public void create(Activity activity) {
		//should insert in DB
		
	}
}

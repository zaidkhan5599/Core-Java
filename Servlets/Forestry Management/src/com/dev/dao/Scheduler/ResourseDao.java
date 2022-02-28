package com.dev.dao.Scheduler;

import java.util.List;

import com.dev.beans.*;

public interface ResourseDao {
	public boolean addResources(Resources res);
	public boolean updateResources(Integer resource_id,long resources_quantity);
	public Resources deleteResources(Integer resource_id);
	public List<Resources> displayAll();
	
	
	

}

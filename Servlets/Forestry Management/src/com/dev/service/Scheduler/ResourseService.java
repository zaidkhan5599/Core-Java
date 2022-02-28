package com.dev.service.Scheduler;

import java.util.List;

import com.dev.beans.*;

public interface ResourseService {
	public boolean addResources(Resources res);
	public boolean updateResources(Integer resource_id,long resources_quantity);
	public Resources deleteResources(Integer resource_id);
	public List<Resources> displayAll();
	
	
	

}

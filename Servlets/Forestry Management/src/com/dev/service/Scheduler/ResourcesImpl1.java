package com.dev.service.Scheduler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import com.dev.beans.Resources;
import com.dev.dao.Scheduler.ResourcesImpl;
import com.dev.dao.Scheduler.ResourseDao;
import com.dev.beans.*;
import com.dev.repo.*;
public class ResourcesImpl1 implements ResourseService {
    ResourseDao res1 = new ResourcesImpl();
	@Override
	public boolean addResources(Resources res) {
	return res1.addResources(res);
	}

	@Override
	public boolean updateResources(Integer resource_id, long resources_quantity) {
		return res1.updateResources(resource_id, resources_quantity);
	}

	@Override
	public Resources deleteResources(Integer resource_id) {
		return res1.deleteResources(resource_id);
	}

	@Override
	public List<Resources> displayAll() {
		return res1.displayAll();
	}
   
	
	
}

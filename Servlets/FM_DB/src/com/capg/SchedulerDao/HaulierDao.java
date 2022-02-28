package com.capg.SchedulerDao;

import java.util.List;

import com.capg.beans.*;

public interface HaulierDao {
	public boolean addHaulier(Haulier h);
	public Haulier deleteHaulier(Integer haulierId);
	public Haulier assignedHaulier();
	public List<Haulier> displayAll();
	
	

}

package com.dev.service.Scheduler;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
import com.dev.beans.Contract;
import com.dev.beans.Haulier;
import com.dev.dao.Scheduler.HaulierDao;
import com.dev.dao.Scheduler.HaulierImpl;
import com.dev.repo.HaulierRepo;
public class HaulierImpl1 implements HaulierService {
HaulierDao haul = new HaulierImpl();
	@Override
	public boolean addHaulier(Haulier h) {
		return haul.addHaulier(h);
	}

	@Override
	public Haulier deleteHaulier(Integer haulierId) {
		return haul.deleteHaulier(haulierId);
	}

	@Override
	public Haulier assignedHaulier() {
		return haul.assignedHaulier();
	}

	@Override
	public List<Haulier> displayAll() {
		return haul.displayAll();
	}

	

}

package com.example.DemoGK.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoGK.entity.ChuyenBay;
import com.example.DemoGK.interfac.ChuyenBayDao;
import com.example.DemoGK.serviceImpl.ChuyenBayServiceImpl;


@Service
public class ChuyenBayService implements ChuyenBayServiceImpl{
	@Autowired
	private ChuyenBayDao chuyenBayDAOImpl;

	@Override
	public List<ChuyenBay> listChuyenBayDAD() {
		List<ChuyenBay> chuyenBays= new ArrayList<ChuyenBay>();
		chuyenBayDAOImpl.listChuyenBayDAD().forEach(chuyenBays::add);
		
		return chuyenBays;
	}

	
//	FROM openjdk:17-jdk-alpine
//
//	COPY target/DemoGK-0.0.1-SNAPSHOT.jar DemoGK-0.0.1-SNAPSHOT.jar
//
//	ENTRYPOINT ["java","-jar", "/DemoGK-0.0.1-SNAPSHOT.jar"]


	

	

	

}

package com.example.DemoGK.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoGK.entity.ChuyenBay;
import com.example.DemoGK.service.ChuyenBayService;



@RestController
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService chuyenBayService;
	@RequestMapping("/chuyenbay")
	public List<ChuyenBay> listChuyenBayDiDAD(){
	 return	chuyenBayService.listChuyenBayDAD();
	}
	
	

}

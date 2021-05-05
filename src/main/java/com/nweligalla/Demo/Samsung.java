package com.nweligalla.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("exynos")
	MobileProcessor cpu;
	
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}



	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



	public void config() {
		System.out.println("16GB, sAMOLED,");
		cpu.process();
	}

}

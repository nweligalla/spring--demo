package com.nweligalla.Demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Exynos implements MobileProcessor{
	
	public void process() {
		System.out.println("Exynos");
	}

}

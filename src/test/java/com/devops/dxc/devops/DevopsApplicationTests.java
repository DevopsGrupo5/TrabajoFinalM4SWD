package com.devops.dxc.devops;
import static org.junit.Assert.*;

import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.model.Util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {

	@Test
	void contextLoads() {
		
		//extrayendo el valor de dxc
		assertEquals(2400000,Util.getDxc(24000000, 2000000));
		assertEquals(4371450,Util.getDxc(94000000, 2500000));
		assertEquals(4371450,Util.getDxc(56000000, 900000));
		assertEquals(4371450,Util.getDxc(44000000, 1600000));	
		assertEquals(1000000,Util.getDxc(10000000, 600000));	
		//valor de la uf
		assertEquals(29143,Util.getUf());
        Dxc dxc=new Dxc(24000000, 2000000);
		assertEquals(24000000 ,dxc.getAhorro());
		Dxc dxc1=new Dxc(44000000, 1600000);
		assertEquals(44000000,dxc1.getAhorro());		
	}

}

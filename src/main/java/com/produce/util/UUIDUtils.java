package com.produce.util;

import java.util.UUID;

public class UUIDUtils {
	public  String getUUID(){
		return UUID.randomUUID().toString().replace("-", "").substring(0,10);
	}


}

package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeaterInfo {
	private String info;
	StringBuffer sb;
	
	public WeaterInfo() {
		sb = new StringBuffer();
		sb.append("서울, 37, 80, 맑음,");
		sb.append("대구, 43, 90, 지옥,");
		sb.append("부산, -32, 10, 눈,");
		sb.append("제주, 3, 40, 비");
		
	}
	
	public WeaterDTO [] makeWeater() {
		
		String a = sb.toString();
		System.out.println(sb);		
		WeaterDTO [] dtos = new WeaterDTO[4];
		a = a.trim();
		a = a.replace(" ", "");
		String [] infos = a.split(",");
		
		for(int i=0; i<infos.length; i++) {
			WeaterDTO weaterDTO = new WeaterDTO();
			
			if( i == 0) {
			weaterDTO.setCity(infos[0]);
			weaterDTO.setTemp(infos[1]);
			weaterDTO.setHum(infos[2]);
			weaterDTO.setCondition(infos[3]);
			dtos[i] = weaterDTO;
			}else if(i==1) {
				weaterDTO.setCity(infos[4]);
				weaterDTO.setTemp(infos[5]);
				weaterDTO.setHum(infos[6]);
				weaterDTO.setCondition(infos[7]);
				dtos[i] = weaterDTO;
			}else if(i==2){
				weaterDTO.setCity(infos[8]);
				weaterDTO.setTemp(infos[9]);
				weaterDTO.setHum(infos[10]);
				weaterDTO.setCondition(infos[11]);
				dtos[i] = weaterDTO;
			}else if(i==3) {
				weaterDTO.setCity(infos[12]);
				weaterDTO.setTemp(infos[13]);
				weaterDTO.setHum(infos[14]);
				weaterDTO.setCondition(infos[15]);
				dtos[i] = weaterDTO;
			}else {
				break;
			}
		}
		return dtos;	
	}
	
}

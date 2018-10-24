package org.zziggu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zziggu.mapper.T1Mapper;
import org.zziggu.mapper.T2Mapper;

import lombok.Setter;

@Service
public class SampleServiceImpl implements SampleService {

	@Setter(onMethod_=@Autowired)
	T1Mapper t1mapper;
	@Setter(onMethod_=@Autowired)
	T2Mapper t2mapper;
	
	@Override
	public Integer doAdd(String str1, String str2) throws Exception {
		// TODO Auto-generated method stub
		return Integer.parseInt(str1)+ Integer.parseInt(str2);
	}

	@Transactional
	@Override
	public void addMulti(String str) {
		
		t1mapper.insert(str);
		t2mapper.insert(str);
		
	}

}

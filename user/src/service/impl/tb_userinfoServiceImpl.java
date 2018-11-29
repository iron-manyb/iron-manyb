package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.tb_userinfo;
import mapper.tb_userinfoMapper;
import service.tb_userinfoService;

@Service
public class tb_userinfoServiceImpl implements tb_userinfoService {

	@Autowired
	tb_userinfoMapper userinfoMapper;
	
	@Override
	public List<tb_userinfo> quey(String name, Integer zt, Integer num, int count) {
		// TODO Auto-generated method stub
		return userinfoMapper.quey(name,zt,num,count);
	}

}

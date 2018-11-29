package service;

import java.util.List;

import entity.tb_userinfo;

public interface tb_userinfoService {

	List<tb_userinfo> quey(String name, Integer zt, Integer num, int count);



}

package mapper;

import java.util.List;

import javax.persistence.CollectionTable;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import entity.tb_userinfo;

public interface tb_userinfoMapper {

	
	
	@Select(" SELECT `tb_userinfo`.`userId`,`userAccount`,`password`,"
			+ "email,`status`,workDate FROM `tb_userinfo` ,`tb_role_user`,"
			+ "`tb_role` WHERE tb_userinfo.`userId` = `tb_role_user`.`userId` AND tb_role.`roleId` = `tb_role_user`.`roleId`"
			+ " GROUP BY `userAccount`"
			+ ""
        )
	@Results({
			@Result(id=true,property="userid",column="userid"),
			@Result(property="userAccount",column="userAccount"),
			@Result(property="password",column="password"),
			@Result(property="email",column="email"),
			@Result(property="status",column="status"),
			@Result(property="workDate",column="workDate"),
			@Result(property="list",column="userid",
            	javaType=List.class,many=@Many(select="mapper.tb_roleMapper.selectqx")		
				)
	})
	List<tb_userinfo> quey(@Param("name")String name,@Param("zt") Integer zt,@Param("num") Integer num,@Param("count") int count);

}

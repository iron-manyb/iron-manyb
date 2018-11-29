package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entity.tb_role;

public interface tb_roleMapper {
	
	
	@Select("  SELECT `tb_role`.* FROM `tb_role_user`,`tb_role` WHERE `tb_role`.`roleId` = `tb_role_user`.`roleId` "
			+ "AND userid= #{userid}")
     List<tb_role>  selectqx(@Param("userid")int userid);

}

package cn.tedu.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.tedu.sys.dao.SysRoleDao;
import cn.tedu.sys.vo.SysRoleMenuVo;

import javax.annotation.Resource;

@SpringBootTest
public class SysRoleDaoTests {

	 @Resource
	 private SysRoleDao sysRoleDao;
	 @Test
	 void testFindObjectById() {
		SysRoleMenuVo rm= sysRoleDao.findObjectById(47);
		System.out.println(rm);
		 
	 }
}

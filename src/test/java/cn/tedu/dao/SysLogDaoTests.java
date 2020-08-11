package cn.tedu.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.tedu.sys.dao.SysLogDao;
import cn.tedu.sys.entity.SysLog;

import javax.annotation.Resource;

@SpringBootTest
public class SysLogDaoTests {

	 @Resource
	 private SysLogDao sysLogDao;
	 
	 @Test
	 void testDeleteObjects() {
		 int rows=sysLogDao.deleteObjects();
		 System.out.println("delete.rows="+rows);
	 }
	 
	 @Test
	 void testGetRowCount() {
		 int rows=sysLogDao.getRowCount("admin");
		 System.out.println("rows="+rows);
	 }
	 @Test
	 void testFindPageObjects() {
		 List<SysLog> list=sysLogDao.findPageObjects("admin",0, 3);
		 for(SysLog log:list) {
			 System.out.println(log);
		 }
		 
	 }
}





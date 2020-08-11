package cn.tedu.dao;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.tedu.sys.dao.SysMenuDao;

import javax.annotation.Resource;

@SpringBootTest
public class SysMenuDaoTests {

	 @Resource
	 private SysMenuDao sysMenuDao;
	 
	 @Test
	 void testFindObjects() {
		 List<Map<String,Object>> list=sysMenuDao.findObjects();
		 System.out.println("list.size="+list.size());
		 for(Map<String,Object> map:list) {
			 System.out.println(map);
		 }
		 
	 }
}

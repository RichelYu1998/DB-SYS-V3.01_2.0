package cn.tedu.dao;

import java.util.List;

import cn.tedu.sys.vo.SysUserDeptVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.tedu.sys.dao.SysUserDao;

import javax.annotation.Resource;

@SpringBootTest
public class SysUserDaoTests {

	@Resource
	private SysUserDao sysUserDao;
	
	@Test
	void testGetRowCount() {
		int rowCount=
		sysUserDao.getRowCount("admin");
		System.out.println("rowCount="+rowCount);
	}
	
	@Test
	public void testFindPageObjects() {
		List<SysUserDeptVo> list=
		sysUserDao.findPageObjects(null, 0, 5);
		for(SysUserDeptVo user:list) {
			System.out.println(user);
		}
		
//		list.forEach(new Consumer<SysUserDeptVo>() {
//			@Override
//			public void accept(SysUserDeptVo t) {
//				System.out.println(t);
//			}
//		});
		//jdk8 lamda表达式
		//list.forEach((t)->System.out.println(t));
		//jdk8 中的新方法引用
		//list.forEach(System.out::println);
		
	}
	
	
}

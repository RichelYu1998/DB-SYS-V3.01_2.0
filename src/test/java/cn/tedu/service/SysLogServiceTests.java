package cn.tedu.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.tedu.common.vo.PageObject;
import cn.tedu.sys.entity.SysLog;
import cn.tedu.sys.service.SysLogService;

import javax.annotation.Resource;

@SpringBootTest
public class SysLogServiceTests {

	@Resource
	private SysLogService sysLogService;
	
	@Test
	void testFindPageObjects() {
	    PageObject<SysLog> pageObject=
		sysLogService.findPageObjects("admin", 1);
	    System.out.println("rowCount="+pageObject.getRowCount());
	    System.out.println("pageCount="+pageObject.getPageCount());
	    for(SysLog log:pageObject.getRecords()) {
	    	System.out.println(log);
	    }
	}
}

package cn.tedu.sys.controller;

import cn.tedu.sys.entity.SysMenu;
import cn.tedu.sys.service.SysMenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.common.vo.JsonResult;

import javax.annotation.Resource;

@RestController //@Controller+@ReponseBody
@RequestMapping("/menu/")
public class SysMenuController {

	@Resource
	private SysMenuService sysMenuService;
	
	@RequestMapping("doUpdateObject")
	public JsonResult doUpdateObject(SysMenu entity) {
		sysMenuService.updateObject(entity);
		return new JsonResult("update ok");
	}
	@RequestMapping("doSaveObject")
	public JsonResult doSaveObject(SysMenu entity) {
		sysMenuService.saveObject(entity);
		return new JsonResult("save ok");
	}
	
	@GetMapping("doFindZtreeMenuNodes")
    public JsonResult doFindZtreeMenuNodes() {
    	return new JsonResult(sysMenuService.findZtreeMenuNodes());
    } 
	
	@RequestMapping("doDeleteObject")
	public JsonResult doDeleteObject(Integer id) {
		sysMenuService.deleteObject(id);
		return new JsonResult("delete ok");
	}
	
	@GetMapping("doFindObjects")
	public JsonResult doFindObjects() {
		return new JsonResult(sysMenuService.findObjects());
	}
	
}

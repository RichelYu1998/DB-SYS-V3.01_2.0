package cn.tedu.sys.controller;

import cn.tedu.sys.entity.SysDept;
import cn.tedu.sys.service.SysDeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.common.vo.JsonResult;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dept/")
public class SysDeptController {
	@Resource
	private SysDeptService sysDeptService;
	@RequestMapping("doFindObjects")
	public JsonResult doFindObjects() {
		return new JsonResult(sysDeptService.findObjects());
	}
	@RequestMapping("doFindZTreeNodes")
	public JsonResult doFindZTreeNodes() {
		return new JsonResult(sysDeptService.findZTreeNodes());
	}
	
	@RequestMapping("doUpdateObject")
	public JsonResult doUpdateObject(SysDept entity){
		sysDeptService.updateObject(entity);
	    return new JsonResult("update ok");
	}
	
	@RequestMapping("doSaveObject")
	public JsonResult doSaveObject(SysDept entity){
		sysDeptService.saveObject(entity);
		return new JsonResult("save ok");
	}
	@RequestMapping("doDeleteObject")
	@ResponseBody
	public JsonResult doDeleteObject(Integer id){
		sysDeptService.deleteObject(id);
		return new JsonResult("delete ok");
	}
}

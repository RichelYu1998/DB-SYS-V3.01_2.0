package cn.tedu.sys.service;

import java.util.List;
import java.util.Map;

import cn.tedu.common.vo.Node;
import cn.tedu.sys.entity.SysDept;

public interface SysDeptService {
	 List<Map<String,Object>> findObjects();
	 List<Node> findZTreeNodes();
	 int saveObject(SysDept entity);
	 int updateObject(SysDept entity);
	 int deleteObject(Integer id);
}

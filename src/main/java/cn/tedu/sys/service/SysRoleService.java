package cn.tedu.sys.service;

import java.util.List;

import cn.tedu.sys.entity.SysRole;
import cn.tedu.sys.vo.SysRoleMenuVo;
import cn.tedu.common.vo.CheckBox;
import cn.tedu.common.vo.PageObject;

public interface SysRoleService {
	
	List<CheckBox> findObjects();
	/**
	 * 基于id查询角色以及角色对应的菜单id
	 * @param id
	 * @return
	 */
	SysRoleMenuVo findObjectById(Integer id);
	/**
	 * 保存角色自身信息以及角色对应的菜单id
	 * @param entity
	 * @param menuIds
	 * @return
	 */
	int saveObject(SysRole entity, Integer[]menuIds);
	/**
	 * 更新角色自身信息以及角色对应的菜单id
	 * @param entity
	 * @param menuIds
	 * @return
	 */
	int updateObject(SysRole entity,Integer[]menuIds);
	
	/**
	 * 基于角色id删除角色关系数据，角色自身信息
	 * @param id
	 * @return
	 */
	int deleteObject(Integer id);

	/**
	 * 查询当前页角色记录以及对应的分页信息
	 * @param name
	 * @param pageCurrent
	 * @return
	 */
	PageObject<SysRole> findPageObjects(String name,Integer pageCurrent);
}

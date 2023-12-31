package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.YonghulingyangEntity;
import com.entity.view.YonghulingyangView;
import com.service.YonghulingyangService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;


/**
 * 用户领养
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-16 09:02:05
 */
@RestController
@RequestMapping("/yonghulingyang")
@CrossOrigin(origins = "*",maxAge = 3600)
public class YonghulingyangController {
    @Autowired
    private YonghulingyangService yonghulingyangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, YonghulingyangEntity yonghulingyang, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yonghulingyang.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YonghulingyangEntity> ew = new EntityWrapper<YonghulingyangEntity>();
		PageUtils page = yonghulingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghulingyang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, YonghulingyangEntity yonghulingyang, HttpServletRequest request){
        EntityWrapper<YonghulingyangEntity> ew = new EntityWrapper<YonghulingyangEntity>();
		PageUtils page = yonghulingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghulingyang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonghulingyangEntity yonghulingyang){
       	EntityWrapper<YonghulingyangEntity> ew = new EntityWrapper<YonghulingyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonghulingyang, "yonghulingyang")); 
        return R.ok().put("data", yonghulingyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonghulingyangEntity yonghulingyang){
        EntityWrapper< YonghulingyangEntity> ew = new EntityWrapper< YonghulingyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonghulingyang, "yonghulingyang")); 
		YonghulingyangView yonghulingyangView =  yonghulingyangService.selectView(ew);
		return R.ok("查询用户领养成功").put("data", yonghulingyangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YonghulingyangEntity yonghulingyang = yonghulingyangService.selectById(id);
        return R.ok().put("data", yonghulingyang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YonghulingyangEntity yonghulingyang = yonghulingyangService.selectById(id);
        return R.ok().put("data", yonghulingyang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YonghulingyangEntity yonghulingyang, HttpServletRequest request){
    	yonghulingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghulingyang);

        yonghulingyangService.insert(yonghulingyang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YonghulingyangEntity yonghulingyang, HttpServletRequest request){
    	yonghulingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghulingyang);

        yonghulingyangService.insert(yonghulingyang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YonghulingyangEntity yonghulingyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonghulingyang);
        yonghulingyangService.updateById(yonghulingyang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yonghulingyangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
                         @PathVariable("type") String type, @RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YonghulingyangEntity> wrapper = new EntityWrapper<YonghulingyangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = yonghulingyangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

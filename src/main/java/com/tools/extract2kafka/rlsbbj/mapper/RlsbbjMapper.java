package com.tools.extract2kafka.rlsbbj.mapper;

import com.tools.extract2kafka.rlsbbj.entity.Rlsbbj;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Administrator
 * @since 2019-10-06
 */
public interface RlsbbjMapper extends BaseMapper<Rlsbbj> {

    int getTodayRlsbbjCount();
    @Select("select * from\n" +
            "(\n" +
            "select ROWNUM as id,t1.* from (\n" +
            "    select *  from (select distinct * from (select  XRSJ,BJSJ,XZQH,YHMC,YHDZ,AFDD,BJNR,GXDW,SSFJ,YJCZLX,RYLX,SFZH,XYRXM,XYRXB,PIC1,PIC2,PIC3,XZB,YZB,SBBH,SBLX from RLSBBJ))\n" +
            "where  to_char(BJSJ,'yyyy-mm-dd')=to_char(sysdate,'yyyy-MM-dd')\n" +
            "and (SFZH,BJSJ) in (\n" +
            "    select SFZH,max(BJSJ) from RLSBBJ\n" +
            "where  to_char(BJSJ,'yyyy-mm-dd')=to_char(sysdate,'yyyy-MM-dd')\n" +
            "group by SFZH)\n" +
            "order by BJSJ desc) t1\n" +
            "    )\n" +
            "where id >${(pageNum-1)*pageSize} and id <=${pageSize*pageNum}")
    List<Rlsbbj> selectRlsbbjByPage(int pageNum, int pageSize);

}

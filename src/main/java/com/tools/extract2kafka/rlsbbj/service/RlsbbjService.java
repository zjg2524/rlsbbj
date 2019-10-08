package com.tools.extract2kafka.rlsbbj.service;

import com.tools.extract2kafka.rlsbbj.entity.Rlsbbj;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tools.extract2kafka.rlsbbj.vo.RlsbbjVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Administrator
 * @since 2019-10-06
 */
public interface RlsbbjService {

    RlsbbjVO getRlsbbjInfo(int pageNum, int pageSize);

    List<Rlsbbj> getRlsbbjAtlatest (int pageNum, int pageSize);
}

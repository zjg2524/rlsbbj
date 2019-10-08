package com.tools.extract2kafka.rlsbbj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tools.extract2kafka.common.util.TimeUtils;
import com.tools.extract2kafka.rlsbbj.entity.Rlsbbj;
import com.tools.extract2kafka.rlsbbj.mapper.RlsbbjMapper;
import com.tools.extract2kafka.rlsbbj.service.RlsbbjService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tools.extract2kafka.rlsbbj.vo.RlsbbjVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Administrator
 * @since 2019-10-06
 */
@Service(value = "rlsbbjService01")
@Slf4j
public class RlsbbjServiceImpl implements RlsbbjService {

    @Autowired
    RlsbbjMapper rlsbbjMapper;
    @Override
    public RlsbbjVO getRlsbbjInfo(int pageNum, int pageSize) {
        List<Rlsbbj> rlsbbjsAtlatest = getRlsbbjAtlatest(pageNum, pageSize);
        int todayRlsbbjCount = rlsbbjMapper.getTodayRlsbbjCount();
        RlsbbjVO rlsbbjVO = new RlsbbjVO();
        rlsbbjVO.setCount(todayRlsbbjCount);
        rlsbbjVO.setRlsbbjs(rlsbbjsAtlatest);
        log.info("关注人员resultVO："+rlsbbjVO);
        return rlsbbjVO;
    }
//    @Override
//    public List<Rlsbbj> getRlsbbjAtlatest(int pageNum, int pageSize) {
//        QueryWrapper<Rlsbbj> rlsbbjQueryWrapper = new QueryWrapper<>();
//        rlsbbjQueryWrapper.ge(Rlsbbj.BJSJ, LocalDate.now());
//        rlsbbjQueryWrapper.orderByDesc(Rlsbbj.BJSJ);
////        List<Rlsbbj> rlsbbjs = rlsbbjMapper.selectList(rlsbbjQueryWrapper);
//        IPage<Rlsbbj> rlsbbjIPage = rlsbbjMapper.selectPage(new Page<>(pageNum, pageSize), rlsbbjQueryWrapper);
//        List<Rlsbbj> records = rlsbbjIPage.getRecords();
//
//        log.info("最新的关注人员信息："+records);
//        return records;
//    }

    @Override
    public List<Rlsbbj> getRlsbbjAtlatest(int pageNum, int pageSize) {
        List<Rlsbbj> records = rlsbbjMapper.selectRlsbbjByPage(pageNum, pageSize);
        return records;
    }
}

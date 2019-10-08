package com.tools.extract2kafka.rlsbbj.controller;


import com.tools.extract2kafka.common.util.Result;
import com.tools.extract2kafka.rlsbbj.service.RlsbbjService;
import com.tools.extract2kafka.rlsbbj.vo.RlsbbjVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Administrator
 * @since 2019-10-06
 */
@RestController
@RequestMapping("/api/kunming")
@CrossOrigin
public class RlsbbjController {

    @Resource(name = "rlsbbjService01")
    RlsbbjService rlsbbjService;
    @GetMapping("/rlsbbj")
    public Result getRlsbInfo(int pageNum, int pageSize){
        RlsbbjVO rlsbbjInfo = rlsbbjService.getRlsbbjInfo(pageNum, pageSize);
        Result<RlsbbjVO> result = Result.success(rlsbbjInfo);
        return  result;
    }
}


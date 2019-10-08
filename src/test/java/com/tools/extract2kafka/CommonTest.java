package com.tools.extract2kafka;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tools.extract2kafka.rlsbbj.entity.Rlsbbj;
import com.tools.extract2kafka.rlsbbj.mapper.RlsbbjMapper;
import com.tools.extract2kafka.rlsbbj.service.RlsbbjService;
import com.tools.extract2kafka.rlsbbj.vo.RlsbbjVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonTest {

   @Autowired
   RlsbbjMapper rlsbbjMapper;

   @Resource(name = "rlsbbjService01")
    RlsbbjService rlsbbjService;
   @Test
   public void test01(){
       List<Rlsbbj> rlsbbjs = rlsbbjMapper.selectList(null);
       System.out.println(rlsbbjs);
       for (Rlsbbj rlsbbj : rlsbbjs) {
           System.out.println(rlsbbj);
       }
   }

   @Test
    public void test02(){
       QueryWrapper<Rlsbbj> rlsbbjQueryWrapper = new QueryWrapper<>();
       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       LocalDate now = LocalDate.now();
       LocalDate localDate = now.minusDays(1);
       System.out.println(localDate);
       rlsbbjQueryWrapper.ge(Rlsbbj.BJSJ, localDate);
       rlsbbjQueryWrapper.groupBy(Rlsbbj.SFZH);
//       List<Rlsbbj> rlsbbjs = rlsbbjMapper.selectList(rlsbbjQueryWrapper);
//       for(Rlsbbj rlsbbj: rlsbbjs){
//           System.out.println(rlsbbj);
//       }

   }


    @Test
    public void test03(){

        List<Rlsbbj> rlsbbjs = rlsbbjMapper.selectRlsbbjByPage(1, 5);
        for (Rlsbbj rlsbbj : rlsbbjs) {

            System.out.println(rlsbbjs);
        }
    }


    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toString());
    }

}

package com.tools.extract2kafka.rlsbbj.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Administrator
 * @since 2019-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rlsbbj")
public class Rlsbbj extends Model<Rlsbbj> {

    private static final long serialVersionUID = 1L;

    private String bjbh;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime xrsj;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime bjsj;

    private String xzqh;

    private String yhmc;

    private String yhdz;

    private String afdd;

    private String bjnr;

    private String gxdw;

    private String ssfj;

    private String yjczlx;

    private String rylx;

    private String sfzh;

    private String xyrxm;

    private String xyrxb;

    private String pic1;

    private String pic2;

    private String pic3;

    private String pic4;

    private String pic5;

    private String pic6;

    private String pic7;

    private String pic8;

    private String pic9;

    private String pic10;

    private String vid1;

    private String vid2;

    private String vid3;

    private String vid4;

    private String vid5;

    private String vid6;

    private String vid7;

    private String vid8;

    private String vid9;

    private String vid10;

    private String xzb;

    private String yzb;

    private String sbbh;

    private String sblx;

    private String ydbz;

    private LocalDateTime dqsj;


    public static final String BJBH = "BJBH";

    public static final String XRSJ = "XRSJ";

    public static final String BJSJ = "BJSJ";

    public static final String XZQH = "XZQH";

    public static final String YHMC = "YHMC";

    public static final String YHDZ = "YHDZ";

    public static final String AFDD = "AFDD";

    public static final String BJNR = "BJNR";

    public static final String GXDW = "GXDW";

    public static final String SSFJ = "SSFJ";

    public static final String YJCZLX = "YJCZLX";

    public static final String RYLX = "RYLX";

    public static final String SFZH = "SFZH";

    public static final String XYRXM = "XYRXM";

    public static final String XYRXB = "XYRXB";

    public static final String PIC1 = "PIC1";

    public static final String PIC2 = "PIC2";

    public static final String PIC3 = "PIC3";

    public static final String PIC4 = "PIC4";

    public static final String PIC5 = "PIC5";

    public static final String PIC6 = "PIC6";

    public static final String PIC7 = "PIC7";

    public static final String PIC8 = "PIC8";

    public static final String PIC9 = "PIC9";

    public static final String PIC10 = "PIC10";

    public static final String VID1 = "VID1";

    public static final String VID2 = "VID2";

    public static final String VID3 = "VID3";

    public static final String VID4 = "VID4";

    public static final String VID5 = "VID5";

    public static final String VID6 = "VID6";

    public static final String VID7 = "VID7";

    public static final String VID8 = "VID8";

    public static final String VID9 = "VID9";

    public static final String VID10 = "VID10";

    public static final String XZB = "XZB";

    public static final String YZB = "YZB";

    public static final String SBBH = "SBBH";

    public static final String SBLX = "SBLX";

    public static final String YDBZ = "YDBZ";

    public static final String DQSJ = "DQSJ";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}

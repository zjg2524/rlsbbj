package com.tools.extract2kafka.rlsbbj.vo;

import com.tools.extract2kafka.rlsbbj.entity.Rlsbbj;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RlsbbjVO{

    private int count;
    private List<Rlsbbj> rlsbbjs = new ArrayList<>();
}

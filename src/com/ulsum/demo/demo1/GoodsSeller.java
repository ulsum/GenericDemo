package com.ulsum.demo.demo1;

import java.util.List;

public class GoodsSeller {

    public void sellGoods(List<? extends Goods> goods) {   // 保证GoodsTest的子类泛型可以成功传入
        // 调用集合中的sell方法
        for (Goods g : goods) {
            g.sell();
        }
    }

}

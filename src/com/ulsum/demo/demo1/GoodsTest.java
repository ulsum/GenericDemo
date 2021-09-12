package com.ulsum.demo.demo1;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {

    public static void main(String[] args) {
        // 定义books相关的list
        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books());
        booksList.add(new Books());
        // 定义clothes相关的list
        List<Clothes> clothesList = new ArrayList<>();
        clothesList.add(new Clothes());
        clothesList.add(new Clothes());
        // 定义shoes相关的list
        List<Shoes> shoesList = new ArrayList<>();
        shoesList.add(new Shoes());
        shoesList.add(new Shoes());

        GoodsSeller gs = new GoodsSeller();
        gs.sellGoods(booksList);
    }

}

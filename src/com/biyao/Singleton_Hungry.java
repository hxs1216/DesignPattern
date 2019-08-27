package com.biyao;

/**
 * Title: TODO
 * Description: TODO
 * Copyright: Copyright (c) 2019
 * Company: TaoQiCar Co., Ltd.
 * Create Time: 2019/8/22
 *
 * @author hxs
 * @email huangxiaosheng@xxfqc.com
 * Update Time:
 * Updater:
 * Update Comments:
 */
public class Singleton_Hungry {
    

}
class Singleton{

    //构造器私有化
    private Singleton(){

    }

    //内部创建对象实例
    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
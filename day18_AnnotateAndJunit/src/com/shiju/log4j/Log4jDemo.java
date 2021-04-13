package com.shiju.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shiju
 * @date 2021/04/13 15:33
 **/
public class Log4jDemo {
    //弊端:如果以后我们更换日志的实现类,那么下面的代码就需要跟着改
    //不推荐使用
    //private static final Logger LOGGER = Logger.getLogger(Log4JDemo.class);

    //使用slf4j里面的api来获取日志的对象
    //好处:如果以后我们更换日志的实现类,那么下面的代码不需要跟着修改
    //推荐使用
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        //1.导入jar包
        //2.编写配置文件
        //3.在代码中获取日志对象
        //4.按照日志级别设置日志信息
        LOGGER.debug("debug级别的日志");
        LOGGER.info("info级别的日志");
        LOGGER.warn("warn级别的日志");
        LOGGER.error("error级别的日志");
    }
}

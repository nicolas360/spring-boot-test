package com.zhuc.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by ZHUC on 2015/6/16.
 */
@Component
@Lazy(false)
public class MyTask {

    private static final Logger logger = LoggerFactory.getLogger(MyTask.class);

    @PostConstruct
    public void init(){
        while (true){
            try {
                Thread.sleep(3000l);

                logger.debug(""+new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

package com.xiaoxuan;

import com.xiaoxuan.service.PayService;

import java.util.ServiceLoader;

/**
 * description

     服务规范:
     1. 当服务提供者提供了接口的一种具体实现之后，在jar包的 META-INF/services 目录下 创建一个以 “接口全类名” 为命名的文件，内容为实现类的全类名
     2. 接口实现类所在的jar包放在主程序的classpath中
     3. 主程序通过 java.util.ServiceLoader 动态装载实现模块，通过扫描META-INF/services目录下的配置文件找到全类名，加载到JVM中
     4. 接口实现类必须携带一个不带参数的构造方法

 * Created by xiexiaoxuan on 2020/11/28.
 */
public class Main {

    public static void main(String[] args){

        ServiceLoader<PayService> res = ServiceLoader.load(PayService.class);
        for(PayService service: res){
            service.pay();
        }
    }
}

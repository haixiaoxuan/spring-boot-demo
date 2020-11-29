package com.service;

import com.xiaoxuan.service.PayService;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/28.
 */
public class WXPayImpl implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}

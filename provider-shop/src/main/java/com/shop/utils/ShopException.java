package com.shop.utils;

import com.common.utils.CommonException;

public class ShopException extends CommonException {
    private static final long serialVersionUID = 5124466783350227901L;

    public ShopException() {
        super();
    }

    public ShopException(String message) {
        this.setMsg(message);
    }

}
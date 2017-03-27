package com.springsessionserver;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by seckink on 3/24/2017.
 */
public class Initializer extends AbstractHttpSessionApplicationInitializer {

    public Initializer() {
        super(Config.class);
    }
}

package com.learn.config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/test/resources/config.properties")
public interface FrameWorkConfig extends Config {
    String url();
    long timeout();
    String browserName();
}

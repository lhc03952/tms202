package com.msemu.core.configs;

import com.msemu.commons.config.annotation.ConfigComments;
import com.msemu.commons.config.annotation.ConfigFile;
import com.msemu.commons.config.annotation.ConfigProperty;

/**
 * Created by Weber on 2018/3/14.
 */
@ConfigFile(name = "configs/Login.properties")
public class LoginConfig {


    @ConfigComments(comment = { "Automatic registration for accounts.", "Default: false" })
    @ConfigProperty(name = "login.accounts.autoreg", value = "false")
    public static boolean AUTO_REGISTRATION;

}

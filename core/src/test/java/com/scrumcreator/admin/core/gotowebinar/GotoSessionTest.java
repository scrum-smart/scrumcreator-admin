package com.scrumcreator.admin.core.gotowebinar;

import com.citrix.gotocorelib.api.common.ApiException;
import org.junit.Test;

/**
 * Created by VMoskalenko on 06.01.2017.
 */
public class GotoSessionTest {

    @Test
    public void testConnection() throws ApiException {
        SpringGotoConfig session = new SpringGotoConfig();
        session.webinar();
    }

}

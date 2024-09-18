package com.yviet.app.admin.y_viet_admin.common.util;
 import java.util.UUID;

 /**
 * UniqueID -
 *
 * @param
 * @return
 * @throws
 */
public class UniqueID {
    /**
     * 128 bit UUID
     */
    public static synchronized String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
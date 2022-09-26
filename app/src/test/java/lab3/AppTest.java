/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void permissionLevelSet() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals("Get method must return String as return type",permissionManager.get().getClass(), String.class);
        assertEquals("Initial Value must be USER", "USER", permissionManager.get());
        permissionManager.set(PermissionLevel.USER);
        assertEquals("Must set to USER when default value is USER", "USER",permissionManager.get());
        permissionManager.set(PermissionLevel.ADMIN);
        assertEquals("Must set to ADMIN", "ADMIN", permissionManager.get());
        permissionManager.set(PermissionLevel.ADMIN);
        assertEquals("Must change nothing - ADMIN should persist as a value of the variable", "ADMIN", permissionManager.get());
        permissionManager.set(PermissionLevel.DEVELOPER);
        assertEquals("Must change to DEVELOPER", "DEVELOPER", permissionManager.get());
        permissionManager.set(PermissionLevel.USER);
        assertEquals("Must change to USER", "USER", permissionManager.get());
    }

}

package org.skyscreamer.yoga.demo.test.springmvc;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.skyscreamer.yoga.demo.test.AlbumControllerTest;
import org.skyscreamer.yoga.demo.test.ArtistControllerTest;
import org.skyscreamer.yoga.demo.test.SongControllerTest;
import org.skyscreamer.yoga.demo.test.UserControllerTest;
import org.skyscreamer.yoga.util.JacksonLibraryUtil;

@RunWith(Suite.class)
@SuiteClasses({ AlbumControllerTest.class, ArtistControllerTest.class, SongControllerTest.class,
        UserControllerTest.class })
public class SpringMVCTestJackson2
{
    @BeforeClass
    public static void startServer() throws Exception
    {
		System.setProperty(JacksonLibraryUtil.SYSTEM_PROPERTY, JacksonLibraryUtil.JACKSON2);
        RunServer.startServer();
    }
}

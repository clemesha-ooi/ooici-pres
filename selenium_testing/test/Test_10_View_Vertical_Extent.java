package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Test_10_View_Vertical_Extent extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://buildbot.oceanobservatories.org:9443/");
		selenium.start();
	}

	@Test
	public void test_10_View_Vertical_Extent() throws Exception {
                selenium.open("/ooici-pres-0.1/index.html");
                selenium.click("id=login_button");
                selenium.waitForPageToLoad("30000");
                for (int second = 0;; second++) {
                        if (second >= 60) fail("timeout");
                        try { if (selenium.isTextPresent("Select An Identity Provider:")) break; } catch (Exception e) {}
                        Thread.sleep(1000);
                }

                selenium.click("id=wayflogonbutton");
                selenium.waitForPageToLoad("30000");
                for (int second = 0;; second++) {
                        if (second >= 60) fail("timeout");
                        try { if (selenium.isTextPresent("Cilogon.org is asking for some information from your Google Account. To see and approve the request, sign in.")) break; } catch (Exception e) {}
                        Thread.sleep(1000);
                }

                selenium.uncheck("id=PersistentCookie");
                selenium.type("id=Email", "U_S_E_R-N_A_M_E_1");
                selenium.type("id=Passwd", "P_A_S_S-W_O_R_D_1");
                selenium.click("id=signIn");
                selenium.waitForPageToLoad("30000");
                for (int second = 0;; second++) {
                        if (second >= 60) fail("timeout");
                        try { if (selenium.isTextPresent("Showing 1 to 8 of 8 entries")) break; } catch (Exception e) {}
                        Thread.sleep(1000);
                }





/*
		selenium.open("/ooici-pres-0.1/");
		selenium.click("guest_button");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Showing 1 to 8 of 8 entries")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
*/
		selenium.click("radioAllPubRes");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Showing 1 to 8 of 8 entries")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("radioAllPubRes");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Showing 1 to 8 of 8 entries")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("//tr[@id='3319A67F-81F3-424F-8E69-4F28C4E04806']/td[1]");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("7723 Moanalua RG No 1 at alt 1000 ft")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("radioAltitudeDefined");
		selenium.type("ge_altitude_ub", "1");
		selenium.type("ge_altitude_lb", "30");
		selenium.click("vertical_extent_above");
		selenium.click("apply_filter_button");
		selenium.click("radioAllPubRes");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("HYCOM archive file")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("(urn:ioos:station:wmo:48900)")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Showing 1 to 3 of 3 entries")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

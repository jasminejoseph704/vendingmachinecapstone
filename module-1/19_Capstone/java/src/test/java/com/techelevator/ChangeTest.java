package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChangeTest {

	
	 private Transaction changeMaker;

	    @Before
	    public void setUp() throws Exception {
	        changeMaker = new Transaction();
	    }

	    @Test
	    public void giveChange() {


	       // Assert.assertEquals("1 Dime returned.", changeMaker.giveChange());
	       // Assert.assertEquals("2 Quarters returned.", changeMaker.giveChange(), changeMaker);
	      //  Assert.assertEquals("1 Dime returned.", changeMaker.giveChange(), changeMaker);
	    }

	    @Test
	    public void make_multiple_denominations() {
	      //  Assert.assertEquals("2 Quarters 1 Nickel returned.", changeMaker.giveChange(new BigDecimal(0.55)));
	      //  Assert.assertEquals("2 Quarters 2 Dimes returned.", changeMaker.giveChange(new BigDecimal(0.70)));
	    }

	}
package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;

public class DynamicControlsPageTest extends BaseTest {
	
	/**
     * Unit Test: Verify that the checkbox is removed and reappears correctly.
     */
	@Test
    public void verifyCheckboxRemovalAndReappearance() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);

        // Paso 1: Remover el checkbox
        dynamicControlsPage.clickRemoveButton();
        Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's gone!");
        Assert.assertFalse(dynamicControlsPage.isCheckboxDisplayed(), "The checkbox should be removed");

        // Paso 2: Agregar el checkbox nuevamente
        dynamicControlsPage.clickAddButton();
        Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's back!");
        Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed(), "The checkbox should be visible again");
    }
	
    /**
     * * Unit Test: Verifies that the input can be enabled and disabled correctly.
     */
    @Test
    public void verifyInputEnableFunctionality() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);

        // Paso 1: Verificar estado inicial
        Assert.assertFalse(dynamicControlsPage.isInputEnabled(), "Input should be disabled at startup");
     

        // Paso 2: Habilitar el input
        dynamicControlsPage.clickEnableButton();
        Assert.assertEquals(dynamicControlsPage.getMessageTextForInput(), "It's enabled!");
        
        Assert.assertTrue(dynamicControlsPage.isInputEnabled(), "The input should be enabled");
        
        // Paso 3: DesHabilitar el input
        dynamicControlsPage.clickDisableButton();
        Assert.assertEquals(dynamicControlsPage.getMessageTextForInput(), "It's disabled!");  
    }
    
    /**
     * * E2E Test: Complete interaction flow with checkbox and input at the same time .. !
     * 
     */
}

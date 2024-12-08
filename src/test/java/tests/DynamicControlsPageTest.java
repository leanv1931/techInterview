package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DynamicControlsPage;

public class DynamicControlsPageTest extends BaseTest {
	
	
	/**
     * Unit Test: Verifica que el checkbox se elimina y reaparece correctamente.
     */
	@Test
    public void verifyCheckboxRemovalAndReappearance() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);

        // Paso 1: Remover el checkbox
        dynamicControlsPage.clickRemoveButton();
        Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's gone!");
        Assert.assertFalse(dynamicControlsPage.isCheckboxDisplayed(), "El checkbox debería estar eliminado.");

        // Paso 2: Agregar el checkbox nuevamente
        dynamicControlsPage.clickAddButton();
        Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's back!");
        Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed(), "El checkbox debería estar visible nuevamente.");
    }
	

    /**
     * Unit Test: Verifica que el input pueda habilitarse y deshabilitarse correctamente.
     */
    @Test
    public void verifyInputEnableFunctionality() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);

        // Paso 1: Verificar estado inicial
        Assert.assertFalse(dynamicControlsPage.isInputEnabled(), "El input debería estar deshabilitado al inicio.");
     

        // Paso 2: Habilitar el input
        dynamicControlsPage.clickEnableButton();
        Assert.assertEquals(dynamicControlsPage.getMessageTextForInput(), "It's enabled!");
        
        Assert.assertTrue(dynamicControlsPage.isInputEnabled(), "El input debería estar habilitado.");
        
        // Paso 3: DesHabilitar el input
        dynamicControlsPage.clickDisableButton();
        Assert.assertEquals(dynamicControlsPage.getMessageTextForInput(), "It's disabled!");  
    }
    
    /**
     * E2E Test: Flujo completo de interacción con checkbox e input.
     */
    
	/*
	 * @Test public void fullDynamicControlsTest() { DynamicControlsPage
	 * dynamicControlsPage = new DynamicControlsPage(driver);
	 * 
	 * // Parte 1: Interacción con el checkbox
	 * dynamicControlsPage.clickRemoveButton();
	 * Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's gone!");
	 * Assert.assertFalse(dynamicControlsPage.isCheckboxDisplayed(),
	 * "El checkbox debería estar eliminado.");
	 * 
	 * dynamicControlsPage.clickAddButton();
	 * Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's back!");
	 * Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed(),
	 * "El checkbox debería estar visible nuevamente.");
	 * 
	 * // Parte 2: Interacción con el input
	 * Assert.assertFalse(dynamicControlsPage.isInputEnabled(),
	 * "El input debería estar deshabilitado inicialmente.");
	 * dynamicControlsPage.clickEnableButton();
	 * Assert.assertEquals(dynamicControlsPage.getMessageTextForInput(),
	 * "It's enabled!"); Assert.assertTrue(dynamicControlsPage.isInputEnabled(),
	 * "El input debería estar habilitado."); }
	 */


    

	
	  
	 

	 


	

}

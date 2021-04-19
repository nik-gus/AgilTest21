package com.prestashop.pages.order;

import org.openqa.selenium.By;


public class OrderPage {



    public static final String URL_PATH_ORDER =
            "/en/order";
    public static final String PAGE_TITLE_ORDER_CONFIRMATION =
            "Order confirmation";



    private OrderActController act;
    private OrderVerifyController verify;

    private OrderPage() {
        // hidden
    }

    private OrderPage(OrderActController act, OrderVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static OrderPage getOrderPage() {
        return new OrderPage(new OrderActController(), new OrderVerifyController());
    }

    public OrderActController act() { return act; }
    public OrderVerifyController verify() { return verify; }

    public static By addressTextField() { return By.name("address1"); }
    public static By postalCodeTextField() { return By.name("postcode"); }
    public static By cityTextField() { return By.name("city"); }

    public static By addressesContinueButton() { return By.name("confirm-addresses"); }

    public static By shippingContinueButton() { return By.name("confirmDeliveryOption"); }


    public static By payByBankWireRadioButton() { return By.id("payment-option-2"); }
    public static By agreeToTermsOfServiceCheckBox() { return By.id("conditions_to_approve[terms-and-conditions]"); }
    public static By paymentConfirmationButton() { return By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button"); }

    public static By orderConfirmationMessage() { return By.xpath("//h3[@class='h1 card-title']"); }

    /* PERSONAL INFORMATION ELEMENTS */
    // possible refactoring to abstract page class
    public static By socialTitleMr() { return By.xpath("//*[@id='customer-form']/section/div[1]/div[1]/label[1]/span/input"); }
    public static By socialTitleMrs() { return By.xpath("//*[@id='customer-form']/section/div[1]/div[1]/label[2]/span/input"); }
    public static By firstNameField() { return By.name("firstname"); }
    public static By lastNameField() { return By.name("lastname"); }
    public static By emailField() { return By.name("email"); }
    public static By agreeToTermsAndConditionsCheckBox() { return By.name("psgdpr"); }
    public static By personalInformationContinueButton() { return By.cssSelector("[data-link-action='register-new-customer']"); }
}

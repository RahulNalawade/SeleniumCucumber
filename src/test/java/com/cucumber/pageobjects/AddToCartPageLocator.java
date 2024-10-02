package com.cucumber.pageobjects;



public class AddToCartPageLocator {
	
	public static final String FIRST_PRODUCT = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[1]";
	public static final String FIRST_ADD_TO_CART = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]";
	public static final String SECOND_PRODUCT ="(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[3]";
	public static final String SECOND_ADD_TO_CART ="(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]";
	public static final String VIEW_CART="//u[normalize-space()='View Cart']";
	public static final String FIRST_PRODUCT_PRICE="tr[id='product-1'] td[class='cart_price'] p";
	public static final String SECOND_PRODUCT_PRICE="tr[id='product-2'] td[class='cart_price'] p";
	public static final String FIRST_PRODUCT_QUANTITY="tr[id='product-1'] button[class='disabled']";
	public static final String SECOND_PRODUCT_QUANTITY="tr[id='product-2'] button[class='disabled']";
	public static final String FIRST_PRODUCT_TOTAL="tr[id='product-1'] p[class='cart_total_price']";
	public static final String SECOND_PRODUCT_TOTAL="tr[id='product-2'] p[class='cart_total_price']";
	public static final String FIRST_PRODUCT_NAME_CART="a[href='/product_details/1']";
	public static final String SECOND_PRODUCT_NAME_CART="a[href='/product_details/2']";
	public static final String SECOND_PRODUCT_NAME="//div[@class='overlay-content']//p[contains(text(),'Men Tshirt')]";
	public static final String FIRST_PRODUCT_NAME="//div[@class='overlay-content']//p[contains(text(),'Blue Top')]";
	public static final String PRODUCT_LINK="//a[@href='/products']";
	public static final String PROCEED_TO_CHECKOUT="//a[@class='btn btn-default check_out']";

	
}

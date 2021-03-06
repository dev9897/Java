package com.dominhquan.uri;

public class AppRestUri {

	public static final String get_item = "/rest/item/{id}";
	public static final String delete_item = "/rest/item/delete/{id}";
	public static final String update_item = "/rest/update_item";
	public static final String get_all_hot_items = "rest/items";
	public static final String get_all_restaurant = "rest/restaurants";
	public static final String get_all_items_in_restaurant = "rest/store/{name}";
	public static final String get_all_orders_in_restaurant = "rest/store/order/{code}";
	public static final String get_all_orders_by_user = "rest/user/order/{name}";
	public static final String create_item = "rest/item/create";
	public static final String create_order = "rest/create_order";
	public static final String update_order = "rest/update_order";
	public static final String check_account = "rest/check";

	public static final String get_restaurant_info = "rest/restaurant/{id}";
	public static final String get_order_menu_info = "rest/order/{id}";
	public static final String import_test_data = "rest/import";
}

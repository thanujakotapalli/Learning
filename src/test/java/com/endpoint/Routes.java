package com.endpoint;

public class Routes {
	 /*swagger=https://petstore.swagger.io/v2
	  * create user(post):https://petstore.swagger.io/v2/user 
	  * get user(get):https://petstore.swagger.io/v2/user/{username}
	  * update user(update or put):https://petstore.swagger.io/v2/user/{username}
	  * delete user(delete):https://petstore.swagger.io/v2/user/{username}
	  * {crud( means create ,update ,retreive table like put post) }*/
	//user module
	public static String base_url="https://petstore.swagger.io/v2";
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String put_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";
	
}

module com.kren.hello.world {
	requires spring.boot;
	opens com.kren.hello.world to spring.core, spring.beans, spring.context, spring.web;
}

/*
OR

open module com.kren.hello.world {
	requires spring.boot;	
}
*/

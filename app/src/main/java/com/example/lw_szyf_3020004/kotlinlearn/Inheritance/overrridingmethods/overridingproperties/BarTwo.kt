package com.example.lw_szyf_3020004.kotlinlearn.Inheritance.overrridingmethods.overridingproperties


/**
 * You can also override a val property with a var property, but not vice versa. This is allowed because a val property essentially declares a getter method, and overriding it as a var additionally declares a setter method in the derived class.

Note that you can use the override keyword as part of the property declaration in a primary constructor.
 */
class BarTwo :Foo{

    override var count: Int=0;

}
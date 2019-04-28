package com.example.lw_szyf_3020004.kotlinlearn.Inheritance.rule


/**
 * In Kotlin, implementation inheritance is regulated by the following rule: if a class inherits many implementations of the same member from its immediate superclasses, it must override this member and provide its own implementation (perhaps, using one of the inherited ones). To denote the supertype from which the inherited implementation is taken, we use super qualified by the supertype name in angle brackets, e.g. super<Base>:
 */

class C():A(),B {
    override fun f() {
        super<A>.f()// call to A.f()
        super<B>.f()//call to B.f()
    }
}
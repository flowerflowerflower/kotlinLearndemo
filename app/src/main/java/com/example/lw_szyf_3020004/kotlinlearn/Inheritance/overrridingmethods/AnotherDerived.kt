package com.example.lw_szyf_3020004.kotlinlearn.Inheritance.overrridingmethods


/**
 *The override modifier is required for Derived.v().
 * If it were missing, the compiler would complain.
 * If there is no open modifier on a function, like Base.nv(),
 * declaring a method with the same signature in a subclass is illegal, either with override or without it.
 * The open modifier has no effect when added on members of a final class (i.e.. a class with no open modifier).
 *
 *

A member marked override is itself open, i.e. it may be overridden in subclasses. If you want to prohibit re-overriding, use final:
 */
open  class AnotherDerived():Base() {
   final override fun v() {
        super.v()
    }
}
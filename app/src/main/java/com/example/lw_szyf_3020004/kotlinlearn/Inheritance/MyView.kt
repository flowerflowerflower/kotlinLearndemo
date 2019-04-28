package com.example.lw_szyf_3020004.kotlinlearn.Inheritance

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 *  *
 *
If the class has no primary constructor,
then each secondary constructor has to initialize the base type using the super keyword,
or to delegate to another constructor which does that. Note that in this case different secondary constructors can call different constructors of the base type:
 */
class MyView : View {

    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)

}
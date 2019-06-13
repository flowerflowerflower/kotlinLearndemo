## Kotlin

在kt 文件中：
* internal const val xxx=xxxx  表示在该Module 下都可以正常使用，类似静态变量


第二点问题：

静态方法 或者静态变量
companion  object{

}

```
companion object {
        fun newInstance(wechatId: String): Fragment = BindWechatFragment().apply {
            arguments = Bundle().apply {  设置  Bundle 对象的相关内容
                putString(WECHAT_ID, wechatId)
            }
        }
    }
```

在获取某个变量的的值时，做额外的处理，更好的对相关数据进行处理
```
private val _wechatId
        get() = arguments?.getString(WECHAT_ID) ?: ""  //核心是get() //仅仅在左边的表达式结果为空时才会计算?:后面的表达式
```


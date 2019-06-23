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

在kotlin 中使用

![kotlin中width的使用](https://github.com/flowerflowerflower/kotlinLearndemo/blob/master/learnenglis/source/image/1560409327.jpg?raw=true)

----------


关于 inline 和 reifeid



![kotlin中width的使用](https://github.com/flowerflowerflower/kotlinLearndemo/blob/master/learnenglis/source/image/1560410381.jpg?raw=true)

----------
什么是inline  编译的时候 直接替换插入方法类的代码

什么是 reifeid  具体化


>具体化泛型传入的类型,知道该泛型类型所对应真正的类型.


## data 类的好处
> 相对java 如果你声明了data 类型 它的好处
 * equals()/hashCode()
 * toString()方法
 * componentN()方法
 * copy()方法
 上面的方法都已经被重写了

 
## 如果声明一个简单的数据类型，有下面的几点要求
  * 主构造函数必须要至少有一个参数
  * 主构造函数中的所有参数必须被标记为val或者var
  * 数据类不能有以下修饰符：abstract，inner,open,sealed
  * data class只能实现接口（Kotlin1.1以前的规则），现在也可以继承其它类

### 什么是  componentN()方法是干嘛用的
在主构造函数中有多少个参数，就会依次生成对应的component1,component2,component3……这些函数返回的就是对应字段的值
componentN函数是用来实现解构申明的

```
data class User(var id: Int,var name:String) 


fun main(args: Array<String>) {
    var user: User = User(123, "liuliqianxiao")
    var (id,name) = user//多重赋值
    print("$id,$name")
}
```

再来看看copy函数，默认生成的copy函数就是用现在的数据字段生成了一个新的对象。
```
fun copy(id: Int = this.id,name: String = this.name) = User(id,name)
```

如果只想改变其中的某些字段，就可以在调用copy的时候采用命名参数的方法进行调用

```
fun main(args: Array<String>) {
    var user: User = User(123, "liuliqianxiao")
    var other: User = user.copy(name = "mdzz")//只想改变名字
}
```


## kotlin 泛型

```
public interface DataExtractor<S, T> {

    S getDataFromHttpResult(Result<T> rResult);

}

public interface Result<T> {

    /**
     * 实际返回类型
     */
    T getData();

    /**
     * 响应码
     */
    int getCode();

    /**
     * 相应消息
     */
    String getMessage();

    /**
     * 请求是否成功
     */
    boolean isSuccess();

}
```


## kotlin中使用静态变量和静态方法
```
class Constanct{
    companion object{

        @JvmField
        const val BASE_URL = "http://xxxx.xxx.xxx/"

        fun getVideoFactor(){
   
        
        }
    }

}
```


## kotlin 对类型进行扩展

```
给类扩展方法
internal fun Int.appRuleTypeTextDesc(): String {
    return when (this) {
        APP_RULE_TYPE_LIMITED -> ResourceUtils.getString(com.app.base.R.string.limited_usable)
        APP_RULE_TYPE_FREE -> ResourceUtils.getString(com.app.base.R.string.free_usable)
        APP_RULE_TYPE_DISABLE -> ResourceUtils.getString(com.app.base.R.string.disabled)
        else -> throw IllegalArgumentException("不支持的这种类型")
    }
}
```

## kotlin  when
```
  when {
            item.rule_type.isDisabled() -> {
                viewHolder.tvAppsDialogItemCategory.visible()
                viewHolder.tvAppsDialogItemCategory.setText(R.string.disabled)
                viewHolder.tvAppsDialogItemCategory.setTextColor(ContextCompat.getColor(mContext, R.color.red_level2))
                viewHolder.tvAppsDialogItemCategory.background = disableIndicatorDrawable
            }
            item.rule_type.isFreeUsable() -> {
                viewHolder.tvAppsDialogItemCategory.visible()
                viewHolder.tvAppsDialogItemCategory.setText(R.string.free_usable)
                viewHolder.tvAppsDialogItemCategory.setTextColor(ContextCompat.getColor(mContext, R.color.green_main))
                viewHolder.tvAppsDialogItemCategory.background = freeIndicatorDrawable
            }
            item.rule_type.isLimitedUsable() -> {
                viewHolder.tvAppsDialogItemCategory.visible()
                viewHolder.tvAppsDialogItemCategory.setText(R.string.limited_usable)
                viewHolder.tvAppsDialogItemCategory.setTextColor(ContextCompat.getColor(mContext, R.color.gray_level2))
                viewHolder.tvAppsDialogItemCategory.background = mLimitedIndicatorDrawable
            }
            else -> {
                viewHolder.tvAppsDialogItemCategory.background = null
                viewHolder.tvAppsDialogItemCategory.invisible()
            }
        }
```























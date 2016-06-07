# SwitchView的使用方式

------

SwitchView是公司项目中的一个自定义控件，主要是为了实现ImageView的循环轮播，之前用RecyclerView做了一个相同效果的，但是需求是View不允许被重用而且需要拦截onTouchEvent事件，所以就重写一个方便控制。

> 具体的效果如下

![](https://github.com/flyme2012/SwitchView/blob/master/%20designSketch.png )

> 具体的使用方法

```java
<com.moshangjian.switchview.SwitchView
        android:id="@+id/main_switch"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/> 
```

```java 
    for (int i = 0; i < 5; i++) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_banner, null, false);
            ImageView imageView = (ImageView) view.findViewById(R.id.item_banner_img);
            imageView.setImageResource(imageResource[i]);
            if (switchView != null){
                switchView.addView(view);
            }
        }
```









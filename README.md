# JsonParser
Json解析器

最近在学习语法分析，就用JavaCC试着做了一个Json解析器
编译需要先安装JavaCC

# 代码结构
<pre>
src
├── JsonTree
│   ├── JArrayItem.java
│   ├── JArray.java
│   ├── JDigital.java
│   ├── JKeyPair.java
│   ├── JNode.java
│   ├── JString.java
│   ├── JTerm.java
│   ├── JType.java
│   └── JValue.java
├── Parse.java
└── Parse.jj
</pre>

# 编译方法

 cd $SRC_DIR  
 javacc Parse.jj  
 javac Parse.java

#使用示例
java Parse "{\"type\":\"success\",\"rows\":[{\"h5_channel_name\":\"\u6e20\u9053_zy\",\"share_time\":\"3\",\"view_time\":\"8\",\"view_no\":\"3\",\"hest_level\":\"0\",\"avg_time\":\"1,059.33\",\"lev_rate\":\"33.33%\"},{\"h5_channel_name\":\"zy1channel2\",\"share_time\":\"4\",\"view_time\":\"7\",\"view_no\":\"3\",\"hest_level\":\"0\",\"avg_time\":\"92.50\",\"lev_rate\":\"0.00%\"}],\"total\":2}"

输出：

<pre>{
  "type":"success",
  "rows":    [
      {
        "h5_channel_name":"\u6e20\u9053_zy",
        "share_time":"3",
        "view_time":"8",
        "view_no":"3",
        "hest_level":"0",
        "avg_time":"1,059.33",
        "lev_rate":"33.33%"
      },
      {
        "h5_channel_name":"zy1channel2",
        "share_time":"4",
        "view_time":"7",
        "view_no":"3",
        "hest_level":"0",
        "avg_time":"92.50",
        "lev_rate":"0.00%"
      }
    ],
  "total":2
}</pre>



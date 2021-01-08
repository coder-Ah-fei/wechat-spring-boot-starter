---
layout: default
---

1、为了能快速开发微信公众号，将公众号一些常用接口封装为一个springboot starter。

2、稍作调整也可以在普通的spring项目使用。但是不如在spring-boot中来的痛快。

> 项目还在改进当中，不建议引用。。。。。

# 使用

#### 引入

```
# Apache Maven
<dependency>
  <groupId>com.github.coder-Ah-fei</groupId>
  <artifactId>wechat-spring-boot-starter</artifactId>
  <version>0.0.1</version>
</dependency>

# Gradle Groovy DSL
implementation 'com.github.coder-Ah-fei:wechat-spring-boot-starter:0.0.1'
```

#### 配置

```
# application.properties
spring.xia.wechat.config.appid=公众号appid
spring.xia.wechat.config.appsecret=公众号appsecret
```

#### import

```aidl
import com.github.coderahfei.wechatspringbootstarter.WeChatUtils;
```

#### 使用

| 方法        | 参数          | 返回 | 说明 |
|:-------------|:------------------|:------|:------|
| getWebAccessToken(String code)                            | code:微信返回的code                                                             | AuthToken:微信返回值的封装     |根据code获取网页授权的access_token|
| getUserInfoByWechatLogin(AuthToken accessToken)           | AuthToken:getWebAccessToken的返回值                                            |UserInfoDto:用户信息           |根据微信网页授权的access_token获取用户的基本信息|
| getBaseAccessToken()                                      |                                                                               |AuthToken:微信返回值的封装      |基础支持中的access_token|
| findWechatUserList(String openid, String accessToken)     | openid:第一个拉取的OPENID，不填默认从头开始拉取 accessToken:基础支持中的access_token  |FindUserListDto:...          |从微信获取用户列表 每次请求最多获取10000条数据|

> This is a blockquote following a header.
>
> When something is important enough, you do it even if the odds are not in your favor.

### Header 3

```ruby
# Ruby code with syntax highlighting
GitHubPages::Dependencies.gems.each do |gem, version|
  s.add_dependency(gem, "= #{version}")
end
```

#### Header 4

* This is an unordered list following a header.
* This is an unordered list following a header.
* This is an unordered list following a header.

##### Header 5

1. This is an ordered list following a header.
2. This is an ordered list following a header.
3. This is an ordered list following a header.

###### Header 6

| head1        | head two          | three |
|:-------------|:------------------|:------|
| ok           | good swedish fish | nice  |
| out of stock | good and plenty   | nice  |
| ok           | good `oreos`      | hmm   |
| ok           | good `zoute` drop | yumm  |

### There's a horizontal rule below this.

* * *

### Here is an unordered list:

* Item foo
* Item bar
* Item baz
* Item zip

### And an ordered list:

1. Item one
1. Item two
1. Item three
1. Item four

### And a nested list:

- level 1 item
    - level 2 item
    - level 2 item
        - level 3 item
        - level 3 item
- level 1 item
    - level 2 item
    - level 2 item
    - level 2 item
- level 1 item
    - level 2 item
    - level 2 item
- level 1 item

### Small image

![Octocat](https://github.githubassets.com/images/icons/emoji/octocat.png)

### Large image

![Branching](https://guides.github.com/activities/hello-world/branching.png)

### Definition lists can be used with HTML syntax.

<dl>
<dt>Name</dt>
<dd>Godzilla</dd>
<dt>Born</dt>
<dd>1952</dd>
<dt>Birthplace</dt>
<dd>Japan</dd>
<dt>Color</dt>
<dd>Green</dd>
</dl>

```
Long, single-line code blocks should not wrap. They should horizontally scroll if they are too long. This line should be long enough to demonstrate this.
```

```
The final element.
```

# Junit5 #

## 结构 ##

> Junit5 = Junit platform + junit jupiter + junit vintage

### Junit platform ###

- jvm上启动测试框架的基础平台
    - testEngine API 用于开发测试框架
    - 控制台启动器 用于启动命令行

### Junit Jupiter ###

- 编写测试和扩展的新的编程模型和扩展模型
    - 子项目提供TestEngine用来运行基于jupiter的测试

### Junit Vintage  ###

- TestEngine用来运行junit3和4的测试

## 元注解和组合注解 ##

- TODO

## 测试类和测试方法 ##

- 使用元注解@Test、@RepeatedTest、@ParameterizedTest、@ TestFactory或@TestTemplate
- 标准的测试流程:StandardTests.java
- 声明自定义的显示名称:DisplayNameDemo

## 断言 ##

- AssertionDemo.java
- 使用第三方断言库例如：AssertJ、Hamcrest、Truth

## 假设 ##

- 假设是为了校验测试有无必要进行
- AssumptionsDemo.java


## 禁用测试 ##

- com.rtx.junit5.code.disablePack

## 条件 ##

- com.rtx.junit5.code.condition


## 测试实例生命周期 ##

- junit 会在执行每个测试方法执行之前创建新的实例(per-method)
- 如果需要只实例化一次则类上加上注解@TestInstance(Lifecycle.PER_CLASS)

### per-class模式 ###

- 可以使用非静态方法和接口的default方法上声明@BeforeAll和 @AfterAll

### 更改默认的测试实例生命周期 ###

- TODO

## 嵌套(nested)测试 ##

- TestgingAsStackDemo.java
- @Nested测试类必须是非静态嵌套类（即内部类），并且可以有任意多层的嵌套
- 例外：@BeforeAll和@AfterAll方法默认 不会工作。原因是Java不允许内部类中存在static成员。
- 不过这种限制可以使用@TestInstance(Lifecycle.PER_CLASS)标注@Nested测试类来绕开

## 依赖注入 ##

- 在之前的所有JUnit版本中，测试构造函数和方法是不允许传入参数的（至少不能使用标准的Runner实现）
- JUnit Jupiter一个主要的改变是：允许给测试类的构造函数和方法传入参数
- injection package
- ParameterResolver 为测试扩展定义了API，它可以在运行时动态 解析参数
    - TestInfoParameterResolver(@Test、@TestFactory、@BeforeEach、@AfterEach、@BeforeAll)提供测试信息
    - RepetitionInfoParameterResolver(@RepeatedTest、@BeforeEach @AfterEach)提供重复测试信息
    - TestReporterParameterResolver提供测试报告
- 在JUnit Jupiter中，你应该使用TestReporter来代替你在JUnit 4中打印信息到stdout或stderr的习惯。
    - 使用@RunWith(JUnitPlatform.class)会将报告的所有条目都输出到stdout中。
-  其他的参数解析器必须通过@ExtendWith注册合适的扩展来明确地开启。

## 重复测试 ##

- repeated





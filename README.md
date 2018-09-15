# springboot 整合MyBatis RESTful API文档设计

## 整合MyBatis
- 在pom.xml中引入所需要的依赖
- 使用MyBatis逆向工程
    1. 先创建数据库 
    2. 在application.yml中配置数据库连接池
    3. 创建generatorConfig.xml 配置文件,并配置逆向工程生成文件的位置以及生成的表和类名
    4. 在SpringBootDemoApplication中配置扫面的mapper包位置
    5. 使用OverIsMergeablePlugin工具类(这里也可以使用插件,但是MyBatis plugin 需要付费),然后再com.zar.demo.generator.MybatisGenerator 运行MyBatis逆向工程生成类
    6. 可以看到在对应文件夹中生成了*mapper.xml,*mapper.class,并且生成了对应的pojo类
## 使用controller 返回json
- 创建service
    1. 在service包中创建接口,并创建impl包,在包中实现接口,在实现类上使用@servide注解,使用@Autowired 注解获取对应的*mapper对象,在实现方法中处理数据(这里的使用@Autowired 编辑器会报错,不用理会)
- 创建controller
    2. 在controller包中创建*Controller,在类上使用@RestController 注解, 创建方法配置请求的url和请求的类型
## RESTful API文档设计
- 在pom.xml中引入所需要的依赖
- 

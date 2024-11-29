- Spring Boot 最强大的功能就是把我们常用的场景抽取成了一个个 starter（场景启动器），我们通过引入 Spring Boot 为我们提供的这些场景启动器，我们再进行少量的配置就能使用相应的功能。即使是这样，Spring Boot 也不能囊括我们所有的使用场景，往往我们需要自定义 starter，来简化我们对 Spring Boot 的使用。
* 这里简单定义了一个 starter示例，实现了一个IndexController类，访问/hello接口返回对应内容。在引入该starter后，在配置文件中添加配置项，即可使用。
* 官方文档：[[https://docs.spring.io/spring-boot/reference/features/developing-auto-configuration.html#features.developing-auto-configuration.custom-starter]]
![589aff6279581eaad077bfd0e68e0b01](https://github.com/user-attachments/assets/6bc88212-0f7a-4eca-bb12-16daf5548495)
![1bd7ae34c3e542e64c1822698b855c84](https://github.com/user-attachments/assets/a0dd528b-a7ff-4bba-ab02-2e7182a1230b)

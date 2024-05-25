package com.generator.mybatisPlus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 *
 */
public class GeneratorMybatisPlus {
    /**
     * 表名
     */
    private static final String tableName = "tablename";
    /**
     * 连接地址
     */
    private static final String url = "";
    /**
     * 用户名
     */
    private static final String username = "";
    /**
     * 密码
     */
    private static final String password = "";
    /**
     * 基础包名
     */
    private static final String basePackage = "com.zh.common.management.jmgk";
    /**
     * 实体前缀前缀
     */
    private static final String entityNamePrefix = "";

    /**
     * 数据库驱动
     */
    private static final String dbDriver = "com.mysql.jdbc.Driver";

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();
        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //生成文件的输出目录
        String path = System.getProperty("user.dir");
        System.out.println(path);
        globalConfig.setOutputDir(path + "\\src\\main\\java");
        // Author设置作者
        globalConfig.setAuthor("tong");
        // 文件覆盖
        globalConfig.setFileOverride(true);
        //通用字段映射
        globalConfig.setBaseResultMap(true);
        //通用结果列映射
        globalConfig.setBaseColumnList(true);
        // 生成后打开文件
        globalConfig.setOpen(false);
        // 自定义文件名风格，%s自动填充表实体属性
        globalConfig.setMapperName("%sMapper");
        globalConfig.setXmlName("%sMapper");
        globalConfig.setServiceName("%sService");
        globalConfig.setServiceImplName("%sServiceImpl");
        globalConfig.setEntityName(entityNamePrefix + "%s");
        globalConfig.setControllerName("%sController");
        autoGenerator.setGlobalConfig(globalConfig);

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setTypeConvert(new MySqlTypeConvert());
        dataSourceConfig.setUrl(url);
        dataSourceConfig.setDriverName(dbDriver);
        dataSourceConfig.setUsername(username);
        dataSourceConfig.setPassword(password);
        autoGenerator.setDataSource(dataSourceConfig);

        // 包名配置
        PackageConfig packageConfig = new PackageConfig();
        // 父包和子包名分开处理
        packageConfig.setParent(basePackage);
        packageConfig.setController("controller");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        autoGenerator.setPackageInfo(packageConfig);

        // 生成策略配置
        StrategyConfig strategy = new StrategyConfig();
        //设置命名格式
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 实体是否为lombok模型，默认 false
        strategy.setEntityLombokModel(true);
        //生成 @RestController 控制器
        strategy.setRestControllerStyle(true);
        // 是否生成实体时，生成字段注解
        strategy.setEntityTableFieldAnnotationEnable(true);
        //链式调用
        strategy.setCapitalMode(true);
        // 驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);
        //表和前缀处理
//        String table = "sys_resources,sys_role,sys_role_resources,sys_user,sys_user_role";//多个逗号隔开
        strategy.setInclude(tableName);
        // String[] tablePre = new String[]{"dt_"};
        //strategy.setTablePrefix(tablePre);
        autoGenerator.setStrategy(strategy);
        // 执行，以上相关参数可以基于动态输入获取
        autoGenerator.execute();
    }
}

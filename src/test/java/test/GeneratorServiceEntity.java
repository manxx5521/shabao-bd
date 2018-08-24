package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * <p>
 * 测试生成代码
 * </p>
 */
public class GeneratorServiceEntity {

	public static void main(String[] args) {
		new GeneratorServiceEntity().generateCode();
	}

	public void generateCode() {
		String packageName = "com.xiaoshabao.bill.bd";
		boolean serviceNameStartWithI = false;// user -> UserService, 设置成true: user -> IUserService
		generateByTables(serviceNameStartWithI, packageName, "td_ui_bill");
	}

	private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl("jdbc:mysql://47.91.220.42:3306/shabao_test?useUnicode=true&characterEncoding=utf8&useSSL=false")
                .setUsername("master")
                .setPassword("19911105man")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        strategyConfig.setTablePrefix(new String[] { "td_m_", "td_ui_","td_" });// 此处可以修改为您的表前缀(注意小几率的放前边)
        
        config.setActiveRecord(false)
                .setAuthor("manxx")
                .setOutputDir("E:\\workss\\shabao\\shabao-bd\\src\\main\\java")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
        	// 自定义文件命名，注意 %s 会自动填充表实体属性！
        	config.setMapperName("%sDao");
        	config.setXmlName("%sDao");
    		config.setServiceName("%sService");
    		config.setServiceImplName("%sServiceImpl");
    		config.setControllerName("%sController");
        }
        //xml设置
        config.setBaseResultMap(true);// XML ResultMap
        config.setBaseColumnList(true);// XML columList
        config.setEnableCache(false);// XML 二级缓存
        
		// 注入自定义配置
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
				this.setMap(map);
			}
		};
        //自定义xml目录
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        // 调整 xml 生成目录演示
		focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
			@Override
			public String outputFile(TableInfo tableInfo) {
				return "E:\\workss\\shabao\\shabao-bd\\src\\main\\resources\\mapper\\" + tableInfo.getEntityName() + "Mapper.xml";
			}
		});
		cfg.setFileOutConfigList(focList);
		
        new AutoGenerator().setGlobalConfig(config)
        	// 选择 freemarker 引擎，默认 Veloctiy
     		.setTemplateEngine(new FreemarkerTemplateEngine())
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setCfg(cfg)//自定义配置
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }

}

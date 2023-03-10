package config;

import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:remote.properties"})
public interface ProjectConfig extends Config {


    @Key("baseUrl")
    String baseUrl();
    @Key("browser")
    String browser();
    @Key("browserSize")
    String browserSize();
    @Key("browserVersion")
    String browserVersion();
    @Key("webRemoteUrl")
    String getRemoteUrl();
    @Key("apiBaseUrl")
    String apiBaseUrl();


    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("appAndroid")
    String appAndroid();

    @Key("appIos")
    String appIos();

    @Key("url")
    String url();
    @Key("deviceAndroid")
    String deviceAndroid();
    @Key("deviceIos")
    String deviceIos();
    @Key("os_versionAndroid")
    String os_versionAndroid();
    @Key("os_versionIos")
    String os_versionIos();
    @Key("localUrl")
    String localUrl();
    @Key("localVersion")
    String localVersion();
    @Key("localDevice")
    String localDevice();
    @Key("localAppPackage")
    String localAppPackage();
    @Key("localAppActivity")
    String localAppActivity();
    @Key("localAppPath")
    String localAppPath();
    @Key("localPlatformName")
    String localPlatformName();




}
//package com.dominos.common.utils;
//
//import java.util.ArrayList;
//import org.springframework.web.bind.annotation.RestController;
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
///**
// * Swagger allows you to categorize resources under different groups for a project with multiple controllers.
// */
//public class CommonSwaggerConfig {
//    private String swaggerInfo = "BIO4C Swagger APIs";
//    private String termsOfControllerUrl = "http://www.merck.co.in/en/terms_of_use/terms_of_use.html";
//    private String contact = "https://www.merckgroup.com/";
//    private String createdBy = "Merck Group";
//    private String contactMailId = "merck@external.merckgroup.com";
//    private String license = "closed source";
//    private String licenseUrl = "N/A";
//    private String api;
//    private String version = CommonSwaggerConfig.class.getPackage()
//        .getImplementationVersion();
//
//    /**
//     * Springfox provides `Docket` class to configure the REST controllers
//     *
//     * @param api     the name of the API
//     * @return the Docket configured
//     */
//    public Docket configSwagger(String api) {
//        this.api = api;
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(defineAPIInfo())
//            .select()
//            .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//            .build();
//    }
//
//    /**
//     * Creates an object containing API information including author name, email, version, license, etc.
//     *
//     * @return API information
//     */
//    private ApiInfo defineAPIInfo() {
//        return new ApiInfo(api, swaggerInfo, version, termsOfControllerUrl,
//            new Contact(createdBy, contact, contactMailId), license, licenseUrl, new ArrayList<>());
//    }
//}

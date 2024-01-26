package com.wujianlong.EnvironmentalSystems.view;

import com.wujianlong.EnvironmentalSystems.service.EnvironmentService;

/**
 * @author 26376
 * @version 1.0.0
 * @description TODO
 * @date 2024/1/8 17:38
 */
public class EnvironmentView {

    public void mainMenu() {

        EnvironmentService environmentService  = new EnvironmentService();

        System.out.println("Now commencing multimodal information gathering\n" + "In progress...\n" + "Completed\n");
        environmentService.First(environmentService.getResourcePath());
        System.out.println();
        System.out.println("Now commencing inquiries into macro-climatic attitudes\n");
        environmentService.Second();
        System.out.println();
        System.out.println("Customising personalised queries based on the original sample data\n" + "\nNow preparing to commence\n");
        environmentService.Third(environmentService.getEnvironment());
        System.out.println();
        System.out.println("Conclusion Section\n");
        environmentService.Result(environmentService.getMacroSum(),environmentService.getMicrocosmicSum());

    }
}

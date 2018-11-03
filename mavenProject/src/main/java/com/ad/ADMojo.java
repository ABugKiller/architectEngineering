package com.ad;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.eclipse.sisu.Parameters;

import java.util.List;

/**
 * @author ZhengYingDeng
 * @email 892467242@qq.com
 * @create 15:15 2018/10/30
 **/
@Mojo(name = "ad", defaultPhase = LifecyclePhase.PACKAGE)
public class ADMojo extends AbstractMojo {

    @Parameter
    private String msg;

    @Parameter
    private List<String> options;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("Maven Plugin!" + msg);
        System.out.println("Maven Plugin!" + options);
    }
}

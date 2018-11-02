package com.ad;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * @author ZhengYingDeng
 * @email 892467242@qq.com
 * @create 15:15 2018/10/30
 **/
@Mojo(name = "ad", defaultPhase = LifecyclePhase.PACKAGE)
public class ADMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("Maven Plugin");
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        if (a.equals(b)) {
            System.out.println("no");
        }else {
            System.out.println("yes");
        }

        if (a != b) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

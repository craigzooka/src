/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boozallen.technology.cyber.scap.xccdf;

import com.boozallen.technology.cyber.scap.cpe2.PlatformSpecification;
import java.util.ArrayList;

/**
 *
 * @author 559866
 */
public class Benchmark {
    private Status status;
    private String title;
    private String description;
    private Notice notice;
    private FrontMatter frontmatter;
    private RearMatter rearmatter;
    private Reference reference;
    private PlatformSpecification platformspecification;
    private Platform platform;
    private Version version;
    private Metadata metadata;
    ArrayList<Model> models;
    ArrayList<Profile> profiles;
    ArrayList<Group> groups;  
}

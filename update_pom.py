#!/usr/bin/env python3
import os
import sys

pre_module = '''<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.azure</groupId>
    <artifactId>azure-test-management</artifactId>
    <packaging>pom</packaging>
    <version>1.0.0</version> <!-- Need not change for every release-->
    <modules>
        <module>test</module>
'''

module = '        <module>../{folder}/{module}/azure-resourcemanager-{module}-generated</module>\n'

post_module = '''    </modules>
</project>
'''

pre_dependency = '''<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>com.azure</groupId>
    <artifactId>azure-test-management</artifactId>
    <version>1.0.0</version>
    <relativePath>../pom.xml</relativePath>
  </parent>

  <artifactId>azure-generated-test</artifactId>
  <version>1.0.0-beta.1</version>
  <packaging>jar</packaging>

  <dependencies>
    <dependency>
      <groupId>com.azure</groupId>
      <artifactId>azure-core-test</artifactId>
      <version>1.5.0</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>com.azure</groupId>
      <artifactId>azure-identity</artifactId>
      <version>1.1.3</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-simple</artifactId>
      <version>1.7.30</version>
      <scope>test</scope>
    </dependency>
'''

dependency = '''    <dependency>
      <groupId>com.azure.resourcemanager</groupId>
      <artifactId>azure-resourcemanager-{module}-generated</artifactId>
      <version>1.0.0-beta.1</version>
      <scope>test</scope>
    </dependency>
'''

post_dependency = '''  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <release>11</release>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.0.0-M4</version>
        <configuration>
          <runOrder>alphabetical</runOrder>
          <useSystemClassLoader>false</useSystemClassLoader>
          <systemPropertyVariables combine.children="append">
            <junit.jupiter.extensions.autodetection.enabled>true</junit.jupiter.extensions.autodetection.enabled>
          </systemPropertyVariables>
          <forkCount>1</forkCount>
          <testFailureIgnore>false</testFailureIgnore>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
'''

folder = 'generated/sdk'


os.chdir(os.path.abspath(os.path.dirname(sys.argv[0])))
modules = sorted(os.listdir(folder))

parent_pom = pre_module + ''.join(map(lambda m: module.format(folder = folder, module = m), modules)) + post_module
pom = pre_dependency + ''.join(map(lambda m: dependency.format(module = m), modules)) + post_dependency

with open('test/pom.xml', 'w') as fout:
    fout.write(parent_pom)

with open('test/test/pom.xml', 'w') as fout:
    fout.write(pom)
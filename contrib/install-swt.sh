#!/bin/sh

mvn install:install-file -DgroupId=org.eclipse.swt.gtk.linux -DartifactId=x86 -Dversion=4.2.1 -DgeneratePom=true -Dpackaging=jar -Dfile=swt-debug.jar

mvn install:install-file -DgroupId=org.eclipse.swt.gtk.linux -DartifactId=x86 -Dversion=4.2.1 -DgeneratePom=true -Dpackaging=jar -Dfile=src.zip -Dclassifier=sources

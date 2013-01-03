swtstart
========

Sample Maven Project for Eclipse SWT based Application

Preparing
---------

1. goto http://download.eclipse.org/eclipse/downloads/
2. click build name "4.2.1"
3. scroll down to the section, "SWT Binary and Source".
4. download the swt binary & source.
   (e.g. for Linux 32bit, `swt-4.2.1-gtk-linux-x86.zip`)
5. unzip the downloaded package, and use `contrib/install-swt.sh`
   to install SWT in your local maven repository.


Building
--------

    $ mvn clean
    $ mvn compile
    $ mvn package appassembler:assemble
    
Running
-------

    $ sh target/appassembler/bin/swtstart
    

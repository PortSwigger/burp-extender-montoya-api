Burp Extender API - Montoya Version
============================

This repository holds the Burp Suite Pro Extender API for building user extensions ([BApps](https://portswigger.net/bappstore/)) leveraging the core functionality of Burp.

Download
--------

Available on [Maven Central](https://search.maven.org/search?q=Montoya-api) and in [Burp Suite](https://portswigger.net/burp/communitydownload).

<h5>Maven</h5>

    <dependency>
        <groupId>net.portswigger.burp.extender</groupId>
        <artifactId>montoya-api</artifactId>
        <version>0.9</version>
    </dependency>`

<h5>Gradle</h5>

    implementation 'net.portswigger.burp.extender:montoya-api:0.9'

Getting Started
--------

Create a class that implements [BurpExtension](https://github.com/PortSwigger/burp-extender-api/blob/master/src/main/java/burp/IBurpExtenderCallbacks.java). 
The initialise method will give you an implementation of the [MontoyaApi](https://github.com/PortSwigger/burp-extender-montoya-api/blob/main/src/main/java/burp/api/montoya/MontoyaApi.java) which can be used to interact and modify Burp suite.

Examples
--------

* [Register HTTP handler](https://github.com/PortSwigger/burp-extender-montoya-api/blob/main/examples/src/main/java/net/portswigger/burp/extender/http/HttpHandlerExample.java)
* [Register Proxy handler](https://github.com/PortSwigger/burp-extender-montoya-api/blob/main/examples/src/main/java/net/portswigger/burp/extender/proxy/ProxyHandlerExample.java)
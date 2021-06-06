SUMMARY = "esptool is A command line utility to flash firmware for ESP8266 & ESP32 "
DESCRIPTION = "\
A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers.\
Allows flashing firmware, reading back firmware, querying chip parameters, etc.\
The esptool.py project is hosted on github: https://github.com/espressif/esptool\
"
HOMEPAGE = "https://github.com/espressif/esptool"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI[md5sum] = "d62d71041896d105d7abd9e9c40f1995"
SRC_URI[sha256sum] = "ec6b943c53b4d71f87f98776333d5b4b99905766898a7002c28a9090b92b2de4"

PYPI_PACKAGE = "esptool"
inherit pypi

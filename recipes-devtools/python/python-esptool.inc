SUMMARY = "esptool is A command line utility to falsh ESP8266 & ESP32 "
DESCRIPTION = "\
A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers.\
Allows flashing firmware, reading back firmware, querying chip parameters, etc.\
The esptool.py project is hosted on github: https://github.com/espressif/esptool\
"
HOMEPAGE = "https://github.com/espressif/esptool"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI[md5sum] = "d17b9293910773045b9de0d5caa0597d"
SRC_URI[sha256sum] = "1e4288d9f00e55ba36809cc79c493643c623bfa036d7b019a0ebe396284bc317"

PYPI_PACKAGE = "esptool"
inherit pypi

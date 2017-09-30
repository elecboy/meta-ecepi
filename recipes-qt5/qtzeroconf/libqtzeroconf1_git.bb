# Qt wrapper class for ZeroConf libraries across various platforms.

DESCRIPTION = "Qt wrapper class for ZeroConf libraries across various platforms."
HOMEPAGE = "https://github.com/jbagg/QtZeroConf"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c1939be5579666be947371bc8120425f"
SECTION = "libs"
DEPENDS = "avahi qtbase"

PV = "1.1+git${SRCPV}"

SRC_URI = "git://github.com/jbagg/QtZeroConf.git;protocol=https"
SRCREV = "639050b600c70a6b893284cc53f46eb28174e91f"

S="${WORKDIR}/git"

do_install_append() {
     install -d ${D}/${includedir}/qt5
     install -m 0644 ${S}/qzeroconf.h ${D}/${includedir}/qt5
}

inherit qmake5

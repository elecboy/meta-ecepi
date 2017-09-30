HOMEPAGE = "https://github.com/nutechsoftware/ser2sock"
SUMMARY = "The ser2sock utility allows sharing of a serial device over a TCP/IP network. It also supports encryption and authentication via OpenSSL."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=664aa96239b59b044722945d56f70200"
DEPENDS = "openssl"

PV = "v1.5.4"
SRCREV = "cc441ff1d7a1d2e568a14d0982a9b75e1acc6ac8"
SRC_URI = "git://github.com/nutechsoftware/ser2sock.git;protocol=git;branch=master \
	   file://ser2sock.conf \
	  "

S = "${WORKDIR}/git"

inherit autotools-brokensep

do_install() {
	install -d ${D}/${bindir}
	install ${S}/${PN} ${D}/${bindir}/ser2sock
	install -d ${D}/${sysconfdir}/${PN}
	install -m 0644 ${WORKDIR}/${PN}.conf ${D}/${sysconfdir}/${PN}/
}

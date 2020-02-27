DESCRIPTION = "ProxyChains is a UNIX program, \
 redirects the connections through SOCKS4a/5 or HTTP proxies. \
 It supports TCP only (no UDP/ICMP etc)."
SECTION = "net"
HOMEPAGE="https://github.com/rofl0r/proxychains-ng"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=1fb9e0b45805be7065ad344c99f985bf"

SRC_URI = "http://ftp.barfooze.de/pub/sabotage/tarballs/${PN}-${PV}.tar.xz \
           "

SRC_URI[md5sum] = "647709ff0cbeaec470df6d4f54003b99"
SRC_URI[sha256sum] = "9d00e035b8a808b9e0c750501b08f38eeadd0be421f30ee83e88fd15e872b0ae"

S = "${WORKDIR}/${PN}-${PV}"

inherit autotools

# do_configure () {
#     ./configure --prefix=${prefix}
# }

BINMODE = "0755"

do_install () {
    install -d ${D}${bindir}
    install -d ${D}${bindir}

    install -m${BINMODE} ${S}/proxychains4 ${D}${bindir}
    install -m${BINMODE} ${S}/libproxychains4.so ${D}${libdir}

    install -m 0644 -D ${S}/src/proxychains.conf ${D}${sysconfdir}/proxychains.conf
}

PACKAGES = "${PN}"
FILES_${PN} = "${bindir}/*"

#RDEPENDS_${PN} = "readline"

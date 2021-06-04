SUMMARY = "libqmi is a library for talking to WWAN devices by QMI protocol"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices which speak the Qualcomm MSM Interface (QMI) protocol"
HOMEPAGE = "http://www.freedesktop.org/wiki/Software/libqmi"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

DEPENDS = "glib-2.0 glib-2.0-native libgudev "

PV = "1.29+git${SRCPV}"

inherit autotools pkgconfig gobject-introspection

SRC_URI = "git://github.com/freedesktop/libqmi.git;protocol=https"
SRCREV = "026158ab1a7d31811f4c254d3b0edd5c6f5e1adc"

S = "${WORKDIR}/git"

do_configure_prepend() {
    (cd ${S};NOCONFIGURE=true ./autogen.sh;cd -)
}

PACKAGECONFIG ??= "udev mbim"
PACKAGECONFIG[udev] = ",--without-udev,libgudev"
PACKAGECONFIG[mbim] = "--enable-mbim-qmux,--disable-mbim-qmux,libmbim"

EXTRA_OECONF_append_toolchain-clang = " --enable-more-warnings=no"

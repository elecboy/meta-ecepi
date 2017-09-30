# Easily reset usb device from the command line

DESCRIPTION = "Easily reset usb device from the command line"
HOMEPAGE = "https://github.com/VectorCell/usbreset"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
SECTION = "base"
DEPENDS = "libusb"

PV = "1.0+git${SRCPV}"

SRC_URI = "git://github.com/VectorCell/usbreset.git;protocol=https"
SRCREV = "82a3c402a37b0e01f3d530dcf13375b447d4948c"

SRC_URI += "\
	file://02-use-cc.patch \
	file://03-add-license.patch \
	"

S="${WORKDIR}/git"

do_install() {
    install -m 0755 -D ${WORKDIR}/git/usbreset ${D}${bindir}/usbreset
}
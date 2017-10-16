DESCRIPTION = "Node-Serialport provides a stream interface for the low-level serial port code necessary"
HOMEPAGE = "https://github.com/EmergingTechnologyAdvisors/node-serialport"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945"

SRC_URI = " \
	https://github.com/EmergingTechnologyAdvisors/${PN}/archive/${PV}.tar.gz;name=pkg \
"

SRC_URI[pkg.md5sum] = "2e7c03b07f991eaf12de08ed7982ae0c"
SRC_URI[pkg.sha256sum] = "ebb769249972995d1511101477404edc5c91abeafd1d5db06457b942a246aa47"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python"

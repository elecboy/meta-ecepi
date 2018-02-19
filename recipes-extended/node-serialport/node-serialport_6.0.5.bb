DESCRIPTION = "Node-Serialport provides a stream interface for the low-level serial port code necessary"
HOMEPAGE = "https://github.com/EmergingTechnologyAdvisors/node-serialport"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945"

SRC_URI = " \
	https://github.com/EmergingTechnologyAdvisors/${PN}/archive/v${PV}.tar.gz;name=pkg \
"

SRC_URI[pkg.md5sum] = "73f5f55a7dfa31a98d87e53130c05998"
SRC_URI[pkg.sha256sum] = "df0317e96a959af7ddec581824fac3d431c128537d84cedf47484c801cf9a848"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python"

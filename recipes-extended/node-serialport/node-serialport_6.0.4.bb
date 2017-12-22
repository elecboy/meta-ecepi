DESCRIPTION = "Node-Serialport provides a stream interface for the low-level serial port code necessary"
HOMEPAGE = "https://github.com/EmergingTechnologyAdvisors/node-serialport"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945"

SRC_URI = " \
	https://github.com/EmergingTechnologyAdvisors/${PN}/archive/v${PV}.tar.gz;name=pkg \
"

SRC_URI[pkg.md5sum] = "c6b5394a5ff43d68af9d470366eb767f"
SRC_URI[pkg.sha256sum] = "b3ffe2534386ad8b2247f9d550d4effa42456bc95de8d9ab9dd695a3f0415c79"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python"

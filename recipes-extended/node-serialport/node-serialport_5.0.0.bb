DESCRIPTION = "Node-Serialport provides a stream interface for the low-level serial port code necessary"
HOMEPAGE = "https://github.com/EmergingTechnologyAdvisors/node-serialport"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945"

SRC_URI = " \
	https://github.com/EmergingTechnologyAdvisors/${PN}/archive/${PV}.tar.gz;name=pkg \
"

SRC_URI[pkg.md5sum] = "b7b2b55587d1f25e26168fe5bd4830c0"
SRC_URI[pkg.sha256sum] = "e09f8a6bac737ab7497ef1055ff976224355bd3c296f9ad9fa62bd35dea5592e"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python"

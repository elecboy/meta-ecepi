SUMMARY = "Supervisor: A Process Control System"
DESCRIPTION = "\
Supervisor is a client/server system that allows its users \
to monitorand control a number of processes on UNIX-like \
operating systems."
HOMEPAGE = "https://github.com/Supervisor/supervisor"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSES.txt;md5=5b4e3a2172bba4c47cded5885e7e507e"

SRC_URI[md5sum] = "2c5cda085c03a27e1ba96a936779fffa"
SRC_URI[sha256sum] = "64082ebedf6d36ff409ab2878f1aad5c9035f916c5f15a9a1ec7dffc6dfbbed8"

PYPI_PACKAGE = "supervisor"
inherit pypi systemd
RDEPENDS_${PN} = "\
    ${PYTHON_PN}-meld3 \
"

SRC_URI += "file://supervisord.conf \
	    file://supervisor.service \
	"
SYSTEMD_SERVICE_${PN} = "supervisor.service"

do_install_append() {
	install -d ${D}${sysconfdir}/supervisor
	install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
	install -d ${D}${systemd_system_unitdir}

	install -m 0644 ${WORKDIR}/supervisord.conf ${D}${sysconfdir}/supervisor
	install -m 0644 ${WORKDIR}/supervisor.service ${D}${systemd_system_unitdir}
	ln -sf /lib/systemd/system/supervisor.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/supervisor.service

}

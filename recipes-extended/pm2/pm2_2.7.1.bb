DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

SRC_URI = "https://github.com/Unitech/pm2/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "c3992a6b43d6adf02088911a1570c96b"
SRC_URI[src.sha256sum] = "3c5cf0aa03ebf80af6b7e378b205d0a4c839cbe5699e0ad80d1c3f9553cbab82"

RDEPENDS_${PN} = "nodejs"

do_compile[noexec] = "1"

do_install_append() {

	rm -f ${D}/usr/lib/node_modules/pm2/lib/templates/init-scripts/openrc.tpl || true

}

INSANE_SKIP_${PN} += "file-rdeps"

inherit allarch npm-install-global

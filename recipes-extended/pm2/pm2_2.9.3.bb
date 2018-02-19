DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

SRC_URI = "https://github.com/Unitech/pm2/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "44fe1f6f0494d3a3034880e69590a7c8"
SRC_URI[src.sha256sum] = "ec24db2eb259fa32a1a129b1d80b8f6d1164634a0bd278373f88dbe8ee463ca8"

RDEPENDS_${PN} = "nodejs"

do_compile[noexec] = "1"

do_install_append() {

	rm -f ${D}/usr/lib/node_modules/pm2/lib/templates/init-scripts/openrc.tpl || true

}

INSANE_SKIP_${PN} += "file-rdeps"

inherit allarch npm-install-global

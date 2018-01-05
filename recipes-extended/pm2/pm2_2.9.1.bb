DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

SRC_URI = "https://github.com/Unitech/pm2/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "1a267be9b23ef7041d321bfd231e1023"
SRC_URI[src.sha256sum] = "043bc548649b4e960d4dcb2ecd32a438a3b998325a0cd418da141affaeeb601e"

RDEPENDS_${PN} = "nodejs"

do_compile[noexec] = "1"

do_install_append() {

	rm -f ${D}/usr/lib/node_modules/pm2/lib/templates/init-scripts/openrc.tpl || true

}

INSANE_SKIP_${PN} += "file-rdeps"

inherit allarch npm-install-global

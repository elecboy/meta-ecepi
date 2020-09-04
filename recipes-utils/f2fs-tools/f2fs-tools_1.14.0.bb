SUMMARY = "Tools for Flash-Friendly File System (F2FS)"
HOMEPAGE = "https://git.kernel.org/pub/scm/linux/kernel/git/jaegeuk/f2fs-tools.git"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=362b4b2594cd362b874a97718faa51d3"

# to provide libuuid
DEPENDS = "util-linux"

# v1.14.0
SRCREV = "d41dcbdf46dc3841cd0a0507e6573e38cb6c55bb"
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/jaegeuk/f2fs-tools.git \
           file://0001-f2fs-tools-Use-srcdir-prefix-to-denote-include-path.patch \
           "
S = "${WORKDIR}/git"

inherit pkgconfig autotools

BBCLASSEXTEND = "native"

#FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
DEPENDS += "libgpiod"

PACKAGECONFIG[linuxgpiod] = "--enable-linuxgpiod,--disable-linuxgpiod"
PACKAGECONFIG ??= "linuxgpiod sysfsgpio remote-bitbang"
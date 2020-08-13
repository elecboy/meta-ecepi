SUMMARY = "Oh My Zsh is a framework for managing your Zsh configuration."
DESCRIPTION = "Oh My Zsh is a delightful, open source, community-driven framework \
            for managing your Zsh configuration. It comes bundled with thousands \
            of helpful functions, helpers, plugins, themes, and a few things \
            that make you shout..."
HOMEPAGE = "https://ohmyz.sh/"
SECTION = "base/shell"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a3d89f44b0b29ba4bd48cf7cf62bc9c3"

RDEPENDS_${PN} = "zsh"

PV = "1.0+git${SRCPV}"

SRC_URI = "git://github.com/ohmyzsh/ohmyzsh.git;protocol=https\
        file://zshrc \
        "
SRCREV = "079e7bb5e0a79171f3356d55d3f6302a82645a39"

S="${WORKDIR}/git"

do_install() {
    install -m 0644 -D ${WORKDIR}/zshrc ${D}${sysconfdir}/skel/.zshrc
    install -d ${D}${libdir}/oh-my-zsh
    cp -av ${S}/* ${D}${libdir}/oh-my-zsh
    chown root:root -R ${D}${libdir}/oh-my-zsh
}


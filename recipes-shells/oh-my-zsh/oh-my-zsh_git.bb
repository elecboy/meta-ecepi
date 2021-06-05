SUMMARY = "Oh My Zsh is a framework for managing your Zsh configuration."
DESCRIPTION = "Oh My Zsh is a delightful, open source, community-driven framework \
            for managing your Zsh configuration. It comes bundled with thousands \
            of helpful functions, helpers, plugins, themes, and a few things \
            that make you shout..."
HOMEPAGE = "https://ohmyz.sh/"
SECTION = "base/shell"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=914c4ccc31c8e7a877fdd4db0b11d371"

RDEPENDS_${PN} = "zsh"

PV = "1.0+git${SRCPV}"

SRC_URI = "git://github.com/ohmyzsh/ohmyzsh.git;protocol=https\
        file://zshrc \
        file://zsh_history \
        "
SRCREV = "706b2f3765d41bee2853b17724888d1a3f6f00d9"

S="${WORKDIR}/git"

do_install() {
    install -m 0644 -D ${WORKDIR}/zshrc ${D}${sysconfdir}/skel/.zshrc
    install -m 0644 ${WORKDIR}/zsh_history ${D}${sysconfdir}/skel/.zsh_history
    install -d ${D}${libdir}/oh-my-zsh
    cp -av ${S}/* ${D}${libdir}/oh-my-zsh
    chown root:root -R ${D}${libdir}/oh-my-zsh
}


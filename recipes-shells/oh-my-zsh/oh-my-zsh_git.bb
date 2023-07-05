SUMMARY = "Oh My Zsh is a framework for managing your Zsh configuration."
DESCRIPTION = "Oh My Zsh is a delightful, open source, community-driven framework \
            for managing your Zsh configuration. It comes bundled with thousands \
            of helpful functions, helpers, plugins, themes, and a few things \
            that make you shout..."
HOMEPAGE = "https://ohmyz.sh/"
SECTION = "base/shell"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cab5ca71c71cf4dff95c19d8e59df7ef"

RDEPENDS:${PN} = "zsh"

PV = "1.0+git${SRCPV}"

SRC_URI = "git://github.com/ohmyzsh/ohmyzsh.git;protocol=https;branch=master \
        file://zshrc \
        "
SRCREV = "fe4b5659863c388786986d70fa6d1bb66b00afb6"

S="${WORKDIR}/git"

do_install() {
    install -m 0644 -D ${WORKDIR}/zshrc ${D}${sysconfdir}/skel/.zshrc
    install -d ${D}${libdir}/oh-my-zsh
    cp -av ${S}/* ${D}${libdir}/oh-my-zsh
    chown root:root -R ${D}${libdir}/oh-my-zsh
}


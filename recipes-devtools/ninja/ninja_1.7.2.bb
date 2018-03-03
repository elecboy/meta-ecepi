SUMMARY = "Ninja is a small build system with a focus on speed."
HOMEPAGE = "http://martine.github.com/ninja/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=a81586a64ad4e476c791cda7e2f2c52e"

DEPENDS = "re2c-native ninja-native"

SRCREV = "aad58dde60038e5bd5f0dc538b2c08625bf31a0a"

SRC_URI = "git://github.com/Kitware/ninja.git;branch=features-for-fortran"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>.*)"

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile_class-native() {
	./configure.py --bootstrap
}

do_compile() {
	./configure.py
	ninja
}

do_install() {
	install -D -m 0755  ${S}/ninja ${D}${bindir}/ninja
}

BBCLASSEXTEND = "native nativesdk"

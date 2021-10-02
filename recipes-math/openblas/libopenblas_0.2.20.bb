SUMMARY = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
SECTION = "libs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5adf4792c949a00013ce25d476a2abc0"
PR = "r1"

DEPENDS="libgfortran"

SRC_URI = " \
	  https://github.com/xianyi/OpenBLAS/archive/v${PV}.tar.gz \
	  file://0001-openblas-pc-path.patch \
	  "
SRC_URI[md5sum] = "48637eb29f5b492b91459175dcc574b1"

S = "${WORKDIR}/OpenBLAS-${PV}"
EXTRA_OEMAKE = "'AR=${AR}'\
		'RANLIB=${RANLIB}'\
		'PREFIX=${D}/usr'\
		"
do_compile() {
    if [ "${FEED_ARCH}" = "armv7at2hf-neon" ]; then
       TARGET_CPU=CORTEXA9
    elif [ "${FEED_ARCH}" = "armv7at2hf-neon-vfpv4" ]; then
       TARGET_CPU=CORTEXA15
    elif [ "${FEED_ARCH}" = "aarch64" ]; then
       TARGET_CPU=CORTEXA57
    fi
    oe_runmake TARGET=${TARGET_CPU} HOSTCC=gcc
}

do_install() {
     oe_runmake install
}
INSANE_SKIP:${PN} = "dev-so"
FILES:${PN} = "${libdir}/*.so"
# Make sure it isn’t in the dev package’s files list
FILES_SOLIBSDEV = ""
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

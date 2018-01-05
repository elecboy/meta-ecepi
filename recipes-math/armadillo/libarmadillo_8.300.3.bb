# Armadillo is a high quality linear algebra library (matrix maths) for the C++ language, aiming towards a good balance between speed and ease of use 

DESCRIPTION = "Armadillo is a high quality linear algebra library (matrix maths) for the C++ language, aiming towards a good balance between speed and ease of use."
HOMEPAGE = "http://arma.sourceforge.net/"
LICENSE = "MPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"
SECTION = "libs"
DEPENDS = "lapack libsuperlu"


SRC_URI = "http://sourceforge.net/projects/arma/files/armadillo-${PV}.tar.xz \
          "
SRC_URI[md5sum] = "6ae86fe887c48a4c97f5e8214218f8bc"
SRC_URI[sha256sum] = "493653bccbfcb65234ed569b765771c3d947d614091ef857927d41ac542a97b5"

OLIBDIR = "lib"
S = "${WORKDIR}/armadillo-${PV}"

# Take the flags added by PACKAGECONFIG and pass them to cmake.
#EXTRA_OECMAKE = "${EXTRA_OECONF} -DSOCI_LIBDIR=${libdir}"
#DISABLE_STATIC = ""

do_install_append() {
    sed -i 's%^#define ARMA_SUPERLU_INCLUDE_DIR%//#define ARMA_SUPERLU_INCLUDE_DIR%' ${D}${includedir}/armadillo_bits/config.hpp
}

inherit cmake

# Armadillo is a high quality linear algebra library (matrix maths) for the C++ language, aiming towards a good balance between speed and ease of use 

DESCRIPTION = "Armadillo is a high quality linear algebra library (matrix maths) for the C++ language, aiming towards a good balance between speed and ease of use."
HOMEPAGE = "http://arma.sourceforge.net/"
LICENSE = "MPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"
SECTION = "libs"
DEPENDS = "lapack libsuperlu"


SRC_URI = "http://sourceforge.net/projects/arma/files/armadillo-${PV}.tar.xz \
          "
SRC_URI[md5sum] = "83f4da2b5e12d9f354c2ac10a91b6ca4"
SRC_URI[sha256sum] = "9d041975db0e92c4be019a70e961bcbb78f7167c7d36ef432d940f9c54949110"

OLIBDIR = "lib"
S = "${WORKDIR}/armadillo-${PV}"

# Take the flags added by PACKAGECONFIG and pass them to cmake.
#EXTRA_OECMAKE = "${EXTRA_OECONF} -DSOCI_LIBDIR=${libdir}"
#DISABLE_STATIC = ""

do_install_append() {
    sed -i 's%^#define ARMA_SUPERLU_INCLUDE_DIR%//#define ARMA_SUPERLU_INCLUDE_DIR%' ${D}${includedir}/armadillo_bits/config.hpp
}

inherit cmake

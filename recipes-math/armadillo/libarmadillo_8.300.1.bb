# Armadillo is a high quality linear algebra library (matrix maths) for the C++ language, aiming towards a good balance between speed and ease of use 

DESCRIPTION = "Armadillo is a high quality linear algebra library (matrix maths) for the C++ language, aiming towards a good balance between speed and ease of use."
HOMEPAGE = "http://arma.sourceforge.net/"
LICENSE = "MPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"
SECTION = "libs"
DEPENDS = "lapack libsuperlu"


SRC_URI = "http://sourceforge.net/projects/arma/files/armadillo-${PV}.tar.xz \
          "
SRC_URI[md5sum] = "ba50505d83e83cc9373cb3937d507a8c"
SRC_URI[sha256sum] = "cd0f8e5e4dfa04855b32534c601646169ff4c0368a4ba071babe6f6ec461dc05"

OLIBDIR = "lib"
S = "${WORKDIR}/armadillo-${PV}"

# Take the flags added by PACKAGECONFIG and pass them to cmake.
#EXTRA_OECMAKE = "${EXTRA_OECONF} -DSOCI_LIBDIR=${libdir}"
#DISABLE_STATIC = ""

do_install_append() {
    sed -i 's%^#define ARMA_SUPERLU_INCLUDE_DIR%//#define ARMA_SUPERLU_INCLUDE_DIR%' ${D}${includedir}/armadillo_bits/config.hpp
}

inherit cmake

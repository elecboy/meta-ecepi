# LAPACK is a software package provided by Univ. of Tennessee; Univ. of California, Berkeley; Univ. of Colorado Denver; and NAG Ltd..

DESCRIPTION = "LAPACK (Linear Algebra Package) is a standard software library for numerical linear algebra"
HOMEPAGE = "http://www.netlib.org/lapack/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=930f8aa500a47c7dab0f8efb5a1c9a40"
SECTION = "libs"
DEPENDS = "libgfortran"


SRC_URI = "${HOMEPAGE}${BP}.tgz \
          "
SRC_URI[md5sum] = "dcdeeed73de152c4643ccc5b1aeb453c"
SRC_URI[sha256sum] = "f6c53fd9f56932f3ddb3d5e24c1c07e4cd9b3b08e7f89de9c867125eecc9a1c8"

OLIBDIR = "lib"

# Take the flags added by PACKAGECONFIG and pass them to cmake.
#EXTRA_OECMAKE = "${EXTRA_OECONF} -DSOCI_LIBDIR=${libdir}"
EXTRA_OECMAKE = "${EXTRA_OECONF} -DBUILD_SHARED_LIBS=ON -DBUILD_STATIC_LIBS=OFF -DLAPACKE_WITH_TMG=OFF -DBUILD_TESTING=OFF"
#DISABLE_STATIC = ""

inherit cmake

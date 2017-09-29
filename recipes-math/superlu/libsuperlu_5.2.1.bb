# SuperLU is a general purpose library for the direct solution of large, sparse, nonsymmetric systems of linear equations.

DESCRIPTION = "SuperLU is a general purpose library for the direct solution of large, sparse, nonsymmetric systems of linear equations."
HOMEPAGE = "http://crd-legacy.lbl.gov/~xiaoye/SuperLU/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://License.txt;md5=b65172171694eab8866a3c2c848c9915"
SECTION = "libs"
DEPENDS = "libopenblas"


SRC_URI = "${HOMEPAGE}/superlu_${PV}.tar.gz \
          "
SRC_URI[md5sum] = "3a1a9bff20cb06b7d97c46d337504447"
SRC_URI[sha256sum] = "28fb66d6107ee66248d5cf508c79de03d0621852a0ddeba7301801d3d859f463"

OLIBDIR = "lib"
S = "${WORKDIR}/SuperLU_${PV}"

# Take the flags added by PACKAGECONFIG and pass them to cmake.
EXTRA_OECMAKE = "${EXTRA_OECONF} -DBUILD_SHARED_LIBS=True -DBLAS_FOUND=1 -DBLAS_LIB='libopenblas.so' -Denable_tests=OFF"

#DISABLE_STATIC = ""

inherit cmake

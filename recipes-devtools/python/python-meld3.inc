SUMMARY = "meld3 templating system used by Supervisor"
DESCRIPTION = "\
meld3 is an HTML/XML templating system for Python which keeps \
template markup and dynamic rendering logic separate from one \
another.  See http://www.entrian.com/PyMeld for a treatise on the \
benefits of this pattern."
HOMEPAGE = "https://github.com/supervisor/meld3"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9e7581cef5645475fcefebdc15ed7abf"

SRC_URI[md5sum] = "56fff5d6599efeefc81cf2d3b8cf6b4e"
SRC_URI[sha256sum] = "1efda676264490db2e30bfb81b27a918cc6d9c2de6d609491aa43410b9537eb9"

PYPI_PACKAGE = "meld3"
inherit pypi

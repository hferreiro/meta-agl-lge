SUMMARY = "Lightweight http(s) proxy daemon"
HOMEPAGE = "https://tinyproxy.github.io/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://github.com/Igalia/${PN}.git;branch=wam-proxy;protocol=https;rev=917ef9eec23b63015b5e20e9c7b9350c08c55512 \
		   file://disable-documentation.patch"
S = "${WORKDIR}/git"

EXTRA_OECONF += " \
	--enable-filter \
	--enable-transparent \
	--disable-regexcheck \
	--enable-reverse \
	--enable-upstream \
	--enable-xtinyproxy \
	"

inherit autotools

FILES_${PN} += "${datadir}/tinyproxy/*"
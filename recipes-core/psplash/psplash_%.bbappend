SPLASH_IMAGES = "file://logo.png;outsuffix=default"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
EXTRA_OECONF += "--disable-startup-msg --enable-img-fullscreen"
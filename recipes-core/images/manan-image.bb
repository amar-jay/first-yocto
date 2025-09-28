SUMMARY = "Image responsible for device booting."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit extrausers 

IMAGE_OVERHEAD_FACTOR ?= "1.0"
# IMAGE_ROOTFS_SIZE ?= "20480" # 20MB
IMAGE_ROOTFS_SIZE ?= "81920"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

EXTRA_USERS_PARAMS = "\
		usermod -P 'password' root \
		"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  				Build Started by meta-manan 				*");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build




package subProj_1394

import subProj_1394.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1394")
    name = "subProj 1394"

    buildType(subProj_bt_1394_5)
    buildType(subProj_bt_1394_0)
    buildType(subProj_bt_1394_2)
    buildType(subProj_bt_1394_1)
    buildType(subProj_bt_1394_4)
    buildType(subProj_bt_1394_3)
})

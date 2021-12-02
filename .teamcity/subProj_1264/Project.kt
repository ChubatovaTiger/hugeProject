package subProj_1264

import subProj_1264.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1264")
    name = "subProj 1264"

    buildType(subProj_bt_1264_4)
    buildType(subProj_bt_1264_3)
    buildType(subProj_bt_1264_5)
    buildType(subProj_bt_1264_0)
    buildType(subProj_bt_1264_2)
    buildType(subProj_bt_1264_1)
})

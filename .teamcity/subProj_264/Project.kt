package subProj_264

import subProj_264.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_264")
    name = "subProj 264"

    buildType(subProj_bt_264_4)
    buildType(subProj_bt_264_5)
    buildType(subProj_bt_264_2)
    buildType(subProj_bt_264_3)
    buildType(subProj_bt_264_0)
    buildType(subProj_bt_264_1)
})

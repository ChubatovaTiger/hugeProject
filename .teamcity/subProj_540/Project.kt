package subProj_540

import subProj_540.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_540")
    name = "subProj 540"

    buildType(subProj_bt_540_3)
    buildType(subProj_bt_540_4)
    buildType(subProj_bt_540_5)
    buildType(subProj_bt_540_0)
    buildType(subProj_bt_540_1)
    buildType(subProj_bt_540_2)
})

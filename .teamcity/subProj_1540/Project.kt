package subProj_1540

import subProj_1540.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1540")
    name = "subProj 1540"

    buildType(subProj_bt_1540_1)
    buildType(subProj_bt_1540_0)
    buildType(subProj_bt_1540_5)
    buildType(subProj_bt_1540_4)
    buildType(subProj_bt_1540_3)
    buildType(subProj_bt_1540_2)
})

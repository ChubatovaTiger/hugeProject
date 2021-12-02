package subProj_117

import subProj_117.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_117")
    name = "subProj 117"

    buildType(subProj_bt_117_3)
    buildType(subProj_bt_117_4)
    buildType(subProj_bt_117_1)
    buildType(subProj_bt_117_2)
    buildType(subProj_bt_117_0)
    buildType(subProj_bt_117_5)
})

package subProj_601

import subProj_601.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_601")
    name = "subProj 601"

    buildType(subProj_bt_601_5)
    buildType(subProj_bt_601_1)
    buildType(subProj_bt_601_2)
    buildType(subProj_bt_601_3)
    buildType(subProj_bt_601_4)
    buildType(subProj_bt_601_0)
})
